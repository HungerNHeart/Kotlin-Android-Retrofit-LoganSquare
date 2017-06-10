package com.droidmob.album

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup


/**
 * Created by Guru karthik on 10-06-2017.
 */

class AlbumAdapter(var list: List<AlbumDto>) : RecyclerView.Adapter<AlbumViewHolder>(){

    override fun getItemCount(): Int = list.size

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): AlbumViewHolder = AlbumViewHolder(LayoutInflater.from(parent?.context).inflate(R.layout.inflater_album_item, parent, false))

    override fun onBindViewHolder(holder: AlbumViewHolder?, position: Int) {
        holder?.data = list[position]
    }
}
