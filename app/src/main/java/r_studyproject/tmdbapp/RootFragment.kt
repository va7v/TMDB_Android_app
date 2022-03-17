package r_studyproject.tmdbapp

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import r_studyproject.tmdbapp.databinding.FragmentRootBinding

class RootFragment : Fragment(R.layout.fragment_root) {

    private lateinit var binding: FragmentRootBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentRootBinding.bind(view)
        binding.openRandom.setOnClickListener {
            openBox()
        }
        binding.openTop.setOnClickListener {

        }
    }
    private fun openBox() {
        findNavController().navigate(R.id.action_rootFragment_to_randomFragment)
    }
}