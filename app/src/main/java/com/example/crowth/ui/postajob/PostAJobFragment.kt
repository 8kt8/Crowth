package com.example.crowth.ui.postajob

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.crowth.R
import com.example.crowth.databinding.FragmentPostAJobBinding
import com.example.crowth.ui.utils.viewBinding

class PostAJobFragment : Fragment(R.layout.fragment_post_a_job) {

    private val postAJobViewModel: PostAJobViewModel by viewModels()
    private val binding: FragmentPostAJobBinding by viewBinding(FragmentPostAJobBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        postAJobViewModel.text.observe(viewLifecycleOwner, {
            binding.text.text = it
        })
    }
}