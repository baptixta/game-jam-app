package com.example.cleanadventure

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class PagesAdapter(fm : FragmentManager) : FragmentStatePagerAdapter(fm) {

    private val pagesCount = 4

    override fun getItem(position: Int): Fragment {
        // paginas
        return when (position) {
            0 -> HomeFragment()
            1 -> CleanFragment()
            2 -> SettingsFragment()
            else -> AboutFragment()
        }

    }

    override fun getCount(): Int {
        return pagesCount
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "Home"
            1 -> "Game"
            2 -> "Settings"
            else -> "About"
        }
    }

}