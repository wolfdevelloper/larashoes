package com.example.dev.larashoes.View.Activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.dev.larashoes.R
import com.example.dev.larashoes.ViewModel.Custom.TabHost

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        var tabHost = TabHost(tabhost, activity = this, fragmentManager = supportFragmentManager)

        tabHost.menu(android.R.id.tabcontent)
    }

}
