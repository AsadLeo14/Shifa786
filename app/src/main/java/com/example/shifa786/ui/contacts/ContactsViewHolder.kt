package com.example.shifa786.ui.contacts

import androidx.recyclerview.widget.RecyclerView
import com.example.shifa786.databinding.ItemContactsBinding
import com.example.shifa786.databinding.ItemHomeBinding

class ContactsViewHolder(
    val binding: ItemContactsBinding,
) : RecyclerView.ViewHolder(binding.root) {
    fun bind(
        model: Contacts,
        viewModel: ContactsViewModel
    ) {
        binding.model = model
        binding.viewModel = viewModel
        binding.executePendingBindings()
    }


}