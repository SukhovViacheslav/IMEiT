package ru.student.assistant.auth.ui

import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class AuthPagerAdapter(fm: FragmentManager, lifecycle: Lifecycle) : FragmentStateAdapter(fm, lifecycle) {

    override fun createFragment(p: Int) = if (p == 0) SignInFragment() else SignUpFragment()

    override fun getItemCount(): Int = 2

}
