package com.example.learningapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class RelativeDial : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_relative_dial)

        val name = findViewById<EditText>(R.id.et1)
        val num = findViewById<EditText>(R.id.et2)
        val call = findViewById<Button>(R.id.b1)

        call.setOnClickListener{
            val name1 = name.text.toString()
            val num2 = num.text.toString()

            val i1 = Intent(Intent.ACTION_DIAL)
            i1.setData(Uri.parse("$num2"))
            startActivity(i1)

            Toast.makeText(this, "Calling $name1", Toast.LENGTH_LONG).show()
        }

    }
}