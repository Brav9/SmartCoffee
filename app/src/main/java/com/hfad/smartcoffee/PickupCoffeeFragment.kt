package com.hfad.smartcoffee

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.hfad.smartcoffee.databinding.FragmentPickupCocktailBinding
import com.hfad.smartcoffee.databinding.FragmentPickupCoffeeBinding
import com.hfad.smartcoffee.model.OrderViewModel


class PickupCoffeeFragment : Fragment() {

    private var binding: FragmentPickupCoffeeBinding? = null
    private val sharedViewModel: OrderViewModel by activityViewModels()

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
        binding?.apply {
            lifecycleOwner = viewLifecycleOwner
            viewModel = sharedViewModel
            pickupCoffeeFragment = this@PickupCoffeeFragment
        }
    }

    fun goToNextScreen() {
        findNavController().navigate(R.id.action_pickupCoffeeFragment_to_summaryFragment)
    }

    fun orderCancellation() {
        sharedViewModel.resetOrder()
        findNavController().navigate(R.id.action_pickupCoffeeFragment_to_startFragment2)
    }
}



