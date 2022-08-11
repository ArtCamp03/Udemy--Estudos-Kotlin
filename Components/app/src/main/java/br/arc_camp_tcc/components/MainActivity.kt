package br.arc_camp_tcc.components

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import br.arc_camp_tcc.components.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.buttonToast.setOnClickListener(this)


    }

    override fun onClick(v: View) {
        if(v.id == R.id.button_toast){
            val toast = Toast.makeText(this, str,Toast.LENGTH_SHORT)
            toast.show()

            toast("Funcao -> TOAST")
        }
    }

    private fun toast(str: String){
        Toast.makeText(this, str,Toast.LENGTH_SHORT).show()
    }
}