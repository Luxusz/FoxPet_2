package com.example.fhran.foxpet

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_vacunas_agenda.*

class VacunasAgenda : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vacunas_agenda)
        setSupportActionBar(toolbar)

        fabadd.setOnClickListener { view ->
            val intento = Intent(this,VacunaAgregar::class.java)
            startActivity(intento)
        }
    }

}
