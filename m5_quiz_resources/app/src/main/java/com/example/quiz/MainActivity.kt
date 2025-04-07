package com.example.quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.quiz.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            binding.image.visibility = View.INVISIBLE
            binding.image1.visibility = View.VISIBLE
        }
    }
}