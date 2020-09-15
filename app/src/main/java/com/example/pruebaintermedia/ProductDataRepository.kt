package com.example.pruebaintermedia

import com.example.pruebaintermedia.dataBase.ProductData
import com.example.pruebaintermedia.dataBase.ProductDataDao

class ProductDataRepository(private val mProductDataDao: ProductDataDao) {

    // Value que contiene los datos de la base de datos
    val listAllProductData : List<ProductData> = mProductDataDao.getAllDataFromDb()

    // Funcion para insertar la informacion
    fun insertProductData(mProductData: ProductData) {
        mProductDataDao.insertOneTable(mProductData)
    }


}