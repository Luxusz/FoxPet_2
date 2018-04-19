package com.example.fhran.foxpet

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_registro_usuario2.*

class RegistroUsuario2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_usuario2)


        btnNext2.setOnClickListener() {
            Toast.makeText(this, "Funciona???", Toast.LENGTH_LONG).show()
            var correcto = true

            if(correcto){
                //Iniciar una nueva vista desde una función
                val intento = Intent(this,RegistroUsuario3::class.java)
                startActivity(intento)
            }
        }
    }
}
