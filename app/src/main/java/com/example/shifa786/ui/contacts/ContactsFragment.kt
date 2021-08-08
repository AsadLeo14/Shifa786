package com.example.shifa786.ui.contacts

import android.os.Bundle
import android.view.View
import androidx.fragment.app.activityViewModels
import com.example.shifa786.BaseFragment
import com.example.shifa786.R
import com.example.shifa786.databinding.FragmentContactsBinding


class ContactsFragment : BaseFragment<FragmentContactsBinding>(){

    private val contactsViewModel: ContactsViewModel by activityViewModels()

    override fun getFragmentLayout() = R.layout.fragment_contacts

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewModel = contactsViewModel
    }


}