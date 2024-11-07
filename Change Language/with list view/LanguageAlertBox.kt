package com.example.oct29

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class LanguageAlertBox : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_language_alert_box)

        val changeLanguageButton = findViewById<Button>(R.id.butt)

        changeLanguageButton.setOnClickListener {
            val dialogView = LayoutInflater.from(this).inflate(R.layout.lang_alert, null)
            val languageListView = dialogView.findViewById<ListView>(R.id.languageListView)
            val languages = arrayOf("English", "Spanish", "Russian")
            val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, languages)
            languageListView.adapter = adapter

            val dialogBuilder = AlertDialog.Builder(this)
                .setView(dialogView)
                .setTitle("Select Language")
                .setNegativeButton("Cancel") { dialog, _ -> dialog.dismiss() }

            val dialog = dialogBuilder.create()
            dialog.show()

            languageListView.setOnItemClickListener { _, _, position, _ ->
                val selectedLanguage = languages[position]
                Toast.makeText(this, "Selected: $selectedLanguage", Toast.LENGTH_SHORT).show()
                dialog.dismiss()
            }
        }
    }
}
