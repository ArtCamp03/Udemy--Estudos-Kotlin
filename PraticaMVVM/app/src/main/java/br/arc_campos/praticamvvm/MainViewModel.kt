package br.arc_campos.praticamvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    // maneira qe a view model e activity conseguem entender as notificaçoes
    private var textWelcome = MutableLiveData<String>()

    init{
        textWelcome.value = "Ola"
    }

    fun welcome(): LiveData<String> {
        return textWelcome
    }
}