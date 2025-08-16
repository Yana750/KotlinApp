package com.example.myapplication2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ItemsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_items)

        val itemsList: RecyclerView = findViewById(R.id.itemsList)
        var items = arrayListOf<Item>()

        items.add(Item(1, "sofa", "Диван", "Описание товара", "Описание товара", 399))
        items.add(Item(2, "light", "Свет", "Описание товара", "Описание товара", 1999))
        items.add(Item(3, "kitchen", "Кухня", "Описание товара", "Описание товара", 29999))

        itemsList.layoutManager = LinearLayoutManager(this)
        itemsList.adapter = ItemsAdapter(items, this)
    }
}