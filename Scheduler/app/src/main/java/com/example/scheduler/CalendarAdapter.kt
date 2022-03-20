package com.example.scheduler

import com.example.scheduler.CalendarAdapter.OnItemListner
import androidx.recyclerview.widget.RecyclerView
import com.example.scheduler.CalendarViewHolder
import android.view.ViewGroup
import android.view.LayoutInflater
import com.example.scheduler.R
import java.util.ArrayList

class CalendarAdapter(
    private val daysOfMonth: ArrayList<String>,
    private val onItemListner: OnItemListner
) : RecyclerView.Adapter<CalendarViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CalendarViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.calendar_cell, parent, false)
        val layoutParams = view.layoutParams
        layoutParams.height = (parent.height * 0.166666666).toInt()
        return CalendarViewHolder(view, onItemListner)
    }

    override fun onBindViewHolder(holder: CalendarViewHolder, position: Int) {
        holder.dayOfMonth.text = daysOfMonth[position]
    }

    override fun getItemCount(): Int {
        return daysOfMonth.size
    }

    interface OnItemListner {
        fun onItemClick(position: Int, dayText: String?)
    }
}