package com.sametdundar.findrepo.ui.activity

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatDelegate
import com.sametdundar.findrepo.R
import com.sametdundar.findrepo.base.BaseActivity
import com.sametdundar.findrepo.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun getLayoutId(): Int = R.layout.activity_main

    override fun prepareView(savedInstanceState: Bundle?) {
        val decorView = window.decorView
        decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
    }
}