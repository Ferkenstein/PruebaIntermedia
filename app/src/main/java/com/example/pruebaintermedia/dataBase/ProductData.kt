package com.example.pruebaintermedia.dataBase

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "product_data" )
data class ProductData (
        @PrimaryKey(autoGenerate = true)
        @NonNull
        var id : Int,
        val name : String,
        val completeName : Boolean,
        val price : Int,
        val quantity : Int)

