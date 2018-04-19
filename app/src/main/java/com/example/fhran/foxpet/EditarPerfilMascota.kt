package com.example.fhran.foxpet

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.NavUtils



class EditarPerfilMascota : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_editar__perfil__mascota)

        //Definición de Bar para ser modificado
        val actionBar = supportActionBar
        actionBar!!.title = "Perfil de Mascota"
        //Activar boton de retroceder a través de android:parentActivityName especificado en
        //manifest.xml
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setDisplayShowHomeEnabled(true)
    }
}
