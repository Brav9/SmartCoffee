package com.hfad.smartcoffee.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.text.SimpleDateFormat
import java.util.*

private const val PRICE_ONE_CAKE = 220.00
private const val PRICE_ONE_COCKTAIL = 120.00
private const val PRICE_ONE_COFFEE = 180.00
private const val PRICE_ONE_ICE = 190.00
private const val PRICE_FOR_SOME_DAY_PICKUP = 100.00

class OrderViewModel : ViewModel() {

    private val _product = MutableLiveData<String>()
    val product: LiveData<String> = _product

    private val _quantity = MutableLiveData<Int>()
    val quantity: LiveData<Int> = _quantity

    private val _date = MutableLiveData<String>()
    val date: LiveData<String> = _date

    private val _price = MutableLiveData<Double>()
    val price: LiveData<Double> = _price

    val dateOptions = getPickupOptions()

    init {
        resetOrder()
    }

    private fun getPickupOptions(): List<String> {
        val options = mutableListOf<String>()
        val formatter = SimpleDateFormat("E MMM d", Locale.getDefault())
        val calendar = Calendar.getInstance()
        repeat(3) {
            options.add(formatter.format(calendar.time))
            calendar.add(Calendar.DATE, 1)
        }
        return options
    }

    fun resetOrder() {
        _product.value = ""
        _quantity.value = 0
        _date.value = dateOptions[0]
        _price.value = 0.00
    }
}