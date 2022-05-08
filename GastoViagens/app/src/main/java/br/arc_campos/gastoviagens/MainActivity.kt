package br.arc_campos.gastoviagens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.arc_campos.gastoviagens.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // View binding
    // ActivityMainBinding -> classe responsavel por mapear os elementos
    // inflate -> expande o layout

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    private fun calculate(){
    }

}