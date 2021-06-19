package com.example.binaryvedapracticalapp

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val register = findViewById<TextView>(R.id.register)
        register.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }
    }
}