package com.hfad.smartcoffee

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.hfad.smartcoffee.databinding.FragmentStartBinding


class StartFragment : Fragment() {

    private var binding: FragmentStartBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragmentBinding = FragmentStartBinding.inflate(inflater, container, false)
        binding = fragmentBinding
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.startFragment = this
    }

    fun orderProduct(number: Int) {
        if (number == 1) findNavController().navigate(R.id.action_startFragment2_to_cocktailFragment)
        if (number == 2) findNavController().navigate(R.id.action_startFragment2_to_iceFragment)
        if (number == 3) findNavController().navigate(R.id.action_startFragment2_to_cakeFragment)
        if (number == 4) findNavController().navigate(R.id.action_startFragment2_to_coffeeFragment2)
    }
}