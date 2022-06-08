package br.arc_campos.convidados.service.repository

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

// classe dataBaseHelper é a utilizada no repositorio para acessar o banco
class GuestDataBaseHelper(context: Context): SQLiteOpenHelper(context, "", null, 1){

    companion object {
        private const val DATABASE_VERSION = 1
        private const val DATABASE_NAME = "Convidados.db"
    }

    // chamado uma unica vez quando a aplicaçao acessa o banco
    override fun onCreate(db: SQLiteDatabase?) {
        db.execSQL("CREATE TABLE Guest(" +
                "id integer primary key autoincrement," +
                "name text, " +
                "presence integer);")
    }

    // so é chamado quando cai atualizaçao nova
    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        if(oldVersion == 1){
            if(newVersion == 2){
                // atualizaçao
            }
        }
    }

}