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

    fun setProduct(nameProduct: String) {
        _product.value = nameProduct
        updatePrice()
    }

    fun setQuantity(numberCupcakes: Int) {
        _quantity.value = numberCupcakes
        updatePrice()
    }

    fun setDate(pickupDate: String) {
        _date.value = pickupDate
        updatePrice()
    }

    private fun updatePrice() {
        var calculatedPriceCake = (quantity.value ?: 0) * PRICE_ONE_CAKE
        var calculatedPriceCocktail = (quantity.value ?: 0) * PRICE_ONE_COCKTAIL
        var calculatedPriceCoffee = (quantity.value ?: 0) * PRICE_ONE_COFFEE
        var calculatedPriceIce = (quantity.value ?: 0) * PRICE_ONE_ICE

        if (_product.value == "Лимонад") {

        }
        _price.value = calculatedPriceCocktail


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