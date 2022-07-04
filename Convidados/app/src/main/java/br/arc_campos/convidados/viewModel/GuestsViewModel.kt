package br.arc_campos.convidados.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import br.arc_campos.convidados.service.model.GuestModel
import br.arc_campos.convidados.service.repository.GuestRepository

class GuestsViewModel(application: Application) : AndroidViewModel(application) {
    private val repository : GuestRepository = GuestRepository(application.applicationContext)

    private val listAllGuests = MutableLiveData<List<GuestModel>>()
    val guests: LiveData<List<GuestModel>> = listAllGuests

    fun getAll(){
        listAllGuests.value = repository.getAll()
    }

    fun getAbsent(){
        listAllGuests.value = repository.getAbsent()
    }

    fun getPresent(){
        listAllGuests.value = repository.getPresent()
    }

    fun delete(id: Int){
        repository.delete(id)
    }

}