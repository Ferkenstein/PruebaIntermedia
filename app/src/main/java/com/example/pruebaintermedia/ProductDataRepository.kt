package com.example.pruebaintermedia

import androidx.lifecycle.LiveData
import com.example.pruebaintermedia.dataBase.ProductData
import com.example.pruebaintermedia.dataBase.ProductDataDao

class ProductDataRepository(private val mProductDataDao: ProductDataDao) {

    // Value que contiene los datos LiveData de la base de datos
    val listAllProductData : LiveData<List<ProductData>> = mProductDataDao.getAllDataFromDb()

    // Funcion para insertar la informacion
    suspend fun insertProductData(mProductData: ProductData) {
        mProductDataDao.insertOneTable(mProductData)
    }


}