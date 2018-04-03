package com.example.dev.larashoes.ViewModel.RecyclerView.ViewHolder

import android.widget.TextView
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import com.example.dev.larashoes.R


/**
 * Created by dev on 05/03/2018.
 */

class PostagemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


    val nomedolocal: TextView?
    val comentario: TextView?
    val imagem: ImageView?

    init {

        imagem = null

        comentario = itemView.findViewById<View>(R.id.comentario_post) as TextView

        nomedolocal = itemView.findViewById<View>(R.id.nome_loja_post) as TextView

    }
}