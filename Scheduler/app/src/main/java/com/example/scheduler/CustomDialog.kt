package com.example.scheduler

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.DialogFragment

class CustomDialog: DialogFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val v = inflater.inflate(R.layout.menu_popup, container, false)
        val mtocButton = v.findViewById<Button>(R.id.CalendarButton)
        mtocButton.setOnClickListener {
//            val mtocIntent = Intent(this, CalendarActivity::class.java)
//            startActivity(mtocIntent)
            //Toast.makeText(, "클릭",Toast.LENGTH_SHORT).show()
        }
//        val mtodButton = findViewById<Button>(R.id.DiaryListButton)
//        mtodButton.setOnClickListener {
//            val mtodlIntent = Intent(this, DiaryListActivity::class.java)
//            startActivity(mtodlIntent)
//        }
//        val mtoacButton = findViewById<Button>(R.id.AddCalendarButton)
//        mtoacButton.setOnClickListener {
//            val mtoacIntent = Intent(this, AddCalendarActivity::class.java)
//            startActivity(mtoacIntent)
//        }
//        val mtosButton = findViewById<Button>(R.id.SettingButton)
//        mtosButton.setOnClickListener {
//            val mtosIntent = Intent(this, SettingActivity::class.java)
//            startActivity(mtosIntent)
//        }
//        val mtotdButton = findViewById<Button>(R.id.ToDoListButton)
//        mtotdButton.setOnClickListener {
//            val mtotdlIntent = Intent(this, ToDoListActivity::class.java)
//            startActivity(mtotdlIntent)
//        }
//        val mtoedButton = findViewById<Button>(R.id.EmotionDiaryButton)
//        mtoedButton.setOnClickListener {
//            val mtoedIntent = Intent(this, EmotionDiaryActivity::class.java)
//            startActivity(mtoedIntent)
//        }
//        val shareButton = findViewById<Button>(R.id.ShareButton)
//        shareButton.setOnClickListener {
//            Toast.makeText(applicationContext, "공유하기", Toast.LENGTH_SHORT).show()
//        }
        return v
    }
    override fun onStart() {
        super.onStart()
//        val width = (resources.displayMetrics.widthPixels*0.85).toInt()
//        val height = (resources.displayMetrics.heightPixels*0.40).toInt()
        dialog!!.window?.setLayout(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT)
    }

}