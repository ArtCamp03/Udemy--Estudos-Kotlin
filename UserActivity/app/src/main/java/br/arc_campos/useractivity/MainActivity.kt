package br.arc_campos.useractivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import br.arc_campos.useractivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonSave.setOnClickListener(this)
        supportActionBar?.hide()
    }

    override fun onClick(v: View?) {
        if (v != null) {
            if(v.id == R.id.button_save){
                handleSave()
            }
        }
    }

    // slva informaçao
    private fun handleSave(){
        val name = binding.editName.text.toString()
        if(name != ""){
            // salva nome
            SecurityPreference(this).storeString("USER_NAME", name)

            startActivity(Intent(this,Motivation::class.java))
            finish()
        }else{
            Toast.makeText(this, R.string.validation_mandatory_name, Toast.LENGTH_SHORT).show()
        }
    }

}