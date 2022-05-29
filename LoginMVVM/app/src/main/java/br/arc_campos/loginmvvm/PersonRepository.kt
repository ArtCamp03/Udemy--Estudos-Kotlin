package br.arc_campos.loginmvvm

class PersonRepository {
    fun login(email:String, password:String): Boolean{
        return (email != "" && password != "")
    }
}