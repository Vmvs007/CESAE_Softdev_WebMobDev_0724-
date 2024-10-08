package com.example.appalunos

import android.R
import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.example.appalunos.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val listaAlunos = ArrayList<Aluno>()
        listaAlunos.add(Aluno("Vitor", "Porto", "vitor@mail.com"))
        listaAlunos.add(Aluno("Joana", "Porto", "joana@mail.com"))
        listaAlunos.add(Aluno("Roberto", "Gaia", "roberto@mail.com"))
        listaAlunos.add(Aluno("Ana", "Matosinhos", "ana@mail.com"))
        listaAlunos.add(Aluno("José", "Amarante", "jose@mail.com"))
        listaAlunos.add(Aluno("Pedro", "Porto", "pedro@mail.com"))

        binding.listAlunos.adapter =
            ArrayAdapter(this, R.layout.simple_list_item_1, listaAlunos)

        binding.listAlunos.setOnItemClickListener { parent, view, position, id ->
            intent = Intent(this, DetalhesAlunoActivity::class.java)

            intent.putExtra("nomeAluno", listaAlunos.get(position).nome)
            intent.putExtra("moradaAluno", listaAlunos.get(position).morada)
            intent.putExtra("emailAluno", listaAlunos.get(position).email)

            startActivity(intent)
        }
    }
}