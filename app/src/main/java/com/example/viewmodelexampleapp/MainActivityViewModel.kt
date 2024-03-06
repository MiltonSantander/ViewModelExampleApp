package com.example.viewmodelexampleapp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel(private val predefinedValue: Int) : ViewModel() {
    var count = MutableLiveData<Int>()

    init {
        count.value = predefinedValue
    }

    fun updateCountValue(value: Int) {
        count.value = (count.value)?.plus(value)
    }
}