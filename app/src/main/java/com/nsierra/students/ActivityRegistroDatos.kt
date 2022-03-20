package com.nsierra.students

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class ActivityRegistroDatos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_datos)

        val windowAddMaterias: Button = findViewById(R.id.btnAddMaterias)
        windowAddMaterias.setOnClickListener{
            val lanzarActivity = Intent(this,ActivityMateriaNota::class.java)
            startActivity(lanzarActivity)
        }

        val studentID:EditText=findViewById(R.id.studentID)
        val studentName:EditText=findViewById(R.id.studentName)
        val studentAge:EditText=findViewById(R.id.studentAge)
        val studentPhone:EditText=findViewById(R.id.studentPhone)
        val studentDirection:EditText=findViewById(R.id.studentDirection)
    }
}