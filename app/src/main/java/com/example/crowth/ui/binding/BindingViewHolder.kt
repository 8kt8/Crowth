package com.example.crowth.ui.binding
import com.example.crowth.BR

import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

open class BindingViewHolder<Item, Binding : ViewDataBinding>(
    val binding: Binding
) : RecyclerView.ViewHolder(binding.root) {
    fun bind(item: Item) {
        binding.setVariable(BR.item, item)
        binding.executePendingBindings()
    }
}