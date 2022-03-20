package com.example.scheduler

import android.view.View
import com.example.scheduler.CalendarAdapter.OnItemListner
import androidx.recyclerview.widget.RecyclerView
import android.widget.TextView
import com.example.scheduler.R

class CalendarViewHolder(itemView: View, onItemListner: OnItemListner) :
    RecyclerView.ViewHolder(itemView), View.OnClickListener {
    val dayOfMonth: TextView
    private val onItemListner: OnItemListner
    override fun onClick(v: View) {
        onItemListner.onItemClick(adapterPosition, dayOfMonth.text as String)
    }

    init {
        dayOfMonth = itemView.findViewById(R.id.cellDayText)
        this.onItemListner = onItemListner
        itemView.setOnClickListener(this)
    }
}