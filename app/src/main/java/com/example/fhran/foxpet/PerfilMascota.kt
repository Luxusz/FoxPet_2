package com.example.fhran.foxpet

import android.app.AlertDialog
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_registro_mascota.*

class PerfilMascota : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil_mascota)

    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.perfil_mascota, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menu_1 -> {
                val intento = Intent(this,VacunasAgenda::class.java)
                startActivity(intento)
                return true
            }
            R.id.menu_2 -> {
                val intento = Intent(this,EditarPerfilMascota::class.java)
                startActivity(intento)
                return true
            } R.id.menu_3 -> {
            val dialogo1 = android.app.AlertDialog.Builder(this@PerfilMascota)
            dialogo1.setTitle("Importante");
            dialogo1.setMessage("¿Seguro que desea eliminar?")
            dialogo1.setPositiveButton("Aceptar") { dialog, whichButton ->
                Toast.makeText(this,"Aceptó", Toast.LENGTH_LONG).show()
            }
            dialogo1.setNegativeButton("Cancelar"){ dialog, whichButton ->
                Toast.makeText(this,"Canceló", Toast.LENGTH_LONG).show()
            }
            val b = dialogo1.create().show()
            return true
        }
            else -> return super.onOptionsItemSelected(item)
        }
    }
}
