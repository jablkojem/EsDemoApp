package com.msoft.crowdindemoapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.app.BaseContextWrappingDelegate
import com.crowdin.platform.Crowdin
import com.crowdin.platform.CrowdinConfig
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {

    override fun getDelegate(): AppCompatDelegate = BaseContextWrappingDelegate(super.getDelegate())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}