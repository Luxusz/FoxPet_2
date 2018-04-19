package com.example.fhran.foxpet

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_vacuna_agregar.*

class VacunaAgregar : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vacuna_agregar)

        btnAdd.setOnClickListener(){

            Toast.makeText(this, "Hola", Toast.LENGTH_LONG).show()

            val intento = Intent(this,Lobby::class.java)
            startActivity(intento)
        }


    }
}
