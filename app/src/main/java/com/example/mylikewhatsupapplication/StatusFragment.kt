package com.example.mylikewhatsupapplication

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

class StatusFragment : Fragment() {

    var myProvider:LayoutInflater? =null

    companion object {
        fun newInstance() = StatusFragment()
    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var root = inflater.inflate(R.layout.status_fragment, container, false)





        return root
    }


}


//Lounch a file picture, select on image and
//display it on an image view