package com.fjr.fitme

import android.app.Application
import com.fjr.fitme.di.AppModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.ksp.generated.module

class FitMeApp: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@FitMeApp)
            modules(
                AppModule().module
            )
        }
    }
}