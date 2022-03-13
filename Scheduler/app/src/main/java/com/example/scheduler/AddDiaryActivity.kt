package com.example.scheduler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AddDiaryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_diary)

        var buttonBack = findViewById<Button>(R.id.buttonBack)

        buttonBack.setOnClickListener {
            finish()
        }

    }
}