package com.example.conversormoedaslinear

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.conversormoedaslinear.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonDolar.setOnClickListener {
            val euros: Double = binding.editValorEuros.text.toString().toDouble()
            val valorConvertido: Double = euros * 1.15
            binding.textResultado.text = "$valorConvertido $"
        }

        binding.buttonReal.setOnClickListener {
            val euros: Double = binding.editValorEuros.text.toString().toDouble()
            val valorConvertido: Double = euros * 6
            binding.textResultado.text = "$valorConvertido R$"
        }

        binding.buttonPeso.setOnClickListener {
            val euros: Double = binding.editValorEuros.text.toString().toDouble()
            val valorConvertido: Double = euros * 22
            binding.textResultado.text = "$valorConvertido P$"
        }

        binding.buttonLibra.setOnClickListener {
            val euros: Double = binding.editValorEuros.text.toString().toDouble()
            val valorConvertido: Double = euros * 0.85
            binding.textResultado.text = "$valorConvertido £"
        }

        binding.buttonFranco.setOnClickListener {
            val euros: Double = binding.editValorEuros.text.toString().toDouble()
            val valorConvertido: Double = euros * 0.95
            binding.textResultado.text = "$valorConvertido ₣"
        }

    }
}