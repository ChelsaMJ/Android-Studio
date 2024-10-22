package com.example.snackbaractivity

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        // Retrieve the passed name and gender from Intent
        val name = intent.getStringExtra("name")
        val gender = intent.getStringExtra("gender")

        // Display the data in TextView
        val nameGenderTextView = findViewById<TextView>(R.id.tv_name_gender)
        nameGenderTextView.text = "Name: $name\nGender: $gender"

        // Show Toast to confirm reception of data
        Toast.makeText(this, "Data Received: $name, $gender", Toast.LENGTH_LONG).show()

        // Log the data reception
        Log.d("WelcomeActivity", "Data received: Name - $name, Gender - $gender")
    }
}
