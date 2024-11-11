package com.example.oct29

import android.graphics.Color
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.graphics.rotationMatrix
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ColorRotate : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_color_rotate)

        var j1 =findViewById<ImageView>(R.id.mi1)
        registerForContextMenu(j1)
    }

    override fun onCreateContextMenu(
        menu: ContextMenu,
        v: View,
        menuInfo: ContextMenu.ContextMenuInfo?
    )

    {
        super.onCreateContextMenu(menu, v, menuInfo)
        val j2: MenuInflater=menuInflater
        j2.inflate(R.menu.main_menu, menu)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        var j3 = findViewById<ImageView>(R.id.mi1)
        return when (item.itemId){
            R.id.i1 -> {
                j3.setColorFilter(Color.BLUE)
                Toast.makeText(this, "Image color changed to red", Toast.LENGTH_LONG).show()
                true
            }

            R.id.i2-> {
                j3.rotation = j3.rotation+45f
                Toast.makeText(this, "Rotated to 45 degrees", Toast.LENGTH_LONG).show()
                true
            }

            else->super.onContextItemSelected(item)
        }
    }
}

