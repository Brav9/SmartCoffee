package com.hfad.smartcoffee

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.hfad.smartcoffee.databinding.FragmentCoffeeBinding
import com.hfad.smartcoffee.databinding.FragmentPickupCakeBinding
import com.hfad.smartcoffee.model.OrderViewModel


class PickupCakeFragment : Fragment() {

    private var binding: FragmentPickupCakeBinding? = null
    private val sharedViewModel: OrderViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragmentBinding = FragmentPickupCakeBinding.inflate(inflater, container, false)
        binding = fragmentBinding
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.apply {
            lifecycleOwner = viewLifecycleOwner
            viewModel = sharedViewModel
            pickupCakeFragment = this@PickupCakeFragment
        }
    }

    fun goToNextScreen() {
        findNavController().navigate(R.id.action_pickupCakeFragment_to_summaryFragment)

    }

    fun orderCancellation(){
        sharedViewModel.resetOrder()
        findNavController().navigate(R.id.action_pickupCakeFragment_to_startFragment2)
    }
}