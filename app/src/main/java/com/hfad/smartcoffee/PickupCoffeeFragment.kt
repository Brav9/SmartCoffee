package com.hfad.smartcoffee

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.hfad.smartcoffee.databinding.FragmentPickupCocktailBinding
import com.hfad.smartcoffee.databinding.FragmentPickupCoffeeBinding


class PickupCoffeeFragment : Fragment() {

    private var binding: FragmentPickupCoffeeBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragmentBinding = FragmentPickupCoffeeBinding.inflate(inflater, container, false)
        binding = fragmentBinding
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.pickupCoffeeFragment = this@PickupCoffeeFragment
    }

    fun goToNextScreen() {
        findNavController().navigate(R.id.action_pickupCoffeeFragment_to_summaryFragment)
    }

    fun orderCancellation() {
        findNavController().navigate(R.id.action_pickupCoffeeFragment_to_startFragment2)
    }
}


