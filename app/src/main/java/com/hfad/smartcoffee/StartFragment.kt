package com.hfad.smartcoffee

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.hfad.smartcoffee.databinding.FragmentStartBinding
import com.hfad.smartcoffee.model.OrderViewModel


class StartFragment : Fragment() {

    private var binding: FragmentStartBinding? = null
    private val sharedViewModel: OrderViewModel by activityViewModels()

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

    fun orderProduct(name: String) {
        sharedViewModel.setProduct(name)
        if (name == "Лимонад") findNavController().navigate(R.id.action_startFragment2_to_cocktailFragment)
        if (name == "Мороженое") findNavController().navigate(R.id.action_startFragment2_to_iceFragment)
        if (name == "Торт") findNavController().navigate(R.id.action_startFragment2_to_cakeFragment)
        if (name == "Кофе") findNavController().navigate(R.id.action_startFragment2_to_coffeeFragment2)
    }
}