package com.example.appalunos

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.appalunos.databinding.ActivityDetalhesAlunoBinding

class DetalhesAlunoActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityDetalhesAlunoBinding.inflate(layoutInflater)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val i = intent

        val nome = i.extras?.getString("nomeAluno")
        val morada = i.extras?.getString("moradaAluno")
        val email = i.extras?.getString("emailAluno")

        binding.textNome.text = nome
        binding.textMorada.text = morada
        binding.textEmail.text = email


    }
}