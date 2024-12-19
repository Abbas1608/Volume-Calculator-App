package com.example.volumecaluaterapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CyliderAvtivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cylider_avtivity)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val enterRadius : EditText = findViewById<EditText>(R.id.radius)
        val enterHeight : EditText = findViewById<EditText>(R.id.height)
        val CylingderButton : Button= findViewById<Button>(R.id.CylingeButton)
        val volumeofC : TextView = findViewById<TextView>(R.id.resultOfCylinder)
        CylingderButton.setOnClickListener{
            var  Radius = enterRadius.text.toString()
            var r1 = Integer.parseInt(Radius)
            var Height = enterHeight.text.toString()
            var h = Integer.parseInt(Height)

            val volumofCylinder = 3.14*r1* 2*h

            volumeofC.text = "Volume of cylinder =$volumofCylinder m^3."
        }

    }
}