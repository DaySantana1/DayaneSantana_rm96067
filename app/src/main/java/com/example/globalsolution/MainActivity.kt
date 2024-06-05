package com.example.globalsolution

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var itemAdapter: ItemAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        itemAdapter = ItemAdapter(mutableListOf())
        recyclerView.adapter = itemAdapter

        val editTextText = findViewById<EditText>(R.id.editTextText)
        val editTextText2 = findViewById<EditText>(R.id.editTextText2)
        val editTextText3 = findViewById<EditText>(R.id.editTextText3)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            val nomePraia = editTextText.text.toString()
            val cidade = editTextText2.text.toString()
            val estado = editTextText3.text.toString()

            if (nomePraia.isNotEmpty() && cidade.isNotEmpty() && estado.isNotEmpty()) {
                val newItem = Item(nomePraia, cidade, estado)
                itemAdapter.addItem(newItem)

                editTextText.text.clear()
                editTextText2.text.clear()
                editTextText3.text.clear()
            }
        }
    }
}
