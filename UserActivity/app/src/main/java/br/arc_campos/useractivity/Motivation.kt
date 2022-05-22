package br.arc_campos.useractivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import br.arc_campos.useractivity.databinding.ActivityMotivationBinding

class Motivation : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMotivationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMotivationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // esconde a barra de navegaçao
        supportActionBar?.hide()

        handleUserName()

        //Eventos
        binding.buttonNewPhrase.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        if(view != null){
            if(view.id == R.id.button_new_phrase){
                var s = ""
            }
        }
    }

    private fun handleUserName(){
        val name = SecurityPreference(this).getString("USER_NAME")
        binding.textUserName.text = "Ola, $name!"

    }

}