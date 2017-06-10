package com.droidmob.album

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.Toast
import com.droidmob.vijay_61.model.webservice.ApiClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LaunchActivity : AppCompatActivity(), Callback<List<AlbumDto>> {

    private val TAG: String = javaClass.simpleName
    private var photoListView: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch)
        photoListView = findViewById(R.id.list_album) as RecyclerView
        photoListView!!.layoutManager = GridLayoutManager(this, 2, LinearLayoutManager.VERTICAL, false)
        ApiClient.apiInterface.getAlbum().enqueue(this)
    }


    override fun onResponse(call: Call<List<AlbumDto>>?, response: Response<List<AlbumDto>>?) {
        if (response!!.isSuccessful && response.body() != null) {
            photoListView?.adapter = AlbumAdapter(response.body() as List<AlbumDto>)
        }
    }

    override fun onFailure(call: Call<List<AlbumDto>>?, t: Throwable?) {
        Toast.makeText(this, "Something went wrong!", Toast.LENGTH_SHORT).show()
    }
}
