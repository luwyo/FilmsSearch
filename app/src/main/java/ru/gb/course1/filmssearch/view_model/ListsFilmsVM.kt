package ru.gb.course1.filmssearch.view_model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ru.gb.course1.filmssearch.model.Repository
import ru.gb.course1.filmssearch.model.RepositoryImpl
import java.lang.Thread.sleep

class ListsFilmsViewModel(
    private val liveDataToObserve: MutableLiveData<AppState> = MutableLiveData(),
    private val repositoryImpl: Repository = RepositoryImpl()
) :
    ViewModel() {

    fun getLiveData() = liveDataToObserve

    fun getFilmsFromLocalSource() = getDataFromLocalSource()

    private fun getDataFromLocalSource() {
        liveDataToObserve.value = AppState.Loading
        Thread {
            sleep(3000)
            liveDataToObserve.postValue(AppState.Success(repositoryImpl.getFilmsFromServer()))
        }.start()
    }
}