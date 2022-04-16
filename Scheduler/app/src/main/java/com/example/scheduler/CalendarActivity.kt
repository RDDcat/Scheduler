package com.example.scheduler

import android.widget.Button
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowInsets
import android.view.WindowInsetsController
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.time.LocalDate
import java.time.YearMonth
import java.time.format.DateTimeFormatter

class CalendarActivity : AppCompatActivity(), CalendarAdapter.OnItemListner {
    private var monthYearText: TextView? = null
    private var calendarRecylerView: RecyclerView? = null
    private var selectedDate: LocalDate? = null


    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendar)
        setFullScreen()

        var buttonMain = findViewById<Button>(R.id.buttonMain)

        buttonMain.setOnClickListener {
            finish()
        }

        initWidgets();
        selectedDate = LocalDate.now();
        setMonthView();
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun setMonthView() {
        monthYearText?.setText(selectedDate?.let { monthYearFromDate(it) });
        var daysInMonth : ArrayList<String>  = daysInMonthArray(selectedDate)

        var calendarAdapter : CalendarAdapter = CalendarAdapter(daysInMonth,this)
        var layoutManager : RecyclerView.LayoutManager = GridLayoutManager(applicationContext,7)
        calendarRecylerView!!.layoutManager = layoutManager
        calendarRecylerView!!.adapter = calendarAdapter



    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun daysInMonthArray(date: LocalDate?): ArrayList<String> {
        var daysInMonthArray = ArrayList<String>()
        var yearMonth : YearMonth = YearMonth.from(date);

        var daysInMonth : Int = yearMonth.lengthOfMonth();

        var firstOfMonth : LocalDate = selectedDate!!.withDayOfMonth(1);
        var dayOfWeek : Int = firstOfMonth.dayOfWeek.value

        for(i in 1..42) {
            if(i<= dayOfWeek || i > daysInMonth + dayOfWeek){
                daysInMonthArray.add("")
            }
            else{
                daysInMonthArray.add((i-dayOfWeek).toString())
            }
        }
        return daysInMonthArray
    }


    @RequiresApi(Build.VERSION_CODES.O)
    private fun monthYearFromDate(date:LocalDate) : String{
        var formater : DateTimeFormatter = DateTimeFormatter.ofPattern("MMMM yyyy")
        return date.format(formater)
    }

    private fun initWidgets() {
        calendarRecylerView = findViewById(R.id.calendarRecyclerView)
        monthYearText = findViewById(R.id.monthYearTextView)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun previousMonthAction(view: View) {
        selectedDate = selectedDate?.minusMonths(1);
        setMonthView()
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun nextMonthAction(view: View) {
        selectedDate = selectedDate?.plusMonths(1);
        setMonthView()
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onItemClick(position: Int, dayText: String?) {
        if(dayText.equals("")){
            var message : String = "Selected Date " + dayText + " " + monthYearFromDate(selectedDate!!)
            Toast.makeText(this, message,Toast.LENGTH_LONG).show()
        }
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
}