package ru.gb.course1.filmssearch.model



import ru.gb.course1.filmssearch.R

class RepositoryImpl : Repository {
    override fun getFilmsFromServer(): List<Film> {
        val films: ArrayList<Film> = ArrayList()
        films.add(
            Film(
                name = "Вечные",
                data = "08.11.2021",
                rang = 6.9,
                pathOfImage = R.drawable.eternals
            )
        )
        return films
    }
}