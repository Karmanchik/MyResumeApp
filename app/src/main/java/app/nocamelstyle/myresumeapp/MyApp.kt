package app.nocamelstyle.myresumeapp

import android.app.Application

class MyApp: Application() {

    companion object {
        lateinit var setting: Setting
    }

    override fun onCreate() {
        super.onCreate()
        setting = Setting(applicationContext)
    }

}