package br.arc_campos.convidados.service.repository

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import br.arc_campos.convidados.constants.DataBaseConstants
import br.arc_campos.convidados.constants.DataBaseConstants.GUEST.TABLE_NAME

// classe dataBaseHelper é a utilizada no repositorio para acessar o banco
class GuestDataBaseHelper(context: Context): SQLiteOpenHelper(context, "", null, 1){

    // GuestDataBase estabelece uma conexao com o banco dedados

    companion object {
        private const val DATABASE_VERSION = 1
        private const val DATABASE_NAME = "Convidados.db"
    }

    // chamado uma unica vez quando a aplicaçao acessa o banco
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL("CREATE TABLE " + DataBaseConstants.GUEST.TABLE_NAME + " (" +
                DataBaseConstants.GUEST.COLUMNS.ID + "integer primary key autoincrement," +
                DataBaseConstants.GUEST.COLUMNS.NAME + "text, " +
                DataBaseConstants.GUEST.COLUMNS.PRESENCE + "integer);")
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