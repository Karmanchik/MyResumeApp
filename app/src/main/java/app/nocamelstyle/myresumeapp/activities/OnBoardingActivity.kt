package app.nocamelstyle.myresumeapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.nocamelstyle.myresumeapp.MyApp
import app.nocamelstyle.myresumeapp.R

class OnBoardingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding)
        MyApp.setting.isOnBoardingShowed = true
    }
}