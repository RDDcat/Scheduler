package com.example.scheduler

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var button : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button1)
        button.setOnClickListener {
            val mtocIntent = Intent(this, CalendarActivity::class.java)
            startActivity(mtocIntent)
        }
        button = findViewById(R.id.button2)
        button.setOnClickListener {
            val mtodlIntent = Intent(this, DiaryListActivity::class.java)
            startActivity(mtodlIntent)
        }
        button = findViewById(R.id.button3)
        button.setOnClickListener {
            val mtotdlIntent = Intent(this, ToDoListActivity::class.java)
            startActivity(mtotdlIntent)
        }
        button = findViewById(R.id.button4)
        button.setOnClickListener {
            val mtoacIntent = Intent(this, AddCalendarActivity::class.java)
            startActivity(mtoacIntent)
        }
        button = findViewById(R.id.button5)
        button.setOnClickListener {
            val mtosIntent = Intent(this, SettingActivity::class.java)
            startActivity(mtosIntent)
        }
        button = findViewById(R.id.button6)
        button.setOnClickListener {
            val mtoedIntent = Intent(this, EmotionDiaryActivity::class.java)
            startActivity(mtoedIntent)
        }
        button = findViewById(R.id.button7)
        button.setOnClickListener {
            Toast.makeText(applicationContext, "공유하기", Toast.LENGTH_SHORT).show()
        }
        button = findViewById(R.id.button8)
        button.setOnClickListener {
            Toast.makeText(applicationContext, "메뉴", Toast.LENGTH_SHORT).show()
        }
    }
}