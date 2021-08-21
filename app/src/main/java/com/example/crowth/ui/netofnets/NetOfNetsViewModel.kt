package com.example.crowth.ui.netofnets

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NetOfNetsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is nets of nets Fragment"
    }
    val text: LiveData<String> = _text
}