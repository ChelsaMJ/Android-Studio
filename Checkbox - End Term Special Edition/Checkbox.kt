package com.example.learningapp

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Checkbox : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkbox)

        val drawing = findViewById<CheckBox>(R.id.cb1)
        val cooking = findViewById<CheckBox>(R.id.cb2)
        val exercise = findViewById<CheckBox>(R.id.cb3)
        val swimming = findViewById<CheckBox>(R.id.cb4)
        val view = findViewById<Button>(R.id.b1)

        view.setOnClickListener {
            val sh = mutableListOf<String>()

            if (drawing.isChecked) sh.add("Drawing")
            if (cooking.isChecked) sh.add("Cooking")
            if (exercise.isChecked) sh.add("Exercising")
            if (swimming.isChecked) sh.add("Swimming")

            val message = if (sh.isNotEmpty()) {
                "Selected Hobbies: ${sh.joinToString(", ")}"
            } else {
                "No hobbies selected"
            }

            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        }
    }
}
