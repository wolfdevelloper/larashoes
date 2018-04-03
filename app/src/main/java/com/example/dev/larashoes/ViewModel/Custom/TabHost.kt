package com.example.dev.larashoes.ViewModel.Custom

import android.app.Activity
import android.graphics.Color
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTabHost
import com.example.dev.larashoes.View.Fragment.*

/**
 * Created by dev on 05/03/2018.
 */

class TabHost{

    private var hTabHost: TabHost? = null
    private var fTabHost: FragmentTabHost? = null
    private var activity: Activity? = null
    private var fragmentManager: FragmentManager? = null

    constructor(tabHost: FragmentTabHost, activity: Activity,fragmentManager: FragmentManager) {
        this.fTabHost = tabHost
        this.activity = activity
        this.fragmentManager = fragmentManager
    }

    constructor(tabHost: TabHost, activity: Activity, fragmentManager: FragmentManager) {
        this.hTabHost = tabHost;
        this.activity = activity;
        this.fragmentManager = fragmentManager
    }

    fun menu(container: Int) {
        if (this.fTabHost != null) {

            this.fTabHost!!.setup(activity!!, fragmentManager, container)

            this.fTabHost!!.addTab(
                    this.fTabHost!!.newTabSpec("Post").setIndicator("Post", null),
                    PostagemFragment::class.java, null)

            this.fTabHost!!.addTab(
                    this.fTabHost!!.newTabSpec("site").setIndicator("Site", null),
                    SiteFragment::class.java, null)

            this.fTabHost!!.addTab(
                    this.fTabHost!!.newTabSpec("Resvista").setIndicator("Revista", null),
                    RevistaFragment::class.java, null)

            this.fTabHost!!.addTab(
                    this.fTabHost!!.newTabSpec("Usuario").setIndicator("Conta", null),
                    UsuarioFragment::class.java, null)

            this.fTabHost!!.addTab(
                    this.fTabHost!!.newTabSpec("Chat").setIndicator("LaraChat", null),
                    ChatFragment::class.java, null)
        }
    }
}