package com.example.bouquet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginButton: Button = findViewById(R.id.button2)
        val emailEditText: EditText = findViewById(R.id.editTextText2)
        val passwordEditText: EditText = findViewById(R.id.editTextText3)

        loginButton.setOnClickListener {
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()

            //explicit intent
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)

        }
    }
}
