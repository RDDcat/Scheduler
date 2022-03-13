package com.example.scheduler

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class DiaryListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diary_list)


        var buttonMain = findViewById<Button>(R.id.buttonMain)
        var buttonSwitch = findViewById<Button>(R.id.buttonSwitch)
        var buttonAddDiary = findViewById<Button>(R.id.buttonAddDiary)


        buttonMain.setOnClickListener {
            finish()
        }

        buttonSwitch.setOnClickListener {
            val intent = Intent(this, DiaryCalendarListActivity::class.java)
            finish()
            startActivity(intent)
        }

        buttonAddDiary.setOnClickListener {
            val intent = Intent(this, AddDiaryActivity::class.java)
            startActivity(intent)
        }

    }
}