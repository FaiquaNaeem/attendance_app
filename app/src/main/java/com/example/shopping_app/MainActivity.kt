package com.example.shopping_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        val name:EditText = findViewById(R.id.name)

        button.setOnClickListener {
            startActivity(Intent(this,MainActivity3::class.java).putExtra("name",name.text.toString()))
            finish()
        }
    }
}