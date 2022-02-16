package ru.gb.course1.filmssearch.ui.about

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AboutViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "Этот фрагмент \n сообщает информацию о приложении. \n Здесь планируется разместить картинку:\n" +
                "номер версии\n" +
                "ссылку на адрес администратора\n" +
                "фио автора\n" +
                "инструкцию как с приложением работать, может еще что..."
    }
    val text: LiveData<String> = _text
}