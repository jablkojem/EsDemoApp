package com.msoft.crowdindemoapp.app

import android.app.Application
import com.crowdin.platform.Crowdin
import com.crowdin.platform.CrowdinConfig
import java.util.concurrent.TimeUnit

class App : Application() {
    override fun onCreate() {
        super.onCreate()

        val basicProjectHash = "9fc7094f364f5400bac78c9iqur"            // works
        val enterpriseProjectHash = "e-944eb1a9862d871324553b2zpj"      // doesnt work

        Crowdin.init(
            applicationContext, CrowdinConfig.Builder()
                .withDistributionHash(basicProjectHash)
                .withUpdateInterval(TimeUnit.MINUTES.toSeconds(15))
                .build()
        )
    }
}
