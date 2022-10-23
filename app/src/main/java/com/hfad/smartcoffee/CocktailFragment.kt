package com.hfad.smartcoffee

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.hfad.smartcoffee.databinding.FragmentCakeBinding
import com.hfad.smartcoffee.databinding.FragmentCocktailBinding
import com.hfad.smartcoffee.model.OrderViewModel

class CocktailFragment : Fragment() {

    private var binding: FragmentCocktailBinding? = null
    private val sharedViewModel: OrderViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragmentBinding = FragmentCocktailBinding.inflate(inflater, container, false)
        binding = fragmentBinding
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.cocktailFragment = this@CocktailFragment
    }

    fun goToNextScreen() {
        findNavController().navigate(R.id.action_cocktailFragment_to_pickupCocktailFragment)
    }

    fun orderCancellation(){
        findNavController().navigate(R.id.action_cocktailFragment_to_startFragment2)
    }
}