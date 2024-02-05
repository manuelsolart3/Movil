package com.fisrtproject.clasebd.model

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class BdHelper(
    context: Context?
) : SQLiteOpenHelper(context,Constans.NombreBD,null,Constans.VersionBD) {
    //Extender la clase SqliteOpenHelper :
    //la variable que guardamos en este caso "db" guarda todos los comando
    override fun onCreate(db: SQLiteDatabase?) {

        db?.execSQL(Constans.Tabla)

    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("Not yet implemented")
    }

}