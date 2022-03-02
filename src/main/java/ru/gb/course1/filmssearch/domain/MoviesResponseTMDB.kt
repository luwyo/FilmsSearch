package ru.gb.course1.filmssearch.domain

data class MoviesResponseTMDB(
    val page: Int = 0,
    var results: ArrayList<MovieTMDB>? = null,
    val total_pages: Int = 0,
    val total_results: Int = 0
)