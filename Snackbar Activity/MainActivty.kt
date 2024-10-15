package com.example.snackbaractivity

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        var butt = findViewById<Button>(R.id.button1)

        butt.setOnClickListener { view ->
            Snackbar.make(view, "This is a snackbar", Snackbar.LENGTH_LONG).setAction("initiate undo"){
                Toast.makeText(this, "undo action completed", Toast.LENGTH_LONG).show()
            }.show()

        }
    }
}
