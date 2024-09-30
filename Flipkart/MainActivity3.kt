package com.example.myapplication67

import android.os.Bundle
import android.widget.Button
import android.widget.HorizontalScrollView
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import android.view.ViewGroup
import android.widget.LinearLayout.LayoutParams

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val searchButton = findViewById<Button>(R.id.search_button)
        val profileButton = findViewById<Button>(R.id.profileButton)
        val categoriesButton = findViewById<Button>(R.id.categoriesButton)
        val accountButton = findViewById<Button>(R.id.accountButton)
        val cartButton = findViewById<Button>(R.id.cartButton)

        searchButton.setOnClickListener {
            Toast.makeText(this, "Search clicked", Toast.LENGTH_SHORT).show()
        }

        profileButton.setOnClickListener {
            Toast.makeText(this, "Profile clicked", Toast.LENGTH_SHORT).show()
        }

        categoriesButton.setOnClickListener {
            Toast.makeText(this, "Categories clicked", Toast.LENGTH_SHORT).show()
        }

        accountButton.setOnClickListener {
            Toast.makeText(this, "Account clicked", Toast.LENGTH_SHORT).show()
        }

        cartButton.setOnClickListener {
            Toast.makeText(this, "Cart clicked", Toast.LENGTH_SHORT).show()
        }

        val techDevices = listOf(R.drawable.img_1, R.drawable.img_2, R.drawable.img_3, R.drawable.img_13, R.drawable.img_14)
        val clothes = listOf(R.drawable.img_4, R.drawable.img_5, R.drawable.img_6, R.drawable.img_15, R.drawable.img_16)
        val jewellery = listOf(R.drawable.img_7, R.drawable.img_8, R.drawable.img_9, R.drawable.img_17, R.drawable.img_18)
        val stationary = listOf(R.drawable.img_10, R.drawable.img_11, R.drawable.img_12, R.drawable.img_19, R.drawable.img_20)

        // Set up HorizontalScrollView for Tech Devices
        setupHorizontalScrollView(R.id.techLinearLayout, techDevices)

        // Set up HorizontalScrollView for Clothes
        setupHorizontalScrollView(R.id.clothesLinearLayout, clothes)

        // Set up HorizontalScrollView for Jewellery
        setupHorizontalScrollView(R.id.jewelleryLinearLayout, jewellery)

        // Set up HorizontalScrollView for Stationary
        setupHorizontalScrollView(R.id.stationaryLinearLayout, stationary)
    }

    private fun setupHorizontalScrollView(containerId: Int, imageResources: List<Int>) {
        val horizontalScrollView = findViewById<HorizontalScrollView>(containerId)
        val linearLayout = horizontalScrollView.getChildAt(0) as LinearLayout

        // Clear existing views
        linearLayout.removeAllViews()

        // Add image views
        for (imageRes in imageResources) {
            val imageView = ImageView(this).apply {
                setImageResource(imageRes)
                layoutParams = LayoutParams(
                    500, // Set width to fixed size
                    500  // Set height to fixed size
                ).apply {
                    marginEnd = 16 // Margin between items
                }
                scaleType = ImageView.ScaleType.CENTER_CROP // Adjust as needed
                setPadding(16, 16, 16, 16) // Padding around the item
            }

            imageView.setOnClickListener {
                Toast.makeText(this, "Image clicked", Toast.LENGTH_SHORT).show()
            }

            linearLayout.addView(imageView)
        }
    }
}
