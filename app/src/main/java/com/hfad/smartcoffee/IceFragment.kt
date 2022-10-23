package com.hfad.smartcoffee

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.hfad.smartcoffee.databinding.FragmentCoffeeBinding
import com.hfad.smartcoffee.databinding.FragmentIceBinding
import com.hfad.smartcoffee.model.OrderViewModel


class IceFragment : Fragment() {

    private var binding: FragmentIceBinding? = null
    private val sharedViewModel: OrderViewModel by activityViewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragmentBinding = FragmentIceBinding.inflate(inflater, container, false)
        binding = fragmentBinding
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.iceFragment = this@IceFragment
    }

    fun quantityCake(quantity: Int) {
        sharedViewModel.setQuantity(quantity)
        findNavController().navigate(R.id.action_iceFragment_to_pickupIceFragment)
    }

    fun orderCancellation(){
        findNavController().navigate(R.id.action_iceFragment_to_startFragment2)
    }
}