package com.example.aula_listas_objetos

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.aula_listas_objetos.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // Instanciar objeto: val utilizador = Utilizador("user","pass")

        val listaUtilizadores = ArrayList<Utilizador>()
        listaUtilizadores.add(Utilizador("user1", "pass1",911222333))
        listaUtilizadores.add(Utilizador("user2", "pass2",922333444))
        listaUtilizadores.add(Utilizador("user3", "pass3",944455777))
        listaUtilizadores.add(Utilizador("user4", "pass4",911333555))
        listaUtilizadores.add(Utilizador("user5", "pass5",912222333))

        binding.listAula.adapter =
            ArrayAdapter(this, android.R.layout.simple_list_item_1, listaUtilizadores)

        binding.listAula.setOnItemClickListener{ parent,view,position,id->
            Toast.makeText(this,listaUtilizadores.get(position).password,Toast.LENGTH_SHORT).show()
        }
    }
}