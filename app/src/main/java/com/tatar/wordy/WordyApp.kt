package com.tatar.wordy

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

@HiltAndroidApp
class WordyApp : Application() {
    override fun onCreate() {
        super.onCreate()

        setupLogger()
    }

    private fun setupLogger() {
        if (BuildConfig.DEBUG) Timber.plant(Timber.DebugTree())
    }
}