package com.nsierra.students

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class ActivityRegistroDatos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_datos)



        val btnRegistroDatos: Button = findViewById(R.id.btnAddDatos)
        btnRegistroDatos.setOnClickListener { onClick() }

    }

    private fun onClick() {
        val studentID: EditText = findViewById(R.id.studentID)
        val studentName: EditText = findViewById(R.id.studentName)
        val studentAge: EditText = findViewById(R.id.studentAge)
        val studentPhone: EditText = findViewById(R.id.studentPhone)
        val studentDirection: EditText = findViewById(R.id.studentDirection)


        var id: String =studentID.text.toString()
        var name: String=studentName.text.toString()
        var age : String=studentAge.text.toString()
        var phone : String=studentPhone.text.toString()
        var direction : String=studentDirection.text.toString()


        var listDataStudents = mutableListOf(id,name,age,phone,direction)
        println(listDataStudents)


        val windowAddMaterias: Button = findViewById(R.id.btnAddDatos)
        windowAddMaterias.setOnClickListener {
            val lanzarActivity = Intent(this, ActivityMateriaNota::class.java)
            startActivity(lanzarActivity)
        }
        Toast.makeText(this,"Datos personales ingresados exitosamente", Toast.LENGTH_SHORT).show();

    }

}