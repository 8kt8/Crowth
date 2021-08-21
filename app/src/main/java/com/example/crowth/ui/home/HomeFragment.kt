package com.example.crowth.ui.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.crowth.R
import com.example.crowth.databinding.FragmentHomeBinding
import com.example.crowth.ui.utils.viewBinding

class HomeFragment : Fragment(R.layout.fragment_home) {

    private val homeViewModel: HomeViewModel by viewModels()
    private val binding: FragmentHomeBinding by viewBinding(FragmentHomeBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        homeViewModel.text.observe(viewLifecycleOwner, {
            binding.textHome.text = it
        })
    }
}