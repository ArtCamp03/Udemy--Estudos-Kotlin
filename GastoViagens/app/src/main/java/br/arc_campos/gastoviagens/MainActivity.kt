package br.arc_campos.gastoviagens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import br.arc_campos.gastoviagens.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    // View binding
    // ActivityMainBinding -> classe responsavel por mapear os elementos
    // inflate -> expande o layout

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // maneira de captura botao calcula
        // metodo a ser usado neste projeto
        binding.btnCalc.setOnClickListener(this)

        // 3º maneira
        // classe Anonima
        /*
            binding.btnCalc.setOnClickListener(object : View.OnClickListener {
                override fun onClick(p0: View?) {
                    TODO("Not yet implemented")
                }
            })

         */

        // Lambda
        /*
            binding.btnCalc.setOnClickListener {
                TODO("Not yet implemented")
                /// implementaçao
            }
         */


    }

    override fun onClick(view: View) {
        if(view.id == R.id.btn_calc){
            calculate()
        }

    }

    private fun calculate(){
        // tost notification
        Toast.makeText(this, "Clicado com sucesso!!", Toast.LENGTH_SHORT).show()
    }

}