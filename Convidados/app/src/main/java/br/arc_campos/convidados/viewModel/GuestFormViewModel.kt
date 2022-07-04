package br.arc_campos.convidados.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import br.arc_campos.convidados.service.model.GuestModel
import br.arc_campos.convidados.service.model.SuccessFailure
import br.arc_campos.convidados.service.repository.GuestRepository

class GuestFormViewModel(application: Application): AndroidViewModel(application) {

    private val repository : GuestRepository = GuestRepository(application.applicationContext)

    private var guestModel = MutableLiveData<GuestModel>()
    val guest: LiveData<GuestModel> = guestModel

    private var _saveGuest = MutableLiveData<SuccessFailure>()
    val saveGuest: LiveData<SuccessFailure> = _saveGuest

    /*
        fun insert(guest: GuestModel){
            repository.insert(guest)
        }

        fun update(guest: GuestModel){
            repository.insert(guest)
        }
     */

    fun save(guest: GuestModel){
        val successFailure = SuccessFailure(true, "")

        if(guest.id == 0){
            successFailure.success = repository.insert(guest)
            /*
                if(repository.insert(guest)){
                    _saveGuest.value = "Inserçao com sucesso"
                }else{
                    _saveGuest.value = "Falha"
                }
             */

        }else{
            successFailure.success = repository.update(guest)
            /*
                if(repository.update(guest)){
                    _saveGuest.value = "Atualizaçao com sucesso"
                }else{
                    _saveGuest.value = "Falha"
                }
             */

        }

    }

    fun get(id: Int){
        guestModel.value = repository.get(id)
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