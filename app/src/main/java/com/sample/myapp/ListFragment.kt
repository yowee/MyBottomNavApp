package com.sample.myapp

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sample.myapp.databinding.FragmentListBinding
import com.sample.myapp.remote.ApiDetails
import com.sample.myapp.remote.URLhausAPI
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ListFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        layoutInflater

        val binding = FragmentListBinding.inflate(layoutInflater, container, false)

        CoroutineScope(Dispatchers.Main).launch {
            var result = ApiDetails.hitApi(ApiDetails.URLHAUS, URLhausAPI::class.java)?.getUrlRecent()
            result?.toString()?.let { Log.d("ListFragment", it) }

        }


        return binding.root
    }


}