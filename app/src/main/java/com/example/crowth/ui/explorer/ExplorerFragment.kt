package com.example.crowth.ui.explorer

import android.annotation.SuppressLint
import android.app.Activity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.crowth.R
import com.example.crowth.databinding.FragmentExplorerBinding
import com.example.crowth.databinding.ItemJobCardBinding
import com.example.crowth.ui.explorer.jobList.JobListAdapter
import com.example.crowth.ui.explorer.jobList.JobOfferItem
import com.example.crowth.ui.utils.viewBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ExplorerFragment : Fragment(R.layout.fragment_explorer) {

    private val explorerViewModel: ExplorerViewModel by viewModels()
    private val binding: FragmentExplorerBinding by viewBinding(FragmentExplorerBinding::bind)
    private val jobListAdapter: JobListAdapter by lazy { JobListAdapter(::onItemClicked) }

    @SuppressLint("ClickableViewAccessibility")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding){
            lifecycleOwner = viewLifecycleOwner
            adapter = jobListAdapter
            viewModel = explorerViewModel
            searchView.queryHint = requireContext().getString(R.string.search_hint)
            rootLayout.setOnTouchListener { _, _ ->
                hideKeyboard()
                false
            }
            with(recyclerView){
                layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
                setHasFixedSize(true)
                enableSnapping(false)
            }
        }
    }

    private fun onItemClicked(jobOfferItem: JobOfferItem, itemJobCardBinding: ItemJobCardBinding) {
        Toast.makeText(requireContext(), "Item ${jobOfferItem.id} was clicked", Toast.LENGTH_SHORT).show()
    }

    private fun hideKeyboard() {
        val imm = requireContext().getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(binding.searchView.windowToken, 0)
    }
}