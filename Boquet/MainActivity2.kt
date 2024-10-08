package com.example.bouquet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val welcome: TextView = findViewById(R.id.welcome1)

        welcome.setOnClickListener {
            val wel = welcome.text.toString()


            //explicit intent
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)

        }
    }
}
