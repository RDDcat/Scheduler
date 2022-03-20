package com.example.scheduler

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var button : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.MenuButton)
        button.setOnClickListener {
            val popupView = LayoutInflater.from(this).inflate(R.layout.menu_popup, null)
            val mBuilder = AlertDialog.Builder(this).setView(popupView)

            val mAlertDialog = mBuilder.show()
            val mtocButton = popupView.findViewById<Button>(R.id.CalendarButton)
            mtocButton.setOnClickListener {
                val mtocIntent = Intent(this, CalendarActivity::class.java)
                startActivity(mtocIntent)
                mAlertDialog.dismiss()
            }
            val mtodButton = popupView.findViewById<Button>(R.id.DiaryListButton)
            mtodButton.setOnClickListener {
                val mtodlIntent = Intent(this, DiaryListActivity::class.java)
                startActivity(mtodlIntent)
                mAlertDialog.dismiss()
            }
            val mtoacButton = popupView.findViewById<Button>(R.id.AddCalendarButton)
            mtoacButton.setOnClickListener {
                val mtoacIntent = Intent(this, AddCalendarActivity::class.java)
                startActivity(mtoacIntent)
                mAlertDialog.dismiss()
            }
            val mtosButton = popupView.findViewById<Button>(R.id.SettingButton)
            mtosButton.setOnClickListener {
                val mtosIntent = Intent(this, SettingActivity::class.java)
                startActivity(mtosIntent)
                mAlertDialog.dismiss()
            }
            val mtotdButton = popupView.findViewById<Button>(R.id.ToDoListButton)
            mtotdButton.setOnClickListener {
                val mtotdlIntent = Intent(this, ToDoListActivity::class.java)
                startActivity(mtotdlIntent)
                mAlertDialog.dismiss()
            }
            val mtoedButton = popupView.findViewById<Button>(R.id.EmotionDiaryButton)
            mtoedButton.setOnClickListener {
                val mtoedIntent = Intent(this, EmotionDiaryActivity::class.java)
                startActivity(mtoedIntent)
                mAlertDialog.dismiss()
            }
            val shareButton = popupView.findViewById<Button>(R.id.ShareButton)
            shareButton.setOnClickListener {
                Toast.makeText(applicationContext, "공유하기", Toast.LENGTH_SHORT).show()
                mAlertDialog.dismiss()
            }
        }
    }
}