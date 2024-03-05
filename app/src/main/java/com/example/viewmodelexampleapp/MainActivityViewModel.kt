package com.example.viewmodelexampleapp

import androidx.lifecycle.ViewModel

class MainActivityViewModel(private val predefinedValue: Int) : ViewModel() {
    private var count = 0

    init {
        count = predefinedValue
    }

    fun getCountValue(): Int {
        return count
    }

    fun updateCountValue(value: Int) {
        count += value
    }
}