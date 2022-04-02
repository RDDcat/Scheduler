package com.example.scheduler

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    lateinit var button : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.MenuButton)
        var linear = findViewById<LinearLayout>(R.id.linear)
        button.setOnClickListener {
            if(linear.isVisible){
                linear.setVisibility(View.GONE)
            }
            else {
                linear.setVisibility(View.VISIBLE)
            }
            val mtocButton = findViewById<Button>(R.id.CalendarButton)
            mtocButton.setOnClickListener {
                val mtocIntent = Intent(this, CalendarActivity::class.java)
                startActivity(mtocIntent)
                linear.setVisibility(View.GONE)
            }
            val mtodButton = findViewById<Button>(R.id.DiaryListButton)
            mtodButton.setOnClickListener {
                val mtodlIntent = Intent(this, DiaryListActivity::class.java)
                startActivity(mtodlIntent)
                linear.setVisibility(View.GONE)
            }
            val mtoacButton = findViewById<Button>(R.id.AddCalendarButton)
            mtoacButton.setOnClickListener {
                val mtoacIntent = Intent(this, AddCalendarActivity::class.java)
                startActivity(mtoacIntent)
                linear.setVisibility(View.GONE)
            }
            val mtosButton = findViewById<Button>(R.id.SettingButton)
            mtosButton.setOnClickListener {
                val mtosIntent = Intent(this, SettingActivity::class.java)
                startActivity(mtosIntent)
                linear.setVisibility(View.GONE)
            }
            val mtotdButton = findViewById<Button>(R.id.ToDoListButton)
            mtotdButton.setOnClickListener {
                val mtotdlIntent = Intent(this, ToDoListActivity::class.java)
                startActivity(mtotdlIntent)
                linear.setVisibility(View.GONE)
            }
            val mtoedButton = findViewById<Button>(R.id.EmotionDiaryButton)
            mtoedButton.setOnClickListener {
                val mtoedIntent = Intent(this, EmotionDiaryActivity::class.java)
                startActivity(mtoedIntent)
                linear.setVisibility(View.GONE)
            }
            val shareButton = findViewById<Button>(R.id.ShareButton)
            shareButton.setOnClickListener {
                Toast.makeText(applicationContext, "공유하기", Toast.LENGTH_SHORT).show()
                linear.setVisibility(View.GONE)
            }
//            val popupView = LayoutInflater.from(this).inflate(R.layout.menu_popup, null)
//            val mBuilder = AlertDialog.Builder(this).setView(popupView)
//
//            val mAlertDialog = mBuilder.show()
//            val mtocButton = popupView.findViewById<Button>(R.id.CalendarButton)
//            mtocButton.setOnClickListener {
//                val mtocIntent = Intent(this, CalendarActivity::class.java)
//                startActivity(mtocIntent)
//                mAlertDialog.dismiss()
//            }
//            val mtodButton = popupView.findViewById<Button>(R.id.DiaryListButton)
//            mtodButton.setOnClickListener {
//                val mtodlIntent = Intent(this, DiaryListActivity::class.java)
//                startActivity(mtodlIntent)
//                mAlertDialog.dismiss()
//            }
//            val mtoacButton = popupView.findViewById<Button>(R.id.AddCalendarButton)
//            mtoacButton.setOnClickListener {
//                val mtoacIntent = Intent(this, AddCalendarActivity::class.java)
//                startActivity(mtoacIntent)
//                mAlertDialog.dismiss()
//            }
//            val mtosButton = popupView.findViewById<Button>(R.id.SettingButton)
//            mtosButton.setOnClickListener {
//                val mtosIntent = Intent(this, SettingActivity::class.java)
//                startActivity(mtosIntent)
//                mAlertDialog.dismiss()
//            }
//            val mtotdButton = popupView.findViewById<Button>(R.id.ToDoListButton)
//            mtotdButton.setOnClickListener {
//                val mtotdlIntent = Intent(this, ToDoListActivity::class.java)
//                startActivity(mtotdlIntent)
//                mAlertDialog.dismiss()
//            }
//            val mtoedButton = popupView.findViewById<Button>(R.id.EmotionDiaryButton)
//            mtoedButton.setOnClickListener {
//                val mtoedIntent = Intent(this, EmotionDiaryActivity::class.java)
//                startActivity(mtoedIntent)
//                mAlertDialog.dismiss()
//            }
//            val shareButton = popupView.findViewById<Button>(R.id.ShareButton)
//            shareButton.setOnClickListener {
//                Toast.makeText(applicationContext, "공유하기", Toast.LENGTH_SHORT).show()
//                mAlertDialog.dismiss()
//            }
        }
    }
}