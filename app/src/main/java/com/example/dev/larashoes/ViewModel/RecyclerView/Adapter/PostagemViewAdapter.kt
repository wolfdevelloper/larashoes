package com.example.dev.larashoes.ViewModel.RecyclerView.Adapter

import android.app.Activity
import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.dev.larashoes.Model.Entity.Postagem
import java.util.*
import com.example.dev.larashoes.R
import com.example.dev.larashoes.ViewModel.RecyclerView.ViewHolder.PostagemViewHolder

/**
 * Created by dev on 05/03/2018.
 */


class PostagemViewAdapter constructor(elementos: List<Postagem>,context: Context,activity: Activity) : RecyclerView.Adapter<PostagemViewHolder>() {

    private val elementos: List<Postagem> = elementos // atributo do contexto
    private val context: Context = context // atributo do contexto
    private val activity: Activity = activity

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostagemViewHolder? {

        val v = LayoutInflater.from(context).inflate(R.layout.list_postagem, parent, false)

        return PostagemViewHolder(v)
    }

    override fun onBindViewHolder(holder: PostagemViewHolder?, position: Int) {
        try {
            if (holder is PostagemViewHolder) {
                val viewholder = holder as PostagemViewHolder

                val post:Postagem = elementos.get(position)

                viewholder.comentario!!.setText(post.comentario)

                viewholder.nomedolocal!!.setText(post.nome_local)

            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    override fun getItemCount(): Int {
        return elementos!!.size
    }

}

