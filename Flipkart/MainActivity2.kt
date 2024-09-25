package com.example.myapplication67

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val loginButton: Button = findViewById(R.id.button2)
        val emailEditText: EditText = findViewById(R.id.editTextText2)
        val passwordEditText: EditText = findViewById(R.id.editTextText3)

        loginButton.setOnClickListener {
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()

            if (email.isNotEmpty() && password.isNotEmpty()) {
                // Start MainActivity when login is successful
                val intent = Intent(this@MainActivity2, MainActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Please enter both email and password", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
