package com.example.dev.larashoes.View.Fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.dev.larashoes.R


/**
 * A simple [Fragment] subclass.
 */
class RevistaFragment : Fragment() {

    companion object {
        fun instance():RevistaFragment{
            return RevistaFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_revista, container, false)
    }

}// Required empty public constructor
