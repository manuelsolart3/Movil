package com.fisrtproject.clasebd.model

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase

data class ManagerBd (val context: Context){
lateinit var  bd: SQLiteDatabase
val bdHelper = BdHelper(context) //llamando a la conexion

    //metodo para abrir bd en modo escritura
    fun openBdwr(){
        bd = bdHelper.writableDatabase
    }
    //abre base de datos en modo lectura
     fun openBdRd(){
         bd = bdHelper.readableDatabase
     }
    //metodo para insertar datos
    fun insertData():Long{
        openBdwr()

        val container = ContentValues()
        container.put("cod" , 1)
        container.put("nombre" , "popayan")

        //llamado metodo insert
      val resul =   bd.insert("ciudad", null,container)
        return resul
    }
}