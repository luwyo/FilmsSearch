package ru.gb.course1.filmssearch.model

interface Repository {
    fun getFilmsFromServer(): List<Film>
}