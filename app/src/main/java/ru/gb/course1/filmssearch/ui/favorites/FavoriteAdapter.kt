package ru.gb.course1.filmssearch.ui.favorites

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.gb.course1.filmssearch.R

class FavoriteAdapter : RecyclerView.Adapter<FavoriteViewHolder>() {
    var items: ArrayList<String> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavoriteViewHolder {
        val root =
            LayoutInflater.from(parent.context).inflate(R.layout.item_favorites, parent, false)
        return FavoriteViewHolder(root)
    }

    override fun onBindViewHolder(holder: FavoriteViewHolder, position: Int) {
        var item = items.get(position)
        holder.textViewNameFavoritesMovie.text = item
        holder.textViewGenresFavoritesMovie.text = "Какой-то жанр, Драма, Дорама"
        holder.textViewRatingFavoritesMovie.text = "8,1"
        holder.textViewReleaseDataFavoritesMovie.text = "2020 И еще что-то там..."
    }

    override fun getItemCount(): Int {
        return items.size
    }
}