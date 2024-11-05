package com.example.oct29

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.RatingBar
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.roundToInt

class ExitButton : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exit_button)

        val exitButton = findViewById<Button>(R.id.b)
        val rateAppButton = findViewById<Button>(R.id.button_rate_app)

        // Exit Button Functionality
        exitButton.setOnClickListener {
            val exitDialog = AlertDialog.Builder(this)
            exitDialog.setTitle("Exit")
            exitDialog.setMessage("Do you want to exit?")
            exitDialog.setCancelable(false)
            exitDialog.setPositiveButton("Yes") { _, _ -> finish() }
            exitDialog.setNegativeButton("No") { dialog, _ -> dialog.dismiss() }
            exitDialog.setNeutralButton("Maybe") { dialog, _ -> dialog.cancel() }
            exitDialog.create().show()
        }

        // Rate App Button Functionality
        rateAppButton.setOnClickListener {
            val rateDialog = AlertDialog.Builder(this)
            rateDialog.setTitle("Rate the App")
            rateDialog.setMessage("Would you like to rate the app?")
            rateDialog.setCancelable(false)

            rateDialog.setPositiveButton("Yes") { _, _ ->
                showRatingDialog()
            }

            rateDialog.setNegativeButton("No") { dialog, _ -> dialog.dismiss() }

            rateDialog.setNeutralButton("Remind me later") { dialog, _ -> dialog.cancel() }

            rateDialog.create().show()
        }
    }

    // Method to display the rating dialog with 5-star rating
    private fun showRatingDialog() {
        // Inflate the custom rating dialog layout
        val dialogView = LayoutInflater.from(this).inflate(R.layout.dialog_rate_app, null)
        val ratingBar = dialogView.findViewById<RatingBar>(R.id.ratingBar)

        val ratingDialog = AlertDialog.Builder(this)
            .setView(dialogView)
            .setPositiveButton("Submit") { _, _ ->
                val rating = ratingBar.rating.roundToInt()  // Round to nearest integer
                Toast.makeText(this, "The app has been rated $rating stars", Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("Cancel") { dialog, _ -> dialog.dismiss() }
            .create()

        ratingDialog.show()
    }
}
