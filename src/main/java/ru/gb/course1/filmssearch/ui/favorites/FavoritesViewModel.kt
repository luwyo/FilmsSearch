package ru.gb.course1.filmssearch.ui.favorites


import android.app.Application
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ru.gb.course1.filmssearch.domain.CallBack
import ru.gb.course1.filmssearch.domain.TestMovie
import ru.gb.course1.filmssearch.domain.TestMoviesRepository

class FavoritesViewModel(
    private val app: Application,
    private val repository: TestMoviesRepository
) : ViewModel() {
    val favoritesMovieLiveData = MutableLiveData<MutableList<TestMovie>>()

    fun fetchData() {
        repository.getFavoriteList(object : CallBack<MutableList<TestMovie>> {
            override fun onResult(value: MutableList<TestMovie>) {
                favoritesMovieLiveData.postValue(value)
            }
        })
    }
}