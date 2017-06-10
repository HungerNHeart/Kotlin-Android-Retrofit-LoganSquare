package com.droidmob.album


import retrofit2.Call
import retrofit2.http.GET

/**
 * Created by Guru karthik on 10-06-2017.
 */

interface ApiInterface {
    @GET("/photos")
    fun getAlbum(): Call<List<AlbumDto>>
}
