package com.example.snackbaractivity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.snackbaractivity.R

class SignupActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val nameEditText = findViewById<EditText>(R.id.editTextText2)
        val genderEditText = findViewById<EditText>(R.id.editTextText3)
        val signUpButton = findViewById<Button>(R.id.button2)

        signUpButton.setOnClickListener {
            val name = nameEditText.text.toString()
            val gender = genderEditText.text.toString()

            Log.d("SignupActivity", "Navigating to WelcomeActivity with name: $name and gender: $gender")

            val intent = Intent(this, WelcomeActivity::class.java)
            intent.putExtra("name", name)
            intent.putExtra("gender", gender)
            startActivity(intent)
        }
    }
}
