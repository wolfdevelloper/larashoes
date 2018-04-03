package com.example.dev.larashoes.View.Fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import com.example.dev.larashoes.R


/**
 * A simple [Fragment] subclass.
 */
class SiteFragment : Fragment() {

    companion object {
        fun instance():SiteFragment{
            return SiteFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_site, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var webSite = view!!.findViewById<View>(R.id.website) as WebView
// specify the url of the web page in loadUrl function
        webSite.loadUrl("https://www.google.com.br/")
    }
}// Required empty public constructor
