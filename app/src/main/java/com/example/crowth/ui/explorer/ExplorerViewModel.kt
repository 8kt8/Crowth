package com.example.crowth.ui.explorer

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.crowth.ui.explorer.jobList.JobOfferItem
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ExplorerViewModel @Inject constructor(
    jobListProvider: JobOfferItemsProvider
) : ViewModel() {

    private val _jobOffers = MutableLiveData<List<JobOfferItem>>().apply {
        value = jobListProvider.provide()
    }
    val jobOffers: LiveData<List<JobOfferItem>> = _jobOffers
}