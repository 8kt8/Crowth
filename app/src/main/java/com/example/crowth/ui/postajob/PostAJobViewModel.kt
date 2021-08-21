package com.example.crowth.ui.postajob

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PostAJobViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is post a job Fragment"
    }
    val text: LiveData<String> = _text
}