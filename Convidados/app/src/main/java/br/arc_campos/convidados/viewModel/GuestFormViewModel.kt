package br.arc_campos.convidados.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import br.arc_campos.convidados.service.model.GuestModel
import br.arc_campos.convidados.service.repository.GuestRepository

class GuestFormViewModel(application: Application): AndroidViewModel(application) {

    private val repository = GuestRepository.getInstance(application)

    private val guestModel = MutableLiveData<GuestModel>>()
    val guest: LiveData<GuestModel> = guestModel

    fun insert(guest: GuestModel){
        repository.insert(guest)
    }

    fun get(id: Int){
        repository.get()
    }

    /*
    private val mGuestRepository: GuestRepository = GuestRepository()
    private var mSaveGuest = MutableLiveData<Boolean>()
    val saveGuest: LiveData<Boolean> = mSaveGuest

    fun save(name: String, presence: Boolean){
        val guest = GuestModel(name, presence)
        mGuestRepository.save(guest)
    }

     */
}