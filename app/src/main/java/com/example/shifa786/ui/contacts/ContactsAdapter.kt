package com.example.shifa786.ui.contacts

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.shifa786.databinding.ItemContactsBinding


class ContactsAdapter(val list: MutableList<Contacts>, val viewModel: ContactsViewModel) :
    RecyclerView.Adapter<ContactsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ContactsViewHolder(
            ItemContactsBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )


    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        holder.bind(list[position],viewModel)
    }

}