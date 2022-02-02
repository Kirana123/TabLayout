package com.example.tabs

import Favorites
import Home
import Settings
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.tabs.adapters.ViewPagerAdapter
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpTabs()
    }

    private fun setUpTabs() {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(Home(), "Home")
        adapter.addFragment(Favorites(), "Favourites")
        adapter.addFragment(Settings(), "Settings")
        val viewPager: ViewPager = findViewById(R.id.viewpager);
        val tabLayout: TabLayout = findViewById(R.id.tabLayout);
        viewPager.adapter = adapter
        tabLayout.setupWithViewPager(viewPager)
        tabLayout.getTabAt(0)!!.setIcon(R.drawable.ic_baseline_home_24)
        tabLayout.getTabAt(1)!!.setIcon(R.drawable.ic_baseline_favorite_24)
        tabLayout.getTabAt(2)!!.setIcon(R.drawable.ic_baseline_settings_24)
    }
}