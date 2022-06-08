package br.arc_campos.convidados.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import br.arc_campos.convidados.viewModel.GuestFormViewModel
import br.arc_campos.convidados.R
import br.arc_campos.convidados.databinding.ActivityGuestFormBinding
import br.arc_campos.convidados.service.model.GuestModel
import kotlinx.android.synthetic.main.activity_guest_form.*

class GuestFormActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var mViewModel: GuestFormViewModel
    private lateinit var binding: ActivityGuestFormBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityGuestFormBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mViewModel = ViewModelProvider(this).get(GuestFormViewModel::class.java)

        binding.buttonSave.setOnClickListener(this)
        binding.radioPresence.isChecked = true

    }

    override fun onClick(v: View?) {
        if(v.id == R.id.button_save){
            //GuestModel(10,"x", false)
        }
    }

    /*
    override fun onClick(v: View) {
        val id = v.id
        if(id == R.id.button_save){

            val name = edit_nome.text.toString()
            val presence = radio_presence.isChecked

            mViewModel.save(name,presence)
        }
    }

    private fun observe(){
        mViewModel.saveGuest.observe(this, Observer {
            if(it){
                Toast.makeText(applicationContext, "Sucesso", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(applicationContext, "Falha", Toast.LENGTH_SHORT).show()
            }
        })
    }

    private fun setListeners(){
        button_save.setOnClickListener(this)
    }

     */

}