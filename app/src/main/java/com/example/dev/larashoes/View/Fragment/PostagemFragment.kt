package com.example.dev.larashoes.View.Fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.dev.larashoes.Model.Entity.Postagem
import com.example.dev.larashoes.R
import com.example.dev.larashoes.ViewModel.Custom.RecyclerViewImplement
import com.example.dev.larashoes.ViewModel.Custom.SwipeRefresh
import com.example.dev.larashoes.ViewModel.RecyclerView.Adapter.PostagemViewAdapter
import kotlinx.android.synthetic.main.fragment_postagem.*


/**
 * A simple [Fragment] subclass.
 */
class PostagemFragment : Fragment() {

    companion object {
        fun instance():PostagemFragment{
            return PostagemFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_postagem, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var recyclerView = RecyclerViewImplement(recyclerView = recyclerview_postagem,context = context,
                activity = activity,fragmentManager = fragmentManager)

        recyclerView.implementListPost(1)

        var swipeRefresh = SwipeRefresh(swipeRefreshListPostagem,context,activity,fragmentManager)

        swipeRefresh.onRefresh()


    }
}// Required empty public constructor
