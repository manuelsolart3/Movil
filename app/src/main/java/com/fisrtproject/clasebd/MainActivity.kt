package com.fisrtproject.clasebd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.fisrtproject.clasebd.model.BdHelper

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Instanciamos la clase bdHelper
        val basedata = BdHelper(this)
        val bd = basedata.writableDatabase    //abro mi Bd en modo escritura

        Toast.makeText(this,"Base de datos creada", Toast.LENGTH_SHORT)
        bd.close() //cierra la base de datos




    }
}