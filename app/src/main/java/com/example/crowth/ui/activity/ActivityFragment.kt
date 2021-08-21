package com.example.crowth.ui.activity

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.crowth.R
import com.example.crowth.databinding.FragmentActivityBinding
import com.example.crowth.ui.utils.viewBinding

class ActivityFragment : Fragment(R.layout.fragment_activity) {

    private val activityViewModel: ActivityViewModel by viewModels()
    private val binding: FragmentActivityBinding by viewBinding(FragmentActivityBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        activityViewModel.text.observe(viewLifecycleOwner, {
            binding.textHome.text = it
        })
    }
}