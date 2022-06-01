package br.arc_campos.convidados.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import br.arc_campos.convidados.viewModel.GuestFormViewModel
import br.arc_campos.convidados.R

class GuestFormActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var mViewModel: GuestFormViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guest_form)

        mViewModel = ViewModelProvider(this).get(GuestFormViewModel::class.java)

       // setListeners()

    }

    /*
    private fun setListeners(){
        button_save.setOnClickListener(this)
    }
     */


    override fun onClick(v: View) {
        val id = v.id
        if(id == R.id.button_save){

        }
    }
}