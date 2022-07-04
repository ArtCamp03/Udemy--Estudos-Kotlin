package br.arc_campos.convidados.service.repository

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import br.arc_campos.convidados.constants.DataBaseConstants
import br.arc_campos.convidados.constants.DataBaseConstants.GUEST.TABLE_NAME
import br.arc_campos.convidados.service.model.GuestModel

// classe dataBaseHelper é a utilizada no repositorio para acessar o banco

// class GuestDataBaseHelper(context: Context): SQLiteOpenHelper(context, "", null, 1){
// GuestDataBase estabelece uma conexao com o banco dedados

/*
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

 */

@Database(entities = [GuestModel::class], version = 1)
abstract class GuestDataBaseHelper : RoomDatabase() {

    //thread

    companion object {
        private lateinit var INSTANCE: GuestDataBaseHelper

        fun getDatabase(context: Context): GuestDataBaseHelper {
            if (!::INSTANCE.isInitialized) {
                synchronized(GuestDataBaseHelper::class) {
                    INSTANCE =
                        Room.databaseBuilder(context, GuestDataBaseHelper::class.java, "guestdb")
                            .addMigrations(MIGRATION_1_2)
                            .allowMainThreadQueries()
                            .build()
                }
            }

            return INSTANCE
        }
        private val MIGRATION_1_2: Migration = object : Migration(1, 2){
            override fun migrate(database: SupportSQLiteDatabase) {
                database.execSQL("DELETE FROM Guest")
            }

        }
    }


}