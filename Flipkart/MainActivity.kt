package com.example.myapplication67

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val welcome: TextView = findViewById(R.id.mj1)

        welcome.setOnClickListener {
            val wel = welcome.text.toString()

            //explicit intent
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }
    }
}
