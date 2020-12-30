package app.nocamelstyle.myresumeapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.nocamelstyle.myresumeapp.MyApp
import app.nocamelstyle.myresumeapp.R
import app.nocamelstyle.myresumeapp.startActivity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashActivity : AppCompatActivity(R.layout.activity_splash) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        GlobalScope.launch {
            delay(2000)
            launch(Dispatchers.Main) {
                if (MyApp.setting.isOnBoardingShowed)
                    startActivity<MainActivity>()
                else
                    startActivity<OnBoardingActivity>()
                finish()
            }
        }
    }

}