package com.example.kot2

import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

// grid layout
class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.activity_main4)
        val a = findViewById<ImageButton>(R.id.imageButton3)
        val b =findViewById<ImageButton>(R.id.imageButton4)
        val c= findViewById<ImageButton>(R.id.imageButton5)
        val d = findViewById<ImageButton>(R.id.imageButton6)
        a.setOnClickListener{
            Toast.makeText(this, "Image view button clicked", Toast.LENGTH_LONG).show()
        }
        b.setOnClickListener{
            Toast.makeText(this, "Image view button clicked", Toast.LENGTH_LONG).show()
        }
        c.setOnClickListener{
            Toast.makeText(this, "Image view button clicked", Toast.LENGTH_LONG).show()
        }
        d.setOnClickListener{
            Toast.makeText(this, "Image view button clicked", Toast.LENGTH_LONG).show()
        }

    }
}
