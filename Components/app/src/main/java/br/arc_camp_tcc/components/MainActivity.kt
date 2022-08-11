package br.arc_camp_tcc.components

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.TextView
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
            val toast = Toast.makeText(this, "Botao Toast",Toast.LENGTH_SHORT)

            // encontra o nome do elemento
            val textView = toast.view.findViewById<TextView>(android.R.id.message)
            textView.setTextColor(Color.RES)

            // seta a gravidade do Toast
            toast.setGravity(Gravity.TOP, 0, 250)

            // toast personalizada
            val layout = layoutInflater.inflate(R.layout.toast_layout, null)
            toast.view = layout

            toast.show()

            //toast("Funcao -> TOAST")
        }
    }

    private fun toast(str: String){
        Toast.makeText(this, str,Toast.LENGTH_SHORT).show()
    }
}