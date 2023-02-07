package com.example.recyclerviewersample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recyclerviewersample.databinding.Activity2Binding
import com.example.recyclerviewersample.databinding.ActivityMainBinding

class activity2 : AppCompatActivity(R.layout.activity_2) {

    private lateinit var binding:Activity2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Activity2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvPrice.text = intent.getIntExtra("Num", 0).toString()
        binding.tvDescription.text = intent.getStringExtra("Des")
    }
}

