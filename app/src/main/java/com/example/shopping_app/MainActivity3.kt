package com.example.shopping_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)
        val btn1 = findViewById<Button>(R.id.btn1)
        val textView6 = findViewById<TextView>(R.id.textview6)
        var name = intent.extras?.getString("name").toString()
        textView6.text=name
        btn1.setOnClickListener {
            startActivity(Intent(this,MainActivity3::class.java))
            Toast.makeText(getApplicationContext(), "Order Placed" , Toast.LENGTH_LONG).show();
        }

    }
}