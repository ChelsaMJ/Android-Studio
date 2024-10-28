package com.example.newproject

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val shareButton: Button = findViewById(R.id.sharebtn)
        shareButton.setOnClickListener {
            Sharetxt("Hello, share this message")

        }
    }
    fun Sharetxt(message: String) {
        val send: Intent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, message)
            type = "text/plain"
        }
        val chooser1: Intent = Intent.createChooser(send, "Share via")
        startActivity(chooser1)
    }
}
