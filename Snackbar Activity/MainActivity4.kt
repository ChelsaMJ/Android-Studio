package com.example.snackbaractivity

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        // Get the message from the intent
        val welcomeMessage = intent.getStringExtra("welcomeMessage") ?: "Welcome!"

        // Find the TextView and set the welcome message
        val welcomeTextView: TextView = findViewById(R.id.welcomeText)
        welcomeTextView.text = welcomeMessage

        // Create a Snackbar that shows an action
        val rootView = findViewById<TextView>(R.id.welcomeText)
        Snackbar.make(rootView, "Action Available", Snackbar.LENGTH_LONG)
            .setAction("Open") {
                Snackbar.make(rootView, "Opened!", Snackbar.LENGTH_SHORT).show()
            }.show()
    }
}
