package com.example.myportfolio

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val toolbar: androidx.appcompat.widget.Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        // Set up the ImageButtons with their intents
        val btnAcademics: ImageButton = findViewById(R.id.btnAcademics)
        val btnHobbies: ImageButton = findViewById(R.id.btnHobbies)
        val btnProjects: ImageButton = findViewById(R.id.btnProjects)
        val btnSkills: ImageButton = findViewById(R.id.btnSkills)
        val btnAchievements: ImageButton = findViewById(R.id.btnAchievements)
        val btnContact: ImageButton = findViewById(R.id.btnGallery)

        // Set onClickListeners for each ImageButton
        btnAcademics.setOnClickListener {
            val intent = Intent(this, AcademicsActivity::class.java)
            startActivity(intent)
        }

        btnHobbies.setOnClickListener {
            val intent = Intent(this, HobbiesActivity::class.java)
            startActivity(intent)
        }

        btnProjects.setOnClickListener {
            val intent = Intent(this, ProjectsActivity::class.java)
            startActivity(intent)
        }

        btnSkills.setOnClickListener {
            val intent = Intent(this, SkillsActivity::class.java)
            startActivity(intent)
        }

        btnAchievements.setOnClickListener {
            val intent = Intent(this, AchievementsActivity::class.java)
            startActivity(intent)
        }

        btnContact.setOnClickListener {
            val intent = Intent(this, GalleryActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.i1 -> {
                // Intent to open email app for sending an email
                val emailIntent = Intent(Intent.ACTION_SEND).apply {
                    type = "message/rfc822"
                    putExtra(Intent.EXTRA_EMAIL, arrayOf("alex.merc10101@gmail.com"))
                    putExtra(Intent.EXTRA_SUBJECT, "Subject Here")
                }
                // Check if an email app is available and start the intent
                try {
                    startActivity(Intent.createChooser(emailIntent, "Send Email"))
                } catch (ex: android.content.ActivityNotFoundException) {
                    Toast.makeText(this, "No email app found", Toast.LENGTH_SHORT).show()
                }
                true
            }

            R.id.i2 -> {
                // Implicit intent to open the dial pad with a phone number
                val dialIntent = Intent(Intent.ACTION_DIAL).apply {
                    data = Uri.parse("tel:1234567890")
                }
                startActivity(dialIntent)
                true
            }

            R.id.i3 -> {
                // Intent to open Google Form feedback link in a web browser
                val feedbackFormUrl = "https://forms.gle/7ZQDSr56HLwzvXD98"
                val feedbackIntent = Intent(Intent.ACTION_VIEW, Uri.parse(feedbackFormUrl))
                startActivity(feedbackIntent)
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }

}
