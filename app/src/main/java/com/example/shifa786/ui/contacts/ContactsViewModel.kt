package com.example.shifa786.ui.contacts

import androidx.lifecycle.ViewModel
import com.example.shifa786.ui.home.HomeAdapter
import com.example.shifa786.ui.home.HomeOptions

class ContactsViewModel : ViewModel() {

    val contacts = mutableListOf(
        Contacts("Ayaan"),
        Contacts("Fatima"),
        Contacts("Zayan"),
        Contacts("Ayesha"),
        Contacts("Anas")
    )
    val adapter = ContactsAdapter(contacts,this)
}