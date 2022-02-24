package ru.gb.course1.filmssearch.ui.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ru.gb.course1.filmssearch.domain.CallBack
import ru.gb.course1.filmssearch.domain.ListMovies
import ru.gb.course1.filmssearch.domain.TestMoviesRepository

class HomeViewModel : ViewModel() {

    private val repository: TestMoviesRepository = TestMoviesRepository()
    val homeBasicStructureLiveData = MutableLiveData<ArrayList<ListMovies>>()

    fun fetchData() {
        repository.getHomeFragmentStructure(object : CallBack<ArrayList<ListMovies>> {
            override fun onResult(value: ArrayList<ListMovies>) {
                homeBasicStructureLiveData.postValue(value)
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