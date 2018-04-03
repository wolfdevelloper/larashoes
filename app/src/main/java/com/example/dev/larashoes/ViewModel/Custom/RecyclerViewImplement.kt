package com.example.dev.larashoes.ViewModel.Custom

import android.app.Activity
import android.content.Context
import android.support.v4.app.FragmentManager
import android.support.v7.widget.RecyclerView
import com.example.dev.larashoes.Model.BusinessRule.LinearLayoutManagerRecyclerView
import com.example.dev.larashoes.Model.Entity.Postagem
import com.example.dev.larashoes.ViewModel.RecyclerView.Adapter.PostagemViewAdapter

/**
 * Created by dev on 06/03/2018.
 */
class RecyclerViewImplement {


    private var recyclerView: RecyclerView? = null
    private var context: Context? = null
    private var activity: Activity? = null
    private var fragmentManager: FragmentManager? = null

    constructor(recyclerView: RecyclerView, context: Context, activity: Activity, fragmentManager: FragmentManager) {
        this.recyclerView = recyclerView
        this.context = context
        this.activity = activity
        this.fragmentManager = fragmentManager
    }

    fun implementListPost(type: Int) {

        var listPost: ArrayList<Postagem> = ArrayList()
        listPost.add(Postagem("Lara Shoe", null, "sapatilhas na metade do preço"))
        listPost.add(Postagem("Lara Shoe", null, "sapatilhas numero 38 so aqui"))

        recyclerView!!.adapter = PostagemViewAdapter(listPost, context!!, activity!!)

        layoutManager(recyclerView!!, type)

    }

    fun layoutManager(recyclerView: RecyclerView, type: Int) {
        if (type == 2)
            recyclerView.layoutManager = LinearLayoutManagerRecyclerView.linearLayoutManagerHorizontal(context!!)
        else if (type == 3)
            recyclerView.layoutManager = LinearLayoutManagerRecyclerView.linearLayoutManagerGrid(context!!)
        else if (type == 4)
            recyclerView.layoutManager = LinearLayoutManagerRecyclerView.staggeredGridLayoutHorizontal()
        else if (type == 5)
            recyclerView.layoutManager = LinearLayoutManagerRecyclerView.staggeredGridLayoutVertical()
        else
            recyclerView.layoutManager = LinearLayoutManagerRecyclerView.linearLayoutManagerVertical(context!!)
    }


}