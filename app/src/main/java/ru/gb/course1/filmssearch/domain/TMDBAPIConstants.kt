package ru.gb.course1.filmssearch.domain

object TMDBAPIConstants {

    /** API KEY  V3 */
    val API_KEY_V3 = "b09e049a4f2b3d0137bb179ee63e5629"

    /** Server endpoint  адрес базового размещеия графического материала  */
    val IMAGE_SERVER_URL = "https://image.tmdb.org/t/p/"

    /** Poster size - разрешение постера  */
    val POSTER_SIZE = "w500"

    /** language answer - язык ответа  */
    val LANGUAGE_ANSWER = "ru_RU"

    /** временно полный запрос к гостевым выдачам */
    val TEMP_POPULAR_MOVIE = "https://api.themoviedb.org/3/movie/popular?api_key=b09e049a4f2b3d0137bb179ee63e5629&language&language=ru-RU"
    /** временно полный запрос к конфигурационным данным */
    val TEMP_GETCONFIGURAT = "https://api.themoviedb.org/3/configuration?api_key=b09e049a4f2b3d0137bb179ee63e5629&language"
}