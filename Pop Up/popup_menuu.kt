package com.example.oct29

import android.os.Bundle
import android.widget.Button
import android.widget.PopupMenu
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class popup_menuu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_popup_menuu)

        val b = findViewById<Button>(R.id.button7)
        b.setOnClickListener {
            val j = PopupMenu(this, b)
            j.menuInflater.inflate(R.menu.popup_menu, j.menu)

            j.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.share -> {
                        Toast.makeText(this, "Share", Toast.LENGTH_SHORT).show()
                        true
                    }
                    R.id.Delete -> {
                        Toast.makeText(this, "Delete", Toast.LENGTH_SHORT).show()
                        true
                    }
                    else -> false
                }
            }
            j.show()
        }
    }
}
