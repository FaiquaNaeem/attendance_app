package com.example.shopping_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)
        val attendance = findViewById<Button>(R.id.attendance)
        val textView6 = findViewById<TextView>(R.id.textview6)
        val timetable = findViewById<Button>(R.id.timetable)
        var name = intent.extras?.getString("name").toString()
        textView6.text = name
        attendance.setOnClickListener {
            startActivity(Intent(this,MainActivity2::class.java))
        }
        //timetable.setOnClickListener {
            //startActivity(Intent(this,Mainactivity4::class.java))
        //}

    }
}