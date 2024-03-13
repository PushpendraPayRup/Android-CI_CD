package com.example.androidcicd.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.ViewDataBinding

abstract class BaseActivity<T : ViewDataBinding> : AppCompatActivity() {

    private lateinit var  binding : ViewDataBinding
    abstract fun onCreateActivity()
    abstract fun getBinding() : T
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = getBinding()
        setContentView(binding.root)
        onCreateActivity()
    }


}