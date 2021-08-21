package com.example.crowth.ui.netofnets

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.crowth.R
import com.example.crowth.databinding.FragmentNetOfNetsBinding
import com.example.crowth.ui.utils.viewBinding

class NetOfNetsFragment : Fragment(R.layout.fragment_net_of_nets) {

    private val netOfNetsViewModel: NetOfNetsViewModel by viewModels()
    private val binding: FragmentNetOfNetsBinding by viewBinding(FragmentNetOfNetsBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        netOfNetsViewModel.text.observe(viewLifecycleOwner, {
            binding.text.text = it
        })
    }

}