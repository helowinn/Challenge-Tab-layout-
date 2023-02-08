package com.android.erwin.challengetablayout

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ViewPagerAdapter(fm: FragmentManager) :
    FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    private val COUNT = 3


    override fun getCount(): Int {
        return COUNT
    }

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                ChatFragment()
            }
            1 -> {
                StatusFragment()
            }
            else -> {
                CallsFragment()
            }
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position){
            0 -> {
                "Chat"
            }
            1 -> {
                "Status"
            }
            else ->{
                "Calls"
            }
        }

    }

}