package com.example.dutyareaapp

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.widget.TextView
import androidx.annotation.RequiresApi
import kotlin.concurrent.timer

class Activity_Button1 : AppCompatActivity() {

    private var time = 5
    private var textToSpeech: TextToSpeech? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity__button1)

        val timertext : TextView = findViewById(R.id.timerText2)

        timer(period = 1000, initialDelay = 1000){
            time--
            runOnUiThread{
                timertext.setText("${time}초 후 자동으로 메인 화면으로 이동합니다.")
                if(time == 0){
                    onBackPressed()
                }
            }
        }

    }
}