package com.example.dutyareaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlin.concurrent.timer

class tempactivity : AppCompatActivity() {

    private var time = 5

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tempactivity)

        val timertext2 : TextView = findViewById(R.id.timerText2)

        timer(period = 1000, initialDelay = 1000){
            time--
            runOnUiThread{
                timertext2.setText("${time}초 후 자동으로 메인 화면으로 이동합니다.")
                if(time == 0){
                    onBackPressed()
                }
            }
        }
    }
}