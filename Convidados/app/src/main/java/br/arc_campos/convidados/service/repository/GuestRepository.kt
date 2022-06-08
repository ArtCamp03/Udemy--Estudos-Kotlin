package br.arc_campos.convidados.service.repository

import android.content.Context
import br.arc_campos.convidados.service.model.GuestModel

class GuestRepository private constructor(context: Context) {

    private val guestDataBase = GuestDataBaseHelper(context)

    // Singleton
    companion object {
        private lateinit var repository: GuestRepository

        fun getInstance(context: Context): GuestRepository{
            if(!::repository.isInitialized){
                repository = GuestRepository(context)
            }
            return repository
        }
    }

    /*
    fun getAll(): List<GuestModel> {
        val list: MutableList<GuestModel> = ArrayList()
        return list
    }

    fun getPresent(): List<GuestModel> {
        val list: MutableList<GuestModel> = ArrayList()
        return list
    }

    fun getAbsent(): List<GuestModel> {
        val list: MutableList<GuestModel> = ArrayList()
        return list
    }

     */

    // CRUD -> create,read ,update,delete

    fun save(guest: GuestModel){
        //
    }

    fun update(guest: GuestModel){
        //
    }

    fun get(){

    }

    /*

    fun delete(guest: GuestModel){
    }

     */
}