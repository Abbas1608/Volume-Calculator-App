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
import org.w3c.dom.Text

class CubeActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cube)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val CubeButton : Button = findViewById<Button>(R.id.CubeButton)
        val CuberLenght : EditText = findViewById<EditText>(R.id.Ctext)
        val CubeResult : TextView = findViewById<TextView>(R.id.CubeResult)

        CubeButton.setOnClickListener{
            var Length  = CuberLenght.text.toString()
            var L = Integer.parseInt(Length)

            var VolumeofCube = L*L*L
            CubeResult.text = " volume of Cube = $L X $L X $L  \n Volume of Cube = $VolumeofCube m^3."
        }
    }
}