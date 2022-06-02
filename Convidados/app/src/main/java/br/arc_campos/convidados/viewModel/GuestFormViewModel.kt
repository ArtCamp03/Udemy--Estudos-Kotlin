package br.arc_campos.convidados.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.arc_campos.convidados.service.model.GuestModel
import br.arc_campos.convidados.service.repository.GuestRepository

class GuestFormViewModel: ViewModel() {

    private val mGuestRepository: GuestRepository = GuestRepository()
    private var mSaveGuest = MutableLiveData<Boolean>()
    val saveGuest: LiveData<Boolean> = mSaveGuest

    fun save(name: String, presence: String){
        val guest = GuestModel(name, presence)
        mGuestRepository.save(guest)
    }
}