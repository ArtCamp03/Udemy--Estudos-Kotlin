package br.arc_campos.useractivity.infra

import android.content.Context
import android.content.SharedPreferences

class SecurityPreference (context: Context){

    private val security : SharedPreferences =
        context.getSharedPreferences("Motivation", Context.MODE_PRIVATE)

    // salvar usuarios
    fun storeString(key: String,str: String){
        security.edit().putString(key, str).apply()
    }

    fun getString(key: String): String{
        return security.getString(key, "") ?: ""
    }

}