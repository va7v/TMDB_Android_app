package r_studyproject.tmdbapp

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import r_studyproject.tmdbapp.databinding.FragmentRandomMovieBinding

class RandomFragment : Fragment(R.layout.fragment_random_movie) {

    private lateinit var binding: FragmentRandomMovieBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentRandomMovieBinding.bind(view)

        binding.goBackButton.setOnClickListener {
            // переходим по нижней кнопке Назад. Не закрывать
            findNavController().popBackStack(R.id.rootFragment, false)
            // навигация из туулбар. Действие не выходит из приложения
            // findNavController().navigateUp(R.id.action_randomFragment_to_detailsFragment)
        }

    }
}