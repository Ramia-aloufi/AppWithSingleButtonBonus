package com.example.appwithsinglebuttonbonus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var tv:TextView
    lateinit var btn:Button
    lateinit var et:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv = findViewById(R.id.textView)
        et = findViewById(R.id.editTextTextPersonName)
        btn = findViewById(R.id.button)

        btn.setOnClickListener {
            tv.text = et.text.toString()
            et.text.clear()
        }

    }
}