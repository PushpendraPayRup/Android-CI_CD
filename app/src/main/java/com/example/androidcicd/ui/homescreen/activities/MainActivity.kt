package com.example.androidcicd.ui.homescreen.activities

import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.androidcicd.R
import com.example.androidcicd.databinding.ActivityMainBinding
import com.example.androidcicd.ui.BaseActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>() {

    private lateinit var navController: NavController
    private lateinit var navHost: NavHostFragment
    override var binding: ActivityMainBinding
        get() = ActivityMainBinding.inflate(layoutInflater)
        set(value) {}

    override fun onCreateActivity() {
        navHost = supportFragmentManager.findFragmentById(R.id.fragmentContainer) as NavHostFragment
        navController = navHost.navController
    }
}