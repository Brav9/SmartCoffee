package com.hfad.smartcoffee

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.hfad.smartcoffee.databinding.FragmentPickupCoffeeBinding
import com.hfad.smartcoffee.databinding.FragmentPickupIceBinding


class PickupIceFragment : Fragment() {

    private var binding: FragmentPickupIceBinding? = null

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
        binding?.pickupIceFragment = this@PickupIceFragment
    }

    fun goToNextScreen() {
        findNavController().navigate(R.id.action_pickupIceFragment_to_summaryFragment)
    }

    fun orderCancellation(){
        findNavController().navigate(R.id.action_pickupIceFragment_to_startFragment2)
    }
}


