package com.example.recyclerviewnew

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)

        recyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        val animals1 = listOf(
            Animal("Granny Wolf", R.drawable.granny_wolf),
            Animal("Granny Wolf", R.drawable.granny_wolf),
            Animal("Granny Wolf", R.drawable.granny_wolf),
            Animal("Granny Wolf", R.drawable.granny_wolf)
        )

        val adapter = AnimalAdapter(animals1)
        recyclerView.adapter = adapter


        val recyclerView2: RecyclerView = findViewById(R.id.recyclerViewBottom)

        recyclerView2.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        val animalstories = listOf(
            AnimalStory(
                "Even though he's male, he's taken to wearing a silk scarf that he found somewhere and learned to tie from watching humans.",
                R.drawable.snow_leopard
            ),
            AnimalStory(
                "Even though he's male, he's taken to wearing a silk scarf that he found somewhere and learned to tie from watching humans.",
                R.drawable.snow_leopard
            ),

            AnimalStory(
                "Even though he's male, he's taken to wearing a silk scarf that he found somewhere and learned to tie from watching humans.",
                R.drawable.snow_leopard
            ),

            AnimalStory(
                "Even though he's male, he's taken to wearing a silk scarf that he found somewhere and learned to tie from watching humans.",
                R.drawable.snow_leopard
            ),

            AnimalStory(
                "Even though he's male, he's taken to wearing a silk scarf that he found somewhere and learned to tie from watching humans.",
                R.drawable.snow_leopard
            ),
            AnimalStory(
                "Even though he's male, he's taken to wearing a silk scarf that he found somewhere and learned to tie from watching humans.",
                R.drawable.snow_leopard
            ),

            AnimalStory(
                "Even though he's male, he's taken to wearing a silk scarf that he found somewhere and learned to tie from watching humans.",
                R.drawable.snow_leopard
            ),

            )
        val animalStoryAdapter = AnimalStoryAdapter(animalstories)
        recyclerView2.adapter = animalStoryAdapter
    }
}