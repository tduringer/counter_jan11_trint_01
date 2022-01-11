package com.example.counter_jan11_trint_01.ui

import android.content.Intent
import android.os.Bundle
import android.view.Display
import androidx.appcompat.app.AppCompatActivity
import com.example.counter_jan11_trint_01.databinding.ActivityCounterBinding

class CounterActivity : AppCompatActivity() {

    private lateinit var binding : ActivityCounterBinding
    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCounterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            counterTv.text = count.toString()

            countBtn.setOnClickListener{
                count++
                counterTv.text = count.toString()
            }
            nextBtn.setOnClickListener{
                val intent = Intent(this@CounterActivity, DisplayActivity::class.java)
                intent.putExtra("Map", count)
                startActivity(intent)
            }
        }
    }
}