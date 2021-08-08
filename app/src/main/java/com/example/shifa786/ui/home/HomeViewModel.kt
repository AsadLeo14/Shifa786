package com.example.shifa786.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    val _title = MutableLiveData<String>()
    val title: LiveData<String> = _title

    val homeOptions = mutableListOf(
        HomeOptions("Names Of God"),
        HomeOptions("Tawassol"),
        HomeOptions("Cure to Physical Diseases"),
        HomeOptions("Cure to Mental Illnesses"),
        HomeOptions("Cure to Spiritual Diseases")
    )
    val adapter = HomeAdapter(homeOptions,this)
}