package com.example.snackbaractivity

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val imageButton1: ImageButton = findViewById(R.id.b1)
        val imageButton2: ImageButton = findViewById(R.id.b2)
        val imageButton3: ImageButton = findViewById(R.id.b3)
        val imageButton4: ImageButton = findViewById(R.id.b4)
        val imageButton5: ImageButton = findViewById(R.id.b5)
        val imageButton6: ImageButton = findViewById(R.id.b6)
        val imageButton7: ImageButton = findViewById(R.id.b7)
        val imageButton8: ImageButton = findViewById(R.id.b8)
        val imageButton9: ImageButton = findViewById(R.id.b9)

        // Handle button 1 click
        imageButton1.setOnClickListener {
            Snackbar.make(it, "Welcome to button1", Snackbar.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity4::class.java)
            intent.putExtra("welcomeMessage", "Welcome to grave 1🥀")
            startActivity(intent)
        }

        imageButton2.setOnClickListener {
            Snackbar.make(it, "Welcome to button2", Snackbar.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity4::class.java)
            intent.putExtra("welcomeMessage", "Welcome to grave 2🥀")
            startActivity(intent)
        }

        imageButton3.setOnClickListener {
            Snackbar.make(it, "Welcome to button3", Snackbar.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity4::class.java)
            intent.putExtra("welcomeMessage", "Welcome to grave 3🥀")
            startActivity(intent)
        }

        imageButton4.setOnClickListener {
            Snackbar.make(it, "Welcome to button4", Snackbar.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity4::class.java)
            intent.putExtra("welcomeMessage", "Welcome to grave 4🥀")
            startActivity(intent)
        }

        imageButton5.setOnClickListener {
            Snackbar.make(it, "Welcome to button5", Snackbar.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity4::class.java)
            intent.putExtra("welcomeMessage", "Welcome to grave 5🥀")
            startActivity(intent)
        }

        imageButton6.setOnClickListener {
            Snackbar.make(it, "Welcome to button6", Snackbar.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity4::class.java)
            intent.putExtra("welcomeMessage", "Welcome to grave 6🥀")
            startActivity(intent)
        }

        imageButton7.setOnClickListener {
            Snackbar.make(it, "Welcome to button7", Snackbar.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity4::class.java)
            intent.putExtra("welcomeMessage", "Welcome to grave 7🥀")
            startActivity(intent)
        }

        imageButton8.setOnClickListener {
            Snackbar.make(it, "Welcome to button8", Snackbar.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity4::class.java)
            intent.putExtra("welcomeMessage", "Welcome to grave 8🥀")
            startActivity(intent)
        }

        imageButton9.setOnClickListener {
            Snackbar.make(it, "Welcome to button9", Snackbar.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity4::class.java)
            intent.putExtra("welcomeMessage", "Welcome to grave 9🥀")
            startActivity(intent)
        }
    }
}
