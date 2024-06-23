package com.example.pract7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var counter: Int = 0
    private var counter2: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var textView = findViewById<TextView>(R.id.textView)
        var textView2 = findViewById<TextView>(R.id.textView2)
        var button = findViewById<Button>(R.id.button)
        button.setOnClickListener{
            textView.text = "Hello, friend!"
        }
        var buttonCounter = findViewById<Button>(R.id.button_count)
        buttonCounter.setOnClickListener{
            textView.text = "Я нажал на кнопку ${++counter} раз"
        }
        var buttonCounter2 = findViewById<Button>(R.id.button_count2)
        buttonCounter2.setOnClickListener{
            textView2.text = "Я нажал на изображение ${++counter2} раз"
        }
    }
}