package br.arc_campos.loginmvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import br.arc_campos.loginmvvm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding : ActivityMainBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // sem Model View
        //binding.textWelcome.text = "Ola Mundo"

        binding.buttonLogin.setOnClickListener(this)

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

    override fun onClick(v: View) {
        if(v.id == R.id.button_login){
            val email = binding.editEmail.text.toString()
            val password = binding.editPasword.text.toString()

            viewModel.doLogin(email, password)
        }
    }

    private fun setObserver(){
        /*
         viewModel.welcome().observe(this, Observer{
            binding.textWelcome.text = it
        })
         */


        viewModel.login().observe(this, Observer{
            if(it){
                Toast.makeText(applicationContext, "SUCESSO!!", Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(applicationContext, "ERRO AO LOGAR!!", Toast.LENGTH_LONG).show()
            }
        })
    }

}