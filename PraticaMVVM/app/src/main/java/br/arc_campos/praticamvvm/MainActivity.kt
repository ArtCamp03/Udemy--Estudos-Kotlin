package br.arc_campos.praticamvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import br.arc_campos.praticamvvm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // sem Model View
        //binding.textWelcome.text = "Ola Mundo"

        // instanciando a classe
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        /*
        viewModel.welcome().observe(this){
            binding.textWelcome.text = it
        }
         */

        // ou

        setObserver()
        supportActionBar?.hide()
    }

    private fun setObserver(){
        viewModel.welcome().observe(this, Observer{
            binding.textWelcome.text = it
        })
    }

}