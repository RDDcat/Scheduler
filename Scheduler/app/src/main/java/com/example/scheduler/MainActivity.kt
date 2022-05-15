package com.example.scheduler

import android.content.Intent
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.view.*
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var button : Button
    lateinit var tv: TextView
    lateinit var sv: HorizontalScrollView
    lateinit var layout: LinearLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setFullScreen()
        setTvDate()

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
                button.setBackgroundResource(R.drawable.menu)
            }
            val mtodButton = findViewById<Button>(R.id.DiaryListButton)
            mtodButton.setOnClickListener {
                val mtodlIntent = Intent(this, DiaryListActivity::class.java)
                startActivity(mtodlIntent)
                hideMenu.visibility = View.GONE
                button.setBackgroundResource(R.drawable.menu)
            }
            val mtoacButton = findViewById<Button>(R.id.AddCalendarButton)
            mtoacButton.setOnClickListener {
                val mtoacIntent = Intent(this, AddCalendarActivity::class.java)
                startActivity(mtoacIntent)
                hideMenu.visibility = View.GONE
                button.setBackgroundResource(R.drawable.menu)
            }
            val mtosButton = findViewById<Button>(R.id.SettingButton)
            mtosButton.setOnClickListener {
                val mtosIntent = Intent(this, SettingActivity::class.java)
                startActivity(mtosIntent)
                hideMenu.visibility = View.GONE
                button.setBackgroundResource(R.drawable.menu)
            }
            val mtotdButton = findViewById<Button>(R.id.ToDoListButton)
            mtotdButton.setOnClickListener {
                val mtotdlIntent = Intent(this, ToDoListActivity::class.java)
                startActivity(mtotdlIntent)
                hideMenu.visibility = View.GONE
                button.setBackgroundResource(R.drawable.menu)
            }
            val mtoedButton = findViewById<Button>(R.id.EmotionDiaryButton)
            mtoedButton.setOnClickListener {
                val mtoedIntent = Intent(this, EmotionDiaryActivity::class.java)
                startActivity(mtoedIntent)
                hideMenu.visibility = View.GONE
                button.setBackgroundResource(R.drawable.menu)
            }
            val shareButton = findViewById<Button>(R.id.ShareButton)
            shareButton.setOnClickListener {
                Toast.makeText(applicationContext, "공유하기", Toast.LENGTH_SHORT).show()
                hideMenu.visibility = View.GONE
                button.setBackgroundResource(R.drawable.menu)
            }
        }

        tv = findViewById(R.id.tvDate5)
        tv.setBackgroundColor(Color.parseColor("#ff00ff"))
        sv = findViewById(R.id.scrollView)
        sv.isHorizontalScrollBarEnabled = false

        val postit = findViewById<ImageView>(R.id.img_post)
        postit.setOnClickListener {
            val mtotdlintent = Intent(applicationContext,ToDoListActivity::class.java)
            startActivity(mtotdlintent)
            hideMenu.visibility = View.GONE
        }
    }

    override fun onStart() {
        super.onStart()
        layout = findViewById(R.id.svView4)
        sv = findViewById(R.id.scrollView)
        layout.viewTreeObserver.addOnGlobalLayoutListener(object : ViewTreeObserver.OnGlobalLayoutListener {
            override fun onGlobalLayout() {
                sv.smoothScrollTo(layout.left,0)
                layout.viewTreeObserver.removeOnGlobalLayoutListener(this)
            }
        })
    }
    private fun setFullScreen(){
        supportActionBar?.hide()

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.R){
            window.setDecorFitsSystemWindows(false)
            val controller = window.insetsController
            if(controller != null){
                controller.hide(WindowInsets.Type.statusBars() or WindowInsets.Type.navigationBars())
                controller.systemBarsBehavior = WindowInsetsController.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
            }
        } else {
            window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_FULLSCREEN)
        }
    }
    private fun setTvDate(){
        var dateary = arrayOf("일","월","화","수","목","금","토")
        var tvIdAry = arrayOf(R.id.tvDate0,R.id.tvDate1,R.id.tvDate2,R.id.tvDate3,R.id.tvDate4,R.id.tvDate5,R.id.tvDate6,R.id.tvDate7,R.id.tvDate8,
            R.id.tvDate9,R.id.tvDate10,R.id.tvDate11,R.id.tvDate12,R.id.tvDate13,R.id.tvDate14,R.id.tvDate15,R.id.tvDate16)
        var tvAry = arrayOfNulls<TextView>(17)
        for(i in tvIdAry.indices){
            tvAry[i] = findViewById(tvIdAry[i])
        }
        for(i in tvAry.indices) {
            var calendar = Calendar.getInstance()
            calendar.add(Calendar.DAY_OF_MONTH,(i-5))
            tvAry[i]!!.setText("${dateary[calendar.get(Calendar.DAY_OF_WEEK) - 1]} (${calendar.get(Calendar.MONTH) + 1}/${calendar.get(Calendar.DAY_OF_MONTH)})")
        }
    }
}
