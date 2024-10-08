package com.example.conversoreurodolar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.conversoreurodolar.databinding.ActivityMainBinding
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonConverter.setOnClickListener{

            val eurosUtilizador: Double = binding.editEuros.text.toString().toDouble()
            val valorDolares = (eurosUtilizador*1.1*100).roundToInt().toDouble()/100;
            binding.textDolares.text="$valorDolares $"
        }

    }
}