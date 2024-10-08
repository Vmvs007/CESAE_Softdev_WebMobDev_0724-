package com.example.linearlayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.linearlayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonConverterPeso.setOnClickListener{
            val euros:Double = binding.editEuros.text.toString().toDouble()
            val dolares:Double = euros*1.1

            binding.textDolares.text="$dolares Dolares"
        }

    }
}