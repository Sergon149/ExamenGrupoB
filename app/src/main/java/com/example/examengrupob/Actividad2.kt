package com.example.examengrupob

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.examengrupob.databinding.ActivityMainBinding

class Actividad2 : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        intent.extras?.let { safeExtras ->
            val texto = safeExtras.getString("TEXTO")
            Toast.makeText(this,texto,Toast.LENGTH_LONG).show()
        }
    }
}