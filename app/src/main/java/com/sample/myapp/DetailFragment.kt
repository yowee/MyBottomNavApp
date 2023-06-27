package com.sample.myapp

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sample.myapp.databinding.FragmentDetailBinding
import com.sample.myapp.remote.ApiDetails
import com.sample.myapp.remote.OpenWhydAPI
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class DetailFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val binder = FragmentDetailBinding.inflate(layoutInflater, container, false)


        CoroutineScope(Dispatchers.Main).launch {
            var result = ApiDetails.hitApi(ApiDetails.OPENWHYD, OpenWhydAPI::class.java)?.getAdrien()
            Log.d("DetailFragment", result.toString())
        }

        return binder.root

    }

}