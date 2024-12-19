package com.example.volumecaluaterapp

import android.content.Intent
import android.os.Bundle
import android.widget.GridView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // step 1 initial view
        val gridView: GridView = findViewById<GridView>(R.id.gridView)

        // Step2 : data
        val shape1 = Appdata(R.drawable.cube,"Cube")
        val shape2 = Appdata(R.drawable.sphere,"Sphere")
        val shape3 = Appdata(R.drawable.prism,"Prism")
        val shape4 = Appdata(R.drawable.cylinder,"Cylinder")

        val gridItem = listOf<Appdata>(
            shape1,shape2,shape3,shape4
        )

        // Adapter
         val customAdapter = myAdapter(this, gridItem)
        gridView.adapter = customAdapter

        // handling the clicked
        gridView.setOnItemClickListener { _, _, position, _ ->
            val clickedItem = customAdapter.getItem(position)

            if(clickedItem?.shapeName.equals("Sphere"))
               {
                    val i = Intent(this , SphereActivity::class.java)
                   startActivity(i)
               }
            else if (clickedItem?.shapeName.equals("Cube"))
               {
                val f = Intent(this , CubeActivity::class.java)
                   startActivity(f)
               }
            else if( clickedItem?.shapeName.equals("Prism"))
               {
                val p = Intent(this, PrismAvtivity::class.java)
                   startActivity(p)
               }
            else
               {
                   val c = Intent(this, CyliderAvtivity::class.java)
                   startActivity(c)
               }
        }
    }
}