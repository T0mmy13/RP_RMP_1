package com.bignerdranch.android.praktikapr_23_bk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class Fragment2Activity : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment2,container,false)
    }
    companion object
    {
        @JvmStatic
        fun newInstance()=Fragment1Activity();
    }
}