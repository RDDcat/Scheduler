package com.example.scheduler

import android.content.Intent
import android.os.Bundle
import android.view.*
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    lateinit var button : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.MenuButton)
        val hideMenu = findViewById<LinearLayout>(R.id.layoutHideMenu)
        button.setOnClickListener {
            if(hideMenu.isVisible){
                hideMenu.visibility = View.GONE
                button.setBackgroundResource(R.drawable.menu)
            }
            else {
                hideMenu.visibility = View.VISIBLE
                button.setBackgroundResource(R.drawable.simplex)
            }
            val mtocButton = findViewById<Button>(R.id.CalendarButton)
            mtocButton.setOnClickListener {
                val mtocIntent = Intent(this, CalendarActivity::class.java)
                startActivity(mtocIntent)
                hideMenu.visibility = View.GONE
            }
            val mtodButton = findViewById<Button>(R.id.DiaryListButton)
            mtodButton.setOnClickListener {
                val mtodlIntent = Intent(this, DiaryListActivity::class.java)
                startActivity(mtodlIntent)
                hideMenu.visibility = View.GONE
            }
            val mtoacButton = findViewById<Button>(R.id.AddCalendarButton)
            mtoacButton.setOnClickListener {
                val mtoacIntent = Intent(this, AddCalendarActivity::class.java)
                startActivity(mtoacIntent)
                hideMenu.visibility = View.GONE
            }
            val mtosButton = findViewById<Button>(R.id.SettingButton)
            mtosButton.setOnClickListener {
                val mtosIntent = Intent(this, SettingActivity::class.java)
                startActivity(mtosIntent)
                hideMenu.visibility = View.GONE
            }
            val mtotdButton = findViewById<Button>(R.id.ToDoListButton)
            mtotdButton.setOnClickListener {
                val mtotdlIntent = Intent(this, ToDoListActivity::class.java)
                startActivity(mtotdlIntent)
                hideMenu.visibility = View.GONE
            }
            val mtoedButton = findViewById<Button>(R.id.EmotionDiaryButton)
            mtoedButton.setOnClickListener {
                val mtoedIntent = Intent(this, EmotionDiaryActivity::class.java)
                startActivity(mtoedIntent)
                hideMenu.visibility = View.GONE
            }
            val shareButton = findViewById<Button>(R.id.ShareButton)
            shareButton.setOnClickListener {
                Toast.makeText(applicationContext, "공유하기", Toast.LENGTH_SHORT).show()
                hideMenu.visibility = View.GONE
            }
        }

        var postit = findViewById<ImageView>(R.id.img_post)
        postit.setOnClickListener {
            var intent = Intent(applicationContext,ToDoListActivity::class.java)
            startActivity(intent)
        }
    }
}
