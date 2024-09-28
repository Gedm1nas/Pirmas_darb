package com.example.pirmas_darbas

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.graphics.Color

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main) // Ensure this is the correct layout ID
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    // Define the button click function outside of onCreate
    fun btnChangeTextClick(view: View) {
        // Load and use views afterwards
        val tvMain: TextView = findViewById(R.id.tvMain)
        tvMain.text = "Sveiki"
    }

    fun btnChangeColourClick(view: View) {
        // Load and use views afterwards
        val tvMain: TextView = findViewById(R.id.tvMain)
        tvMain.text = "Sveiki"
        tvMain.setTextColor(Color.RED) // Change text color to red
    }
}
