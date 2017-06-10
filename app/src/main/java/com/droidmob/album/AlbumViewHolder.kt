package com.droidmob.album

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView

/**
 * Created by Guru karthik on 10-06-2017.
 */

class AlbumViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    val photoThumbnail: ImageView
    val photoTitle: TextView
    var data: AlbumDto? = null
    init {
        photoThumbnail = itemView.findViewById(R.id.image_photo_thumbnail) as ImageView
        photoTitle = itemView.findViewById(R.id.text_photo_title) as TextView
    }

    public fun setContent(data: AlbumDto?){
        this.data = data
        photoTitle.setText(data?.title)
    }
}
