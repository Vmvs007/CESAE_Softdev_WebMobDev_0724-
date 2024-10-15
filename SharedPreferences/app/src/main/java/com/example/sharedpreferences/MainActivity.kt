package com.example.sharedpreferences

import android.content.Context
import android.content.SharedPreferences
import android.media.MediaPlayer
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.sharedpreferences.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val sharedPreferences = this.getSharedPreferences("user_prefs", Context.MODE_PRIVATE)

        val user = sharedPreferences.getString("user", "").toString()
        val pass = sharedPreferences.getString("pass", "").toString()

        binding.editValorUser.setText(user)
        binding.editValorPass.setText(pass)

        binding.buttonGuardar.setOnClickListener {

            val mediaPlayer = MediaPlayer.create(applicationContext, R.raw.sonic)
            mediaPlayer.start()

            val editor: SharedPreferences.Editor = sharedPreferences.edit()
            editor.putString("user", binding.editValorUser.text.toString())
            editor.putString("pass", binding.editValorPass.text.toString())
            editor.apply()
        }
    }
}
