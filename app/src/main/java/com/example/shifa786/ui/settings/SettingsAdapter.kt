package com.example.shifa786.ui.settings

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.shifa786.databinding.ItemHomeBinding
import com.example.shifa786.databinding.ItemSettingsBinding


class SettingsAdapter(val list: MutableList<Settings>, val viewModel: SettingsViewModel) :
    RecyclerView.Adapter<SettingsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        SettingsViewHolder(
            ItemSettingsBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )


    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: SettingsViewHolder, position: Int) {
        holder.bind(list[position],viewModel)
    }

}