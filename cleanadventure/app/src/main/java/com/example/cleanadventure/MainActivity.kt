package com.example.cleanadventure

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pagesAdapter = PagesAdapter(supportFragmentManager)
        vpExample.adapter = pagesAdapter
    }
}
