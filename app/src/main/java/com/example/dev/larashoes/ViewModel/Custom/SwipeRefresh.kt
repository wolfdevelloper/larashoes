package com.example.dev.larashoes.ViewModel.Custom

import android.app.Activity
import android.content.Context
import android.support.v4.app.FragmentManager
import android.support.v7.widget.RecyclerView
import android.support.v4.widget.SwipeRefreshLayout



/**
 * Created by dev on 06/03/2018.
 */
class SwipeRefresh {
    private var swipeRefresh: SwipeRefreshLayout? = null
    private var context: Context? = null
    private var activity: Activity? = null
    private var fragmentManager: FragmentManager? = null

    constructor(swipeRefresh: SwipeRefreshLayout,context: Context,activity: Activity,fragmentManager: FragmentManager){
        this.swipeRefresh = swipeRefresh
        this.context = context
        this.activity = activity
        this.fragmentManager = fragmentManager
    }

    fun onRefresh(){
        swipeRefresh!!.setOnRefreshListener(SwipeRefreshLayout.OnRefreshListener {
            // cancel the Visual indication of a refresh
            swipeRefresh!!.setRefreshing(false)
        })
    }
}