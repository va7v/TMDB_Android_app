package r_studyproject.tmdbapp

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import r_studyproject.tmdbapp.databinding.FragmentRandomFilmBinding
import r_studyproject.tmdbapp.databinding.FragmentRootBinding

class RandomFragment : Fragment(R.layout.fragment_random_film) {

    private lateinit var binding: FragmentRandomFilmBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentRandomFilmBinding.bind(view)

        // Details

    }
}