package ru.gb.course1.filmssearch.view_model

import ru.gb.course1.filmssearch.model.Film

sealed class AppState {
    data class Success(val filmsData: List<Film>) : AppState()
    data class Error(val error: Throwable) : AppState()
    object Loading : AppState()
}