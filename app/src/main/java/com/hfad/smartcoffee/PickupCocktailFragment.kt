package com.hfad.smartcoffee

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.hfad.smartcoffee.databinding.FragmentPickupCocktailBinding


class PickupCocktailFragment : Fragment() {

    private var binding: FragmentPickupCocktailBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragmentBinding = FragmentPickupCocktailBinding.inflate(inflater, container, false)
        binding = fragmentBinding
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.pickupCocktailFragment = this@PickupCocktailFragment
    }

    fun goToNextScreen() {

    }

    fun orderCancellation(){
        findNavController().navigate(R.id.action_pickupCocktailFragment_to_startFragment2)
    }
}
