package ru.student.assistant.schedule.features.schedule

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import ru.student.assistant.schedule.R
import ru.student.core.entity.Schedule
import ru.suhov.student.core.platform.BaseAdapter
import ru.suhov.student.core.platform.BaseViewHolder

class DayFragmentAdapter : BaseAdapter<Schedule, DayFragmentAdapter.DayViewHolder>() {

    private lateinit var context: Context

    override fun onCreateViewHolder(p: ViewGroup, t: Int): DayViewHolder {
        context = p.context
        return DayViewHolder(LayoutInflater.from(p.context).inflate(R.layout.item_schedule, p, false))
    }

     class DayViewHolder(v: View) : BaseViewHolder<Schedule>(v) {

        val lesson: TextView = v.findViewById(R.id.text_lesson)
        val teacher: TextView = v.findViewById(R.id.text_lecturer)
        val type: TextView = v.findViewById(R.id.text_type)
        val building: TextView = v.findViewById(R.id.text_build)
        val lesson2: TextView = v.findViewById(R.id.text_lesson_d)
        val teacher2: TextView = v.findViewById(R.id.text_lecturer_d)
        val type2: TextView = v.findViewById(R.id.text_type_d)
        val building2: TextView = v.findViewById(R.id.text_build_d)

        val time1: TextView = v.findViewById(R.id.text_start_hour)
        val time2: TextView = v.findViewById(R.id.text_start_min)
        val time3: TextView = v.findViewById(R.id.text_remained)

        override fun bind(item: Schedule) {

            lesson.text = item.lesson
            teacher.text = item.teacher
            type.text = item.type
            building.text = item.building
            lesson2.text = item.lesson2
            teacher2.text = item.teacher2
            type2.text = item.type2
            building2.text = item.building2
        }
    }

    override fun onBindViewHolder(holder: DayViewHolder, position: Int) {
        super.onBindViewHolder(holder, position)
/*
        val listTime: List<TimeData> = CallUtil().getListTime()
        holder.time1.text = listTime[position].tex1
        holder.time2.text = listTime[position].tex2
        holder.time3.text = listTime[position].tex3

        val currentPair = CallUtil(CallPref()).getNumberCurrentPair().second
        if (currentPair == position) decorateItem(holder)*/
    }

    private fun decorateItem(holder: DayViewHolder) {
        holder.itemView.setBackgroundColor(ContextCompat.getColor(context, R.color.gray))

        listOf(holder.lesson, holder.teacher, holder.type, holder.building, holder.lesson2,
                holder.teacher2, holder.type2, holder.building2, holder.time1, holder.time2, holder.time3
        ).forEach {  }
    }
}