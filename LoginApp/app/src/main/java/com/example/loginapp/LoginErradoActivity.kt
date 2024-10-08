package com.example.loginapp

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.loginapp.databinding.ActivityLoginErradoBinding

class LoginErradoActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityLoginErradoBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        Toast.makeText(applicationContext, "Credenciais erradas", Toast.LENGTH_LONG).show()

        binding.buttonVoltar.setOnClickListener{

            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)

        }

    }
}