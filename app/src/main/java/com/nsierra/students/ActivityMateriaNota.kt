package com.nsierra.students

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class ActivityMateriaNota : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_materia_nota)

        val btnCPromedio: Button = findViewById(R.id.btnCalcularPromedio)
        btnCPromedio.setOnClickListener{onClick()}
    }


private fun onClick() {
    val materia1: EditText = findViewById(R.id.materiaName1)
    val nota1: EditText = findViewById(R.id.notaMateria1)

    val materia2: EditText = findViewById(R.id.materiaName2)
    val nota2: EditText = findViewById(R.id.notaMateria2)

    val materia3: EditText = findViewById(R.id.materiaName3)
    val nota3: EditText = findViewById(R.id.notaMateria3)

    val materia4: EditText = findViewById(R.id.materiaName4)
    val nota4: EditText = findViewById(R.id.notaMateria4)

    val materia5: EditText = findViewById(R.id.materiaName5)
    val nota5: EditText = findViewById(R.id.notaMateria5)




    var m1: String = materia1.text.toString()
    var no1: String = nota1.text.toString()
    val n1: Float? = no1.toFloat()

    var m2: String = materia2.text.toString()
    var no2: String = nota2.text.toString()
    val n2: Float? = no2.toFloat()

    var m3: String = materia3.text.toString()
    var no3: String = nota3.text.toString()
    val n30:Int = Integer.parseInt(no3)
    val n3: Float? = no3.toFloat()

    var m4: String = materia4.text.toString()
    var no4: String = nota4.text.toString()
    val n4: Float? = no4.toFloat()

    var m5: String = materia5.text.toString()
    var no5: String = nota5.text.toString()
    val n5: Float? = no5.toFloat()


    val textResultado: TextView =findViewById(R.id.textValidation)

    if (n1!! > 5){
        textResultado.text = "Recuerda que las notas no deben ser mayores a 5."
    }else if (n2!! > 5){
        textResultado.text = "Recuerda que las notas no deben ser mayores a 5."
    }else if (n3!! > 5) {
        textResultado.text = "Recuerda que las notas no deben ser mayores a 5."
    }else if (n4!! > 5){
        textResultado.text = "Recuerda que las notas no deben ser mayores a 5."
    }else if (n5!! > 5){
        textResultado.text = "Recuerda que las notas no deben ser mayores a 5."
    }
    else if (n1!! < 0){
        textResultado.text = "Recuerda que las notas no deben ser menores a 0."
    }else if (n2!! < 0){
        textResultado.text = "Recuerda que las notas no deben ser menores a 0."
    }else if (n3!! < 0){
        textResultado.text = "Recuerda que las notas no deben ser menores a 0."
    }else if (n4!! < 0){
        textResultado.text = "Recuerda que las notas no deben ser menores a 0."
    }else if (n5!! < 0){
        textResultado.text = "Recuerda que las notas no deben ser menores a 0."
    }
    else {
        Toast.makeText(this,"Calculo de promedio exitoso", Toast.LENGTH_SHORT).show();
        val cPromedio = (n1 + n2 + n3 + n4 + n5)/5

        Toast.makeText(this,"Tu promedio es $cPromedio", Toast.LENGTH_SHORT).show();

    }

    var listMateriaStudents = mutableListOf(materia1,nota1,materia2,nota2,materia3,nota3,materia4,nota4,materia5,nota5)
    println(listMateriaStudents)


}
}