package ru.gb.course1.filmssearch.model

data class Film(
    val name: String,
    val data: String,
    val rang: Double,
    val pathOfImage: Int,
    val favorite: Boolean = false
)