package ru.gb.course1.filmssearch.ui.search

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ru.gb.course1.filmssearch.domain.CallBack
import ru.gb.course1.filmssearch.domain.TestMoviesRepository

class SearchViewModel : ViewModel() {
    private val repository: TestMoviesRepository = TestMoviesRepository()
    val searchMovieLiveData = MutableLiveData<ArrayList<String>>()

    fun fetchData() {
        // вместо поисковой фразы пока пустая строка
        repository.getSearchList("", object : CallBack<ArrayList<String>> {
            override fun onResult(value: ArrayList<String>) {
                searchMovieLiveData.postValue(value)
            }
        })
    }
}