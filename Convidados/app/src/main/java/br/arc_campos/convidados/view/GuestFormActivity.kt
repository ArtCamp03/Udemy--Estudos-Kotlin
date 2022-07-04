package br.arc_campos.convidados.view

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import br.arc_campos.convidados.R
import br.arc_campos.convidados.constants.DataBaseConstants
import br.arc_campos.convidados.databinding.ActivityGuestFormBinding
import br.arc_campos.convidados.service.model.GuestModel
import br.arc_campos.convidados.viewModel.GuestFormViewModel

class GuestFormActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var viewModel: GuestFormViewModel
    private lateinit var binding: ActivityGuestFormBinding

    private var guestId = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityGuestFormBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this).get(GuestFormViewModel::class.java)

        binding.buttonSave.setOnClickListener(this)
        binding.radioPresence.isChecked = true

        obeserve()

        loadData()

        // tratar o recebimento do convidado
       //viewModel.guest.observe()
    }

    override fun onClick(v: View?) {
        if(v?.id == R.id.button_save){
            val name = binding.editNome.text.toString()
            val presence = binding.radioPresence.isChecked

            val model = GuestModel().apply {
                this.id = guestId
                this.name = name
                this.presence = presence
            }

            /*
             if(guestId == 0){
                viewModel.insert(model)
            }else{
                viewModel.update(model)
            }
             */

            viewModel.save(model)

        }
    }

    private fun obeserve(){
        viewModel.guest.observe(this, Observer {
            binding.editNome.setText(it.name)
            if(it.presence) {
                binding.radioPresence.isChecked = true
            }else{
                binding.radioAbsence.isChecked = true
            }

        })

        viewModel.saveGuest.observe(this, Observer {
            if(it.success){
                Toast.makeText(applicationContext, it.message, Toast.LENGTH_SHORT).show()
                /*
                if(guestId == 0){
                    Toast.makeText(applicationContext, "Inserçao com sucesso", Toast.LENGTH_SHORT).show()
                }else{
                    Toast.makeText(applicationContext, "Atualizaçao com sucesso", Toast.LENGTH_SHORT).show()
                }
                 */

                finish()
            }
        })
    }

    private fun loadData(){
        val bundle = intent.extras
        if(bundle != null){
            guestId = bundle.getInt(DataBaseConstants.GUEST.ID)
            viewModel.get(guestId)
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