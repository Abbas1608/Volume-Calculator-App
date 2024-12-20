package com.example.volumecaluaterapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SphereActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sphere)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val enternum: EditText = findViewById<EditText>(R.id.editText)
        val button :Button = findViewById< Button>(R.id.Botton)
        val result : TextView = findViewById<TextView>(R.id.Result)


        button.setOnClickListener{
            var radius= enternum.text.toString()
            var r = Integer.parseInt(radius)

            var Volume = (4/3) * 3.14 * r*r*r

            result.text = " Volume of Sphere = (4/3) X 3.14 X $r X$r X $r \n Volume of Sphere = $Volume m^3."
        }
    }
}