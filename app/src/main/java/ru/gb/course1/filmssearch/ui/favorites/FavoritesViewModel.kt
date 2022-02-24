package ru.gb.course1.filmssearch.ui.favorites


import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ru.gb.course1.filmssearch.domain.CallBack
import ru.gb.course1.filmssearch.domain.TestMoviesRepository

class FavoritesViewModel : ViewModel() {

    private val repository: TestMoviesRepository = TestMoviesRepository()
    val favoritesMovieLiveData = MutableLiveData<ArrayList<String>>()

    fun fetchData() {
        repository.getFavoriteList(object : CallBack<ArrayList<String>> {
            override fun onResult(value: ArrayList<String>) {
                favoritesMovieLiveData.postValue(value)
            }
        })
    }
}