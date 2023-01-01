package com.sametdundar.findrepo.ui.activity

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatDelegate
import com.sametdundar.findrepo.R
import com.sametdundar.findrepo.base.BaseActivity
import com.sametdundar.findrepo.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun getLayoutId(): Int = R.layout.activity_main

    override fun prepareView(savedInstanceState: Bundle?) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
    }
}