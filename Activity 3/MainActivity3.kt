package com.example.kot2

import android.os.Bundle
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)
        var a = findViewById<RadioGroup>(R.id.radioGroup)
        var b = findViewById<CheckBox>(R.id.checkbox)
        var c = findViewById<CheckBox>(R.id.checkbox2)
        var d = findViewById<CheckBox>(R.id.checkbox3)
        var e = findViewById<TextView>(R.id.textView3)
        var f = findViewById<RadioButton>(R.id.radioButton)
        var g = findViewById<RadioButton>(R.id.radioButton4)
        var h = findViewById<RadioButton>(R.id.radioButton3)
        b.setOnClickListener {
            var i =
                a.checkedRadioButtonId
            val pizzaSize = when (i) {
                R.id.radioButton -> "Regular"
                R.id.radioButton4 -> "Medium"
                R.id.radioButton3 -> "Large"
                else -> ""


            }
            val toppings = mutableListOf<String>()
            if (b.isChecked) toppings.add("Paneer")
            if (c.isChecked) toppings.add("Extra Cheese")
            val orderSummary = "Pizza Size: $pizzaSize\nToppings: ${toppings.joinToString()}"
            Toast.makeText(this, orderSummary, Toast.LENGTH_LONG).show()

        }
    }

}
