package com.example.recyclerviewnew

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class AnimalStoryAdapter(private val animalStories: List<AnimalStory>) :
    RecyclerView.Adapter<AnimalStoryAdapter.AnimalStoryViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AnimalStoryAdapter.AnimalStoryViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.second_item_layout, parent, false)
        return AnimalStoryViewHolder(view)
    }

    override fun onBindViewHolder(holder: AnimalStoryAdapter.AnimalStoryViewHolder, position: Int) {
        val items1 = animalStories[position]
        holder.bind(items1)
    }

    override fun getItemCount() = animalStories.size
    inner class AnimalStoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val animalImage: ImageView = itemView.findViewById(R.id.animalImageBottom)
        private val animalStory: TextView = itemView.findViewById(R.id.animalStory)

        fun bind(items1: AnimalStory) {
            animalImage.setImageResource(items1.ImageResId2)
            animalStory.text = items1.story
        }

    }
}