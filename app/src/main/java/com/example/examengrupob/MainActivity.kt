package com.example.examengrupob

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.widget.doBeforeTextChanged
import androidx.core.widget.doOnTextChanged
import com.example.examengrupob.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContentView(binding.root)

        binding.edText.doBeforeTextChanged { text, start, count, after ->
            text?.let { safeText ->
                /*if (text.contains(" ")) {
                    var textosinespacio = binding.edText.text.toString().replace(" ", " ")

                    var numComas=0
                    textosinespacio.forEach {
                        if (it == ','){
                            numComas++
                        }
                    }
                    binding.bNext.isEnabled = numComas >= 4
                }*/
            }
            binding.bNext.setOnClickListener{
                val intent= Intent(this, Actividad2::class.java)
                intent.putExtra("TEXTO",binding.edText.text)
                startActivity(intent)
            }
        }
    }
}