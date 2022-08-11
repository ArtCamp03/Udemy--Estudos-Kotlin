package br.arc_camp_tcc.components

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.ArrayAdapter
import android.widget.TextView
import android.widget.Toast
import br.arc_camp_tcc.components.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.buttonToast.setOnClickListener(this)

        binding.buttonSnake.setOnClickListener(this)

        loadSpinner()

        supportActionBar?.hide()
    }

    override fun onClick(v: View) {
        if (v.id == R.id.button_toast) {
            val toast = Toast.makeText(this, "Botao Toast", Toast.LENGTH_SHORT)

            // encontra o nome do elemento
            val textView = toast.view?.findViewById<TextView>(android.R.id.message)
            if (textView != null) {
                textView.setTextColor(Color.RED)

                // seta a gravidade do Toast
                toast.setGravity(Gravity.TOP, 0, 250)

                // toast personalizada
                val layout = layoutInflater.inflate(R.layout.toast_layout, null)
                toast.view = layout

                toast.show()

                //toast("Funcao -> TOAST")
            } else if (v.id == R.id.button_snake) {
                val linear = binding.linearRoot
                val snake = Snackbar.make(linear, "Snake", Snackbar.LENGTH_SHORT)

                // açao na SnackBar
                snake.setAction("Desafazer", View.OnClickListener {
                    toast("Desfeito !!")
                })

                // cor
                snake.setActionTextColor(Color.GREEN)

                // plano de fundo
                snake.setBackgroundTint(Color.BLACK)

                snake.show()
            }

        }
    }

    private fun loadSpinner(){
        val mList = listOf("Gramas", "Kg", "Arroba", "Tonelada")
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, mList)
        binding.spinerDinamic.adapter = adapter
    }

    private fun toast(str: String) {
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show()
    }


}