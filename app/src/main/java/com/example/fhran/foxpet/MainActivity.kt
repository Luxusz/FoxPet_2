package com.example.fhran.foxpet

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnLogin.setOnClickListener(){
            val algo : Int = txtPassword.length()
            if(algo >= 8){
                Toast.makeText(this, "Hola ${txtUsername.text}", Toast.LENGTH_LONG).show()

                val intento = Intent(this,Lobby::class.java)
                startActivity(intento)


            }
            else{
                Toast.makeText(this, "Password no es correcto!", Toast.LENGTH_LONG).show()

            }
        }

        btnRegistrar.setOnClickListener(){
            //Iniciar una nueva vista desde una función
            val intento = Intent(this,Registro_Usuario::class.java)
            startActivity(intento)

        }

    }
}
