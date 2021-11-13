package ru.gb.course1.filmssearch.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import ru.gb.course1.filmssearch.R
import ru.gb.course1.filmssearch.model.Film
import com.google.android.material.textview.MaterialTextView

class FilmVh(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private lateinit var posterImageView: ImageView
    private lateinit var nameFilmTextView: MaterialTextView
    private lateinit var dataFilmTextView: MaterialTextView
    private lateinit var ratingFilmTextView: MaterialTextView
    private lateinit var film: Film

    constructor(parent: ViewGroup) : this(
        LayoutInflater.from(parent.context).inflate(R.layout.one_film, parent, false)
    ) {
        initialiseViews()
    }

    private fun initialiseViews() {
        posterImageView = itemView.findViewById(R.id.poster_image_view)
        nameFilmTextView = itemView.findViewById(R.id.name_film_text_view)
        dataFilmTextView = itemView.findViewById(R.id.data_film_text_view)
        ratingFilmTextView = itemView.findViewById(R.id.rating_film_text_view)
    }

    fun bind(oneFilm: Film) {
        posterImageView.setImageResource(oneFilm.pathOfImage)
        nameFilmTextView.text = oneFilm.name
        dataFilmTextView.text = oneFilm.data
        ratingFilmTextView.text = oneFilm.rang.toString()
    }
}