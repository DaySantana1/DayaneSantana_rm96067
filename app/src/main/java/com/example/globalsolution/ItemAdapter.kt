package com.example.globalsolution

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter(private val itemList: MutableList<Item>) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nomePraiaTextView: TextView = itemView.findViewById(R.id.nomePraiaTextView)
        val deleteButton: Button = itemView.findViewById(R.id.deleteButton)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = itemList[position]
        val itemText = "${item.nomePraia}, ${item.cidade}, ${item.estado}"
        holder.nomePraiaTextView.text = itemText

        holder.deleteButton.setOnClickListener {
            itemList.removeAt(position)
            notifyItemRemoved(position)
            notifyItemRangeChanged(position, itemList.size)
        }
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    fun addItem(item: Item) {
        itemList.add(item)
        notifyItemInserted(itemList.size - 1)
    }
}
