package ru.gb.course1.filmssearch.ui.moredetailed

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.squareup.picasso.Picasso
import ru.gb.course1.filmssearch.R
import ru.gb.course1.filmssearch.databinding.FragmentMoreDetailedBinding
import ru.gb.course1.filmssearch.domain.MovieTMDB
import ru.gb.course1.filmssearch.domain.TMDBAPIConstants

class MoreDetailedFragment : Fragment() {
    private val moreDetailedViewModel: MoreDetailedViewModel by viewModels {
        MoreDetailedViewModelFactory(requireActivity().application)
    }
    private var _binding: FragmentMoreDetailedBinding? = null
    private val binding get() = _binding!!

    private lateinit var movie: MovieTMDB
    private lateinit var textViewNameMovie: TextView             // Региональное наименование фильма
    private lateinit var textViewOrigNameMovieAndData: TextView  // Оригинальное наименование и (ГГГГ)
    private lateinit var imageViewPoster: ImageView              // постер
    private lateinit var textViewDuration: TextView              // длительность мин.
    private lateinit var textViewRating: TextView                // рейтинг образец: 8,5 (7183)
    private lateinit var tetextViewBudget: TextView              // Бюджет образец: 1 234 567 890 $
    private lateinit var textViewRevenue: TextView               // Сборы: образец: 1 234 567 890 $
    private lateinit var textViewReleaseData: TextView           // Дата релиза образец: (2018-12-06)
    private lateinit var textView: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMoreDetailedBinding.inflate(inflater, container, false)
        val root: View = binding.root

        textView = binding.textMoreDetailed
        textViewNameMovie = binding.textViewMoreDetailNameMovie
        textViewOrigNameMovieAndData = binding.textViewMoreDetailOrigNameMovieAndData
        imageViewPoster = binding.imageViewPoster
        textViewDuration = binding.textViewMoreDetailDuration
        textViewRating = binding.textViewMoreDetailRating
        tetextViewBudget = binding.textViewMoreDetailBudget
        textViewRevenue = binding.textViewMoreDetailRevenue
        textViewReleaseData = binding.textViewMoreDetailReleaseData
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        movie = arguments?.getParcelable("ARG_MOVIE")!!
        textViewNameMovie.text = movie.title
        var currentReleaseData = "0000"
        if (!movie.release_date.isNullOrBlank()) {
            currentReleaseData = movie.release_date!!.trim().substring(0, 4)
        }
        (movie.original_title + " (" + currentReleaseData + ")").also {
            textViewOrigNameMovieAndData.text = it
        }
        Picasso.get()
            .load(String.format(TMDBAPIConstants.POSTER_URL, movie.poster_path))
            .placeholder(R.drawable.pholder)
            .error(R.drawable.err404)
            .resize(500, 750)
            .centerCrop()
            .into(imageViewPoster)
        textViewDuration.text = "загрузка..."
        (movie.vote_average.toString() + " (" + movie.vote_count.toString() + ")").also {
            textViewRating.text = it
        }
        tetextViewBudget.text = "загрузка..."
        textViewRevenue.text = "загрузка..."
        ("(" + movie.release_date + ")").also { textViewReleaseData.text = it }
        textView.text = movie.overview
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}