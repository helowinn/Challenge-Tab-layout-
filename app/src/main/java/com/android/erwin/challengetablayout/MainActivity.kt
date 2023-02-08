package com.android.erwin.challengetablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.erwin.challengetablayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        setupViewPager()
    }

    private fun setupViewPager(){
        val viewPagerAdapter = ViewPagerAdapter(supportFragmentManager)
        binding.vpChallenge.adapter = viewPagerAdapter
        binding.tlChallenge.setupWithViewPager(binding.vpChallenge)
    }
}