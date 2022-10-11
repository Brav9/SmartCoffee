package com.hfad.smartcoffee

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.hfad.smartcoffee.databinding.FragmentCoffeeBinding


class CoffeeFragment : Fragment() {

    private var binding: FragmentCoffeeBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragmentBinding = FragmentCoffeeBinding.inflate(inflater, container, false)
        binding = fragmentBinding
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.coffeeFragment = this@CoffeeFragment
    }

    fun goToNextScreen() {
        findNavController().navigate(R.id.action_coffeeFragment_to_pickupCoffeeFragment)
    }

    fun orderCancellation(){
        findNavController().navigate(R.id.action_coffeeFragment_to_startFragment2)
    }
}