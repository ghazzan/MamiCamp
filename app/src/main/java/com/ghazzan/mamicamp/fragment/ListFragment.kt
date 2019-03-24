package com.ghazzan.mamicamp.fragment

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ghazzan.mamicamp.R
import com.ghazzan.mamicamp.`interface`.Response
import com.ghazzan.mamicamp.network.MamiApi

class ListFragment: Fragment(), Response {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_data_list, null)
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        Log.i("ListFragment", "onAttach fragment, do the things ...")

        MamiApi.loadListRoom(this)
    }

    override fun onResponse(result: Any) {

    }

    companion object {
        fun newInstance(): ListFragment {
            return ListFragment()
        }
    }
}