package com.example.counter_jan11_trint_01.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.counter_jan11_trint_01.databinding.ActivityDisplayBinding

class DisplayActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDisplayBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDisplayBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val count = intent.extras?.get("Map") ?: "0"
        binding.displayTv.text = count.toString()
    }
}