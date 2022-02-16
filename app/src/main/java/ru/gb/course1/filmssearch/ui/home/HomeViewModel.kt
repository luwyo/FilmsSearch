package ru.gb.course1.filmssearch.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = " Это стартовый фрагмент\n Здесь будут отображены несколько лент-подборок \n " +
                " фильмов согласно предпочтений пользователя, зафиксированные пользователе." +
                " Должна быть отдельно реализована возможность сортировки по свобственному рейтингу. \n" +
                " должна быть реализована функция добавления фильма в избранное, \n" +
                " присвоение собственного рейтинга и комментария"
    }
    val text: LiveData<String> = _text
}
