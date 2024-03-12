package com.example.androidcicd.ui

import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.androidcicd.R
import com.example.androidcicd.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>() {

    private lateinit var navController: NavController
    private lateinit var navHost: NavHostFragment
    override fun getBinding() = ActivityMainBinding.inflate(layoutInflater)
    override fun onCreateActivity() {
        navHost = supportFragmentManager.findFragmentById(R.id.fragmentContainer) as NavHostFragment
        navController = navHost.navController

    }



}