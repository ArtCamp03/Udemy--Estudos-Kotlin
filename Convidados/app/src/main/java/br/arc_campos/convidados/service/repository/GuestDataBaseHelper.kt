package br.arc_campos.convidados.service.repository

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

// classe dataBaseHelper é a utilizada no repositorio para acessar o banco
class GuestDataBaseHelper(context: Context): SQLiteOpenHelper(context, "", null, 1){
    override fun onCreate(p0: SQLiteDatabase?) {
        TODO("Not yet implemented")
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("Not yet implemented")
    }

    companion object {
        private const val DATABASE_VERSION = 1
        private const val DATABASE_NAME = "Convidados.db"
    }

}