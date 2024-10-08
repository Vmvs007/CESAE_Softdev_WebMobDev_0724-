package com.example.appcumprimentar

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.appcumprimentar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // Evento clique do botão
        binding.buttonCumprimentar.setOnClickListener {

            // Vamos buscar o nome e apelido
            val nome: String = binding.editPrimeiroNome.text.toString()
            val apelido: String = binding.editApelido.text.toString()

            if (nome.isNullOrEmpty() || apelido.isNullOrEmpty()) {
                Toast.makeText(applicationContext, "Campos não inseridos", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(applicationContext, "Olá ${nome} ${apelido}", Toast.LENGTH_SHORT).show()
            }


        }

    }
}