package com.example.bouquet

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        // Handle clicks for each product image
        val imageButton1: ImageButton = findViewById(R.id.b1)
        val imageButton2: ImageButton = findViewById(R.id.b2)
        val imageButton3: ImageButton = findViewById(R.id.b3)
        val imageButton4: ImageButton = findViewById(R.id.b4)
        val imageButton5: ImageButton = findViewById(R.id.b5)
        val imageButton6: ImageButton = findViewById(R.id.b6)

        // Add first product to cart
        imageButton1.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            intent.putExtra("imageResource", R.drawable.img_1)  // Pass image resource to cart activity
            startActivity(intent)
        }

        // Add second product to cart
        imageButton2.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            intent.putExtra("imageResource", R.drawable.img_1)  // Pass another image
            startActivity(intent)
        }

        imageButton3.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            intent.putExtra("imageResource", R.drawable.img_1)  // Pass another image
            startActivity(intent)
        }

        imageButton4.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            intent.putExtra("imageResource", R.drawable.img_1)  // Pass another image
            startActivity(intent)
        }

        imageButton5.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            intent.putExtra("imageResource", R.drawable.img_1)  // Pass another image
            startActivity(intent)
        }

        imageButton6.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            intent.putExtra("imageResource", R.drawable.img_1)  // Pass another image
            startActivity(intent)
        }
    }
}
