package ru.gb.course1.filmssearch.domain

interface CallBack<T> {
    fun onResult(value: T)
}