package com.example.pruebaintermedia.dataBase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

private const val DATA_BASE_NAME = "productData_db"
@Database(entities = [ProductData::class], version = 1)
abstract class DataBase : RoomDatabase() {

    // Datos Dao Interfaz
    abstract fun getProductDataDao(): ProductDataDao

    companion object { // Metodo estatico que se puede llamar fuera de la clase
        @Volatile
        private var INSTANCE: DataBase? = null

        fun getDatabase(context: Context): DataBase {
            val tempInstance = INSTANCE
            if(tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(context, DataBase::class.java, DATA_BASE_NAME).build()
                INSTANCE = instance
                return instance
            }

        }

    }

}