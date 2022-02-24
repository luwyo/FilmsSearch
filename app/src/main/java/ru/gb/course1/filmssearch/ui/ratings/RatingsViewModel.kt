package ru.gb.course1.filmssearch.ui.ratings

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ru.gb.course1.filmssearch.domain.CallBack
import ru.gb.course1.filmssearch.domain.ListMovies
import ru.gb.course1.filmssearch.domain.TestMoviesRepository

class RatingsViewModel : ViewModel() {

    private val repository: TestMoviesRepository = TestMoviesRepository()
    val ratingBasicStructureLiveData = MutableLiveData<ArrayList<ListMovies>>()

    fun fetchData() {
        repository.getRatingFragmentStructure(object : CallBack<ArrayList<ListMovies>> {
            override fun onResult(value: ArrayList<ListMovies>) {
                ratingBasicStructureLiveData.postValue(value)
            }
        })
    }

    fun fetchDataListById(_idList: String): ArrayList<String> {
        var value1: ArrayList<String> = ArrayList()
        repository.getListMovieById(_idList, object : CallBack<ArrayList<String>> {
            override fun onResult(value: ArrayList<String>) {
                value1 = value
            }
        })
        return value1
    }
}