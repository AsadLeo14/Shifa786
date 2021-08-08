package com.example.shifa786.ui.settings

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.shifa786.util.Event

class SettingsViewModel : ViewModel() {

    private val _eventObserver = MutableLiveData<Event<SettingsEvent>>()
    val eventObserver: LiveData<Event<SettingsEvent>> = _eventObserver

    val settings = mutableListOf(
        Settings(1,"Profile"),
        Settings(2,"Change Password"),
        Settings(3,"Terms & Condition"),
        Settings(4,"Privacy Policy"),
        Settings(5,"Logout")
    )
    val adapter = SettingsAdapter(settings,this)

    fun onOptionClick(id: Int){
         when(id){
             1 -> _eventObserver.value = Event(SettingsEvent.PROFILE)
         }
    }

}