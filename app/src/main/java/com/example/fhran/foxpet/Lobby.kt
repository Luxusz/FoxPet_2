package com.example.fhran.foxpet

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_lobby.*

class Lobby : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lobby)

        btnPusuario.setOnClickListener(){
            //Iniciar una nueva vista desde una función
            val intento = Intent(this,PerfilUsuario::class.java)
            startActivity(intento)

        }

        btnPmascota.setOnClickListener(){
            //Iniciar una nueva vista desde una función
            val intento = Intent(this,PerfilMascota::class.java)
            startActivity(intento)

        }
    }


}
