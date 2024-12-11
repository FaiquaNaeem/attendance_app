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
        val btn1 = findViewById<Button>(R.id.btn1)
        val textView6 = findViewById<TextView>(R.id.textview6)
        val tv = findViewById<TextView>(R.id.tv)
        var name = intent.extras?.getString("name").toString()
        textView6.text=name

        btn1.setOnClickListener{
            val makhni = findViewById<CheckBox>(R.id.makhni)
            val rice = findViewById<CheckBox>(R.id.rice)
            val paneer = findViewById<CheckBox>(R.id.paneer)
            val sabzi = findViewById<CheckBox>(R.id.sabzi)
            val chapati = findViewById<CheckBox>(R.id.chapati)
            val drink = findViewById<CheckBox>(R.id.drink)
            val raita = findViewById<CheckBox>(R.id.raita)
            val papad = findViewById<CheckBox>(R.id.papad)
            var opt_txt = "You selected "
            if(makhni.isChecked){
                opt_txt +=makhni.text.toString()+" "
            }
            if(chapati.isChecked){
                opt_txt+=chapati.text.toString()+" "
            }
            if(sabzi.isChecked){
                opt_txt+=sabzi.text.toString()+" "
            }
            if( rice.isChecked){
                opt_txt+=rice.text.toString()+" "
            }
            if( drink.isChecked){
                opt_txt+=drink.text.toString()+" "
            }
            if( raita.isChecked){
                opt_txt+=raita.text.toString()+" "
            }
            if( papad.isChecked){
                opt_txt+=papad.text.toString()+" "
            }
            else{
                opt_txt+=""
            }
            tv.text = opt_txt


        }



    }
}