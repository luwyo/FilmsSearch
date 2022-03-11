package ru.gb.course1.filmssearch.domain.interfaceAPI

import retrofit2.Call
import retrofit2.http.GET
import ru.gb.course1.filmssearch.domain.TestMovie

interface RetrofitServicesTest {
    @GET("eternals")
    fun getMovieList(): Call<MutableList<TestMovie>>
}