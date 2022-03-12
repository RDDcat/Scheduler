package com.example.scheduler

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class EmotionDiaryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_emotion_diary)

        var buttonMain = findViewById<Button>(R.id.buttonMain)

        buttonMain.setOnClickListener {
            finish()
        }
    }
}