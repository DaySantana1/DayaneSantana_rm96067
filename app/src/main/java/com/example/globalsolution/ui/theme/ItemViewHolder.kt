package com.example.globalsolution.ui.theme

import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.globalsolution.R

class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val textViewNomePraia: TextView = itemView.findViewById(R.id.textViewNomePraia)
    val textViewCidadeEstado: TextView = itemView.findViewById(R.id.textViewCidadeEstado)
}
