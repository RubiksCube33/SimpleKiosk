package com.example.dutyareaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 : android.widget.Button = findViewById(R.id.button1)
        val btn2 : android.widget.Button = findViewById(R.id.button2)
        val btn3 : android.widget.Button = findViewById(R.id.button3)
        val btn4 : android.widget.Button = findViewById(R.id.button4)

        btn1.setOnClickListener{
            val intent = Intent(this, Activity_Button1::class.java)
            startActivity(intent)
        }
        btn2.setOnClickListener{
            val intent = Intent(this, Activity_Button1::class.java)
            startActivity(intent)
        }
        btn3.setOnClickListener{
            val intent = Intent(this, tempactivity::class.java)
            startActivity(intent)
        }
        btn4.setOnClickListener{
            val intent = Intent(this, Activity_Button1::class.java)
            startActivity(intent)
        }
    }


}