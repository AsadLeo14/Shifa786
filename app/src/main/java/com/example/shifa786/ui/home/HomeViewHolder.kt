package com.example.shifa786.ui.home

import androidx.recyclerview.widget.RecyclerView
import com.example.shifa786.databinding.ItemHomeBinding

class HomeViewHolder(
    val binding: ItemHomeBinding,
) : RecyclerView.ViewHolder(binding.root) {
    fun bind(
        model: HomeOptions,
        viewModel: HomeViewModel
    ) {
        binding.model = model
        binding.viewModel = viewModel
        binding.executePendingBindings()
    }


}