package com.example.viewmodelexampleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodelexampleapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this)[MainActivityViewModel::class.java]
        binding.textViewNumber.text = viewModel.getCountValue().toString()
        binding.buttonAdd.setOnClickListener {
            viewModel.updateCountValue(Integer.parseInt(binding.editTextNumber.text.toString()))
            binding.textViewNumber.text = viewModel.getCountValue().toString()
        }
    }
}