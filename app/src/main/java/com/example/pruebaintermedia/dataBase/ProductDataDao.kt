package com.example.pruebaintermedia.dataBase

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.pruebaintermedia.dataBase.ProductData

@Dao
interface ProductDataDao {
    // Insertar UN objeto en la tabla utilizando suspend courroutine
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertOneTable(mProductData: ProductData)

    //Insertar MULTIPLES objetos Table en la tabla
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertMultipleTable(mListData: List<ProductData>)

    @Update
    fun updateOneTable(mProductData: ProductData)

    @Delete
    fun deleteOneTable(mProductData: ProductData)

    // Mostrar TODOS los elementos de un listado envuelto en LiveData
    @Query("SELECT * FROM product_data")
    fun getAllDataFromDb(): LiveData<List<ProductData>>

    //  Buscar elementos por ID
    @Query("SELECT * FROM product_data WHERE id =:id")
    fun getOneDataByID(id: Int): ProductData



}