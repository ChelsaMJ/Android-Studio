package com.example.kot2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class TouchLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_touch_login)

        val b = findViewById<Button>(R.id.button1)

        b.setOnClickListener {
            Toast.makeText(this, "Welcome Back!", Toast.LENGTH_LONG).show()
}
    }
}
