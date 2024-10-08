package com.example.bouquet

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val imageResource = intent.getIntExtra("imageResource", 0)
        val productImage: ImageView = findViewById(R.id.cart_product_image)
        productImage.setImageResource(imageResource)

        val deleteButton: Button = findViewById(R.id.delete_button)
        val buyButton: Button = findViewById(R.id.buy_button)

        // Handle delete button click
        deleteButton.setOnClickListener {
            // Logic to delete the product from the cart
            Toast.makeText(this, "Product removed from cart", Toast.LENGTH_SHORT).show()
            // Optionally, you can finish this activity to return to the previous screen
            finish()
        }

        // Handle buy button click
        buyButton.setOnClickListener {
            // Logic to handle the purchase of the product
            Toast.makeText(this, "Product purchased successfully", Toast.LENGTH_SHORT).show()
            finish()
            // Logic to proceed to checkout or payment gateway can go here
        }
    }
}
