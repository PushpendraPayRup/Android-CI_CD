package com.example.androidcicd.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModel

abstract class BaseActivity<T : ViewDataBinding> : AppCompatActivity() {
    abstract fun onCreateActivity()
    abstract var binding : T
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        onCreateActivity()
    }
}