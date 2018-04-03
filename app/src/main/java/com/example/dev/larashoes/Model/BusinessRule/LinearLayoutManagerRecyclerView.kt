package com.example.dev.larashoes.Model.BusinessRule

import android.content.Context
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.StaggeredGridLayoutManager



/**
 * Created by dev on 06/03/2018.
 */
class LinearLayoutManagerRecyclerView{
    companion object {

        fun linearLayoutManagerVertical(context: Context): LinearLayoutManager {
            return LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        }

        fun linearLayoutManagerHorizontal(context: Context): LinearLayoutManager {
            return LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        }

        fun linearLayoutManagerGrid(context: Context): LinearLayoutManager {
            return GridLayoutManager(context, 3)
        }

        fun staggeredGridLayoutHorizontal(): StaggeredGridLayoutManager {
            return StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.HORIZONTAL)
        }

        fun staggeredGridLayoutVertical(): StaggeredGridLayoutManager {
            return StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        }

    }
}