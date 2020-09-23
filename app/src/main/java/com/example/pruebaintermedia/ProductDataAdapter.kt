package com.example.pruebaintermedia

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pruebaintermedia.dataBase.ProductData
import kotlinx.android.synthetic.main.input_item.view.*

class ProductDataAdapter(val list: List<ProductData>) : RecyclerView.Adapter<ProductDataAdapter.ProductDataViewHolder>() {

    inner class ProductDataViewHolder(inputView: View) : RecyclerView.ViewHolder(inputView) {
        val nameProductText = itemView.nameProduct
        val quantityNumber = itemView.quantity
        val totalAmountNumber = itemView.totalAmount
        val checkBoxDelete = itemView.checkBox


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductDataViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ProductDataViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}