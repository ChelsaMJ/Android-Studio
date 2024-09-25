package com.example.kot2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main5)

        var a = findViewById<EditText>(R.id.editTextText2)
        var b = findViewById<EditText>(R.id.editTextText3)
        var butt = findViewById<Button>(R.id.button2)
        var txtvw = findViewById<TextView>(R.id.textView)

        butt.setOnClickListener{
            var c = a.text.toString()
            var d = b.text.toString()
            txtvw.text = "Your name is:"+ c +"\nYour number is:"+ d
        }

    }
}
