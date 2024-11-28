package com.example.oct29

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class LanguageAlertBox : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_language_alert_box)

        val changeLanguageButton = findViewById<Button>(R.id.butt)

        changeLanguageButton.setOnClickListener {
            val languages = arrayOf("English", "Spanish", "Russian")

            val dialogBuilder = AlertDialog.Builder(this)
                .setTitle("Select Language")
                .setItems(languages) { dialog, which ->
                    val selectedLanguage = languages[which]
                    Toast.makeText(this, "Selected: $selectedLanguage", Toast.LENGTH_SHORT).show()
                    dialog.dismiss()
                }
                .setNegativeButton("Cancel") { dialog, _ ->
                    dialog.dismiss()
                }

            val dialog = dialogBuilder.create()
            dialog.show()
        }
    }
}
