package com.example.viewmodelexampleapp

import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    private var count = 0

    fun getCountValue(): Int {
        return count
    }

    fun updateCountValue(value: Int) {
        count += value
    }
}