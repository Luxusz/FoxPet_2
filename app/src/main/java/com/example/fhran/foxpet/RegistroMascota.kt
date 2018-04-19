package com.example.fhran.foxpet

import android.app.AlertDialog
import android.app.DatePickerDialog
import android.content.DialogInterface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_registro_mascota.*
import java.text.SimpleDateFormat
import java.util.*

class RegistroMascota : AppCompatActivity() {
    var textview_fnac: TextView? = null
    var cal = Calendar.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_mascota)

        textview_fnac = this.fnac_mascota
        //Texto que aparecerá en el EditText
        textview_fnac!!.text = "dd/MM/YYYY"

        // Crear un listener de selección de fecha
        val dateSetListener = object : DatePickerDialog.OnDateSetListener {
            override fun onDateSet(view: DatePicker, year: Int, monthOfYear: Int,
                                   dayOfMonth: Int) {
                cal.set(Calendar.YEAR, year)
                cal.set(Calendar.MONTH, monthOfYear)
                cal.set(Calendar.DAY_OF_MONTH, dayOfMonth)
                updateDateInView()
            }
        }
        // Al hacer click en el EditText muestra DatePickerDialog/OnDateSetListener
        fnac_mascota!!.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View) {
                DatePickerDialog(this@RegistroMascota,
                        dateSetListener,
                        //Carga la fecha actual
                        cal.get(Calendar.YEAR),
                        cal.get(Calendar.MONTH),
                        cal.get(Calendar.DAY_OF_MONTH)).show()
            }
        })

        //Alertdialog Sexo
        val items = arrayOf<CharSequence>("Hembra", "Macho") // Hay que reemplazarlo por los datos de BD
        val sexAlert = AlertDialog.Builder(this@RegistroMascota)
        sexo_mascota!!.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View) {
                sexAlert.setTitle("Prueba")
                sexAlert.setItems(items) { dialog, item ->
                    sexo_mascota.setText(items.get(item))
                }
                sexAlert.show()
            }
        })
    }
        private fun updateDateInView() {
            val Formato = "MM/dd/yyyy" // Indica el formato
            val sdf = SimpleDateFormat(Formato, Locale.US)
            textview_fnac!!.text = sdf.format(cal.getTime())
        }
}
