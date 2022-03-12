package com.example.scheduler

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class DiaryListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diary_list)


        var buttonMain = findViewById<Button>(R.id.buttonMain)

        buttonMain.setOnClickListener {
            finish()
        }
    }
}