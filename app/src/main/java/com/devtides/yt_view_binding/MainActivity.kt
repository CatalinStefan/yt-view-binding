package com.devtides.yt_view_binding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.devtides.yt_view_binding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
        binding.incrementButton.setOnClickListener {
            counter++
            binding.counter.text = counter.toString()
        }
    }
}