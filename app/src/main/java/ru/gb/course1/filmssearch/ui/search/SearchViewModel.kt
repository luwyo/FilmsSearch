package ru.gb.course1.filmssearch.ui.search

import android.app.Application
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ru.gb.course1.filmssearch.domain.CallBack
import ru.gb.course1.filmssearch.domain.MovieTMDB
import ru.gb.course1.filmssearch.domain.MoviesResponseTMDB
import ru.gb.course1.filmssearch.domain.TestMoviesRepository

class SearchViewModel(
    private val app: Application,
    private val repository: TestMoviesRepository
) : ViewModel() {
    val searchMovieLiveData = MutableLiveData<MoviesResponseTMDB>()
    var prepareListMovie = ArrayList<MovieTMDB>()
    private var currentSearchTitle: String = ""
    private var currentPage: Int = 1

    fun fetchData(searchTitle: String) {
        if (searchTitle != currentSearchTitle) {
            this.currentSearchTitle = searchTitle
            currentPage = 1
        } else {
            currentPage++
        }
        repository.getDiscoveredMovies(
            currentSearchTitle,
            currentPage,
            object : CallBack<MoviesResponseTMDB> {
                override fun onResult(value: MoviesResponseTMDB) {
                    searchMovieLiveData.postValue(value)
                    prepareListMovie.addAll(value.results!!)
                }
            })
    }
}