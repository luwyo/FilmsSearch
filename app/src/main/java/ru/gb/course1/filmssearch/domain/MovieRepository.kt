package ru.gb.course1.filmssearch.domain

interface MovieRepository {
    fun getFilmsFromServer(): List<Movie>
}