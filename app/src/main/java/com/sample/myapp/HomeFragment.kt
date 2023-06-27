package com.sample.myapp

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.LifecycleCoroutineScope
import com.sample.myapp.databinding.FragmentHomeBinding
import com.sample.myapp.remote.ApiCall
import com.sample.myapp.remote.ApiDetails
import com.sample.myapp.remote.OpenWhyd
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class HomeFragment : Fragment() {

    lateinit var binding : FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        layoutInflater // activits's inflator
        // Inflate the layout for this fragment

        binding = FragmentHomeBinding.inflate(inflater, container, false)

        CoroutineScope(Dispatchers.Main).launch {
            var result = ApiDetails.hitApi(ApiDetails.ANIME, ApiCall::class.java)?.getRandomAnime()
            Log.d("MyHomeFragment", result.toString())

        }





        return binding.root
    }

}