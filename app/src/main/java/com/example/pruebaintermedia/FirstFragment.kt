package com.example.pruebaintermedia

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.pruebaintermedia.dataBase.ProductData

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    lateinit var viewModel: ProductDataViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        // Ctrl + O
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ProductDataViewModel::class.java)
    }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)

        // Probar funcionamiento de la base de datos
        //val productData = ProductData(1,"Hola",true,12000,3)
        //viewModel.insertProductData(productData)
        //viewModel.allProductData.observe(viewLifecycleOwner, Observer {
        //    Log.d("Objeto", it.toString())
        //})
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.button_first).setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
    }
}