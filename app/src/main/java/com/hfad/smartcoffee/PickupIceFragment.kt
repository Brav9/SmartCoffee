package com.hfad.smartcoffee

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.hfad.smartcoffee.databinding.FragmentPickupCoffeeBinding
import com.hfad.smartcoffee.databinding.FragmentPickupIceBinding
import com.hfad.smartcoffee.model.OrderViewModel


class PickupIceFragment : Fragment() {

    private var binding: FragmentPickupIceBinding? = null
    private val sharedViewModel: OrderViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragmentBinding = FragmentPickupIceBinding.inflate(inflater, container, false)
        binding = fragmentBinding
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.apply {
            lifecycleOwner = viewLifecycleOwner
            viewModel = sharedViewModel
            pickupIceFragment = this@PickupIceFragment
        }
    }

    fun goToNextScreen() {
        findNavController().navigate(R.id.action_pickupIceFragment_to_summaryFragment)
    }

    fun orderCancellation() {
        sharedViewModel.resetOrder()
        findNavController().navigate(R.id.action_pickupIceFragment_to_startFragment2)
    }
}


