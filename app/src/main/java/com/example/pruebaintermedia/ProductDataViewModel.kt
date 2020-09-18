package com.example.pruebaintermedia

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.example.pruebaintermedia.dataBase.DataBase
import com.example.pruebaintermedia.dataBase.ProductData
import com.example.pruebaintermedia.dataBase.ProductDataDao

// Manejar los datos que alimentan la interfaz de usuario
class ProductDataViewModel(application: Application) : AndroidViewModel(application) {

    private val repository: ProductDataRepository
    val allProductData: LiveData<List<ProductData>>

    init {
        val ProductDataDao = DataBase.getDatabase(application).getProductDataDao()
        repository = ProductDataRepository(ProductDataDao)
        allProductData = repository.listAllProductData

    }

}