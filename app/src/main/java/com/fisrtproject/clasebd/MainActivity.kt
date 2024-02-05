package com.fisrtproject.clasebd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fisrtproject.clasebd.model.ManagerBd

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Instanciamos la clase bdHelper
        val manager = ManagerBd(this)
       manager.insertData()






    }
}