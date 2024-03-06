package com.example.viewmodelexampleapp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel(private val predefinedValue: Int) : ViewModel() {
    var count = MutableLiveData<Int>()
    var inputText = MutableLiveData<String>()

    init {
        inputText.value = predefinedValue.toString()
        count.value = predefinedValue
    }

    fun updateCountValue() {
        count.value = (count.value)?.plus(inputText.value!!.toInt())
    }
}