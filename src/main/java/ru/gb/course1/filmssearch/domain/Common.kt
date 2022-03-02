package ru.gb.course1.filmssearch.domain

import ru.gb.course1.filmssearch.domain.interfaceAPI.RetrofitServicesTMDB
import ru.gb.course1.filmssearch.domain.interfaceAPI.RetrofitServicesTest
import ru.gb.course1.filmssearch.domain.retrofit.RetrofitClient
import ru.gb.course1.filmssearch.domain.retrofit.RetrofitClientTMDB

object Common {
    private const val BASE_URL_TEST = "https://www.simplifiedcoding.net/demos/"
    private const val BASE_URL_TMDB = "https://api.themoviedb.org/"
    val retrofitServiceTest: RetrofitServicesTest
        get() {
            return RetrofitClient.getClient(BASE_URL_TEST).create(RetrofitServicesTest::class.java)
        }

    val retrofitServiceTMDB: RetrofitServicesTMDB
        get() {
            return RetrofitClientTMDB.getClient(BASE_URL_TMDB)
                .create(RetrofitServicesTMDB::class.java)
        }
}