package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    val button: Button = findViewById(R.id.button)
    val Tv: TextView = findViewById(R.id.textView)
    val newString : String = "I'm Noel"



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button.setOnClickListener(){

            Tv.text = newString
        }


    }
}
