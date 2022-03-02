package ru.gb.course1.filmssearch.ui.ratings

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import ru.gb.course1.filmssearch.domain.TestMoviesRepository

class RatingsViewModelFactory(private val application: Application) :
    ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T =
        RatingsViewModel(application, TestMoviesRepository()) as T
}