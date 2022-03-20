package com.nsierra.students

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivitySplash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val windowInicio:Button = findViewById(R.id.btnInicio)
        windowInicio.setOnClickListener{
            val lanzarActivity = Intent(this,ActivityRegistroDatos::class.java)
            startActivity(lanzarActivity)
        }

    }
}