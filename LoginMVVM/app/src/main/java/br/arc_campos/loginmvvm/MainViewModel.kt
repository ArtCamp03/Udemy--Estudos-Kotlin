package br.arc_campos.loginmvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel(){

    // maneira qe a view model e activity conseguem entender as notificaçoes
    private var textWelcome = MutableLiveData<String>()

    // observa a variavel
    private var login = MutableLiveData<Boolean>()

    // tercerizando metodo
    private val personRepository = PersonRepository()


    init{
        textWelcome.value = "Ola"
    }

    fun welcome(): LiveData<String> {
        return textWelcome
    }

    fun login(): LiveData<Boolean> {
        return login
    }

    fun doLogin(email:String, password: String){
        login.value =  personRepository.login(email, password)
    }

}