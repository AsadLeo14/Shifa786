package com.example.shifa786.ui.settings

import androidx.recyclerview.widget.RecyclerView
import com.example.shifa786.databinding.ItemHomeBinding
import com.example.shifa786.databinding.ItemSettingsBinding

class SettingsViewHolder(
    val binding: ItemSettingsBinding,
) : RecyclerView.ViewHolder(binding.root) {
    fun bind(
        model: Settings,
        viewModel: SettingsViewModel
    ) {
        binding.settings = model
        binding.viewModel = viewModel
        binding.executePendingBindings()
    }




}