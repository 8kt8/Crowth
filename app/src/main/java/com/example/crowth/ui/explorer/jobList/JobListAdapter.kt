package com.example.crowth.ui.explorer.jobList

import com.example.crowth.R
import com.example.crowth.databinding.ItemJobCardBinding
import com.example.crowth.ui.binding.BindingListAdapter

class JobListAdapter(onItemClickListener: (JobOfferItem, ItemJobCardBinding) -> Unit) :
    BindingListAdapter<JobOfferItem, ItemJobCardBinding>(onItemClickListener) {

    override fun getLayoutId(viewType: Int): Int = R.layout.item_job_card

}