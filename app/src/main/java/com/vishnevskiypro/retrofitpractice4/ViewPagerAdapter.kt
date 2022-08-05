package com.vishnevskiypro.retrofitpractice4

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.vishnevskiypro.retrofitpractice4.screens.first.FirstFragment
import com.vishnevskiypro.retrofitpractice4.screens.second.SecondFragment

class ViewPagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity){

    override fun getItemCount(): Int {
        return 2
    }


    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> {
                FirstFragment()
            }
            else -> {
                SecondFragment()
            }
        }
    }
}