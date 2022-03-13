package com.example.scheduler

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DiaryCalendarListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diary_calendar_list)

        var buttonMain = findViewById<Button>(R.id.buttonMain)
        var buttonSwitch = findViewById<Button>(R.id.buttonSwitch)
        var buttonAddDiary = findViewById<Button>(R.id.buttonAddDiary)

        buttonMain.setOnClickListener {
            finish()
        }

        buttonSwitch.setOnClickListener {
            val intent = Intent(this, DiaryListActivity::class.java)
            finish()
            startActivity(intent)
        }

        buttonAddDiary.setOnClickListener {
            val intent = Intent(this, AddDiaryActivity::class.java)
            startActivity(intent)
        }

    }
}