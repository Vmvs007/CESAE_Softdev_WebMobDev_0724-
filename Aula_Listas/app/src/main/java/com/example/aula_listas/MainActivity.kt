package com.example.aula_listas

import android.R
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.aula_listas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val listaInteiros = ArrayList<Int>()
        listaInteiros.add(15)
        listaInteiros.add(20)
        listaInteiros.add(30)
        listaInteiros.add(-5)
        listaInteiros.add(10)

        var arrayAdapter = ArrayAdapter(this, R.layout.simple_list_item_1, listaInteiros)
        binding.listAula.adapter = arrayAdapter

        binding.listAula.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "Clicaste em ${listaInteiros.get(position)}", Toast.LENGTH_SHORT)
                .show()

            listaInteiros.add(listaInteiros.get(position))

            arrayAdapter = ArrayAdapter(this, R.layout.simple_list_item_1, listaInteiros)
            binding.listAula.adapter = arrayAdapter
        }

        binding.buttonClear.setOnClickListener{
            listaInteiros.clear()

            arrayAdapter = ArrayAdapter(this, R.layout.simple_list_item_1, listaInteiros)
            binding.listAula.adapter = arrayAdapter
        }

        binding.buttonAdicionar.setOnClickListener {
            val novoNumero = binding.editNovoElemento.text.toString().toInt()
            listaInteiros.add(novoNumero)

            arrayAdapter = ArrayAdapter(this, R.layout.simple_list_item_1, listaInteiros)
            binding.listAula.adapter = arrayAdapter
        }

    }
}