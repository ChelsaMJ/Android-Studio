package com.example.learningapp

import android.content.res.Configuration
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Locale

@Suppress("DEPRECATION")
class AppLocale : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_app_locale)

        val b1 = findViewById<Button>(R.id.engb)
        val b2 = findViewById<Button>(R.id.hinb)

        b1.setOnClickListener{
            setLocale("en")
        }
        b2.setOnClickListener{
            setLocale("hi")
        }
    }

    fun setLocale(langCode: String){
        val current = resources.configuration.locales.get(0).language
        if(langCode!= current){
            val l = Locale(langCode)
            Locale.setDefault(l)
            val c = Configuration(resources.configuration)
            c.setLocale(l)
            resources.updateConfiguration(c, resources.displayMetrics)


        }
        recreate()
    }
}