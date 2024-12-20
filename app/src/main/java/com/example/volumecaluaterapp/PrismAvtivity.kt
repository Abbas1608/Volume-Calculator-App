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

class PrismAvtivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_prism_avtivity)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val enterLenght: EditText = findViewById<EditText>(R.id.length1)
        val enterbase : EditText = findViewById<EditText>(R.id.base)
        val ResultOfPrism : TextView = findViewById<TextView>(R.id.resultOfPrism)
        val ButtonOFPrism : Button = findViewById<Button>(R.id.ButtonofPrism)

        ButtonOFPrism.setOnClickListener{
            var LengthofPr=enterLenght.text.toString()
            var lp = Integer.parseInt(LengthofPr)

            var Base = enterbase.text.toString()
            var B = Integer.parseInt(Base)

            var VOFprism = lp * B

            ResultOfPrism.text = " volume of Triangle Prism = $lp X $B \n Volume of Triangle Prism = $VOFprism m^3."

        }
    }
}