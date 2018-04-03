package com.example.dev.larashoes.View.Fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.dev.larashoes.R

/**
 * Created by dev on 04/03/2018.
 */
class UsuarioFragment : Fragment() {

    companion object {
        fun instance():UsuarioFragment{
            return UsuarioFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_usuario, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        // Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        // toolbar.setTitle("Usuario");

    }
}