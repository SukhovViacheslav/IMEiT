package ru.suhov.student.features.schedule

import android.content.Context
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import ru.suhov.student.R
import ru.suhov.student.features.Constants.FRI
import ru.suhov.student.features.Constants.MON
import ru.suhov.student.features.Constants.THU
import ru.suhov.student.features.Constants.TUE
import ru.suhov.student.features.Constants.WED

class DayPagerAdapter(fm: FragmentManager, private val context:Context) : FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getItem(position: Int) =
            when (position) {
                0 -> FragmentDay(MON)
                1 -> FragmentDay(TUE)
                2 -> FragmentDay(WED)
                3 -> FragmentDay(THU)
                4 -> FragmentDay(FRI)
                else -> FragmentDay(MON)
            }

    override fun getCount() = 5

    override fun getPageTitle(position: Int) =
            when (position) {
                0 -> context.getString(R.string.day_mon)
                1 -> context.getString(R.string.day_tue)
                2 -> context.getString(R.string.day_wed)
                3 -> context.getString(R.string.day_thu)
                4 -> context.getString(R.string.day_fri)
                else -> null
            }
}