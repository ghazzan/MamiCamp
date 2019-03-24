package com.ghazzan.mamicamp.fragment

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ghazzan.mamicamp.R

class FormFragment: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_form, null)
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
    }
}