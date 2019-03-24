package com.ghazzan.mamicamp.network

import android.util.Log
import com.ghazzan.mamicamp.`interface`.Response
import com.github.kittinunf.fuel.httpGet

object MamiApi {

    fun loadListRoom(listener: Response) {
        val url = Urls.BASE_URL+Urls.GET_LIST_ROOM
        url.httpGet()
            .responseString { _, _, result ->
                Log.i("MamiApi", "loadListRoom RESULT... ${result.get()}")
                listener.onResponse(result.get())
            }
    }
}