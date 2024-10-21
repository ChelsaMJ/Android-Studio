package com.example.implicitexplicit

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.net.Uri


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val a= findViewById<Button>(R.id.impli)
        val b= findViewById<Button>(R.id.expli)

        // Explicit Intent
        a.setOnClickListener {
            val intent = Intent(this, MainActivity1::class.java)
            startActivity(intent)
        }

        // Implicit Intent
        b.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.google.com/")
            startActivity(intent)
        }

//        action_send is to send msg
//        to view msg, action_view
    }
}
