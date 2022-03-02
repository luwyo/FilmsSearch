package ru.gb.course1.filmssearch.ui.about

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import ru.gb.course1.filmssearch.domain.TestMoviesRepository

class AboutViewModelFactory(private val application: Application) :
    ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T =
        AboutViewModel(application, TestMoviesRepository()) as T
}