package com.example.loginapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.loginapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonLogin.setOnClickListener {

            // Capturar o que o utilizar inseriu nos edit texts
            val username:String = binding.editUsername.text.toString()
            val password:String = binding.editPassword.text.toString()

            // Validar os dados de acesso
            if(username.equals("user") && password.equals("pass")){ // Acessos válidos

                // Passamos para a Activity de Login OK
                val intent = Intent(this,LoginOkActivity::class.java)
                startActivity(intent)

            }else{ // Acessos incorretos

                // Passamos para a Activity de Login Errado
                val intent = Intent(this,LoginErradoActivity::class.java)
                startActivity(intent)

            }


        }
    }
}