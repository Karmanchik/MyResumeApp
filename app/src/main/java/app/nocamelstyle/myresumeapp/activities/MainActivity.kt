package app.nocamelstyle.myresumeapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import app.nocamelstyle.myresumeapp.fragments.PortfolioContainerFragment
import app.nocamelstyle.myresumeapp.R
import app.nocamelstyle.myresumeapp.fragments.SettingsFragment
import app.nocamelstyle.myresumeapp.databinding.ActivityMainBinding
import app.nocamelstyle.myresumeapp.fragments.AboutMeFragment
import app.nocamelstyle.myresumeapp.fragments.PortfolioAllFragment
import app.nocamelstyle.myresumeapp.toast
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var isNeedExit = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomNavigationView.setOnNavigationItemSelectedListener {
            val fragment = when(it.itemId) {
                R.id.bottom_menu_item_profile -> AboutMeFragment()
                R.id.bottom_menu_item_projects -> PortfolioContainerFragment()
                else -> SettingsFragment()
            }
            supportFragmentManager.commit { replace(binding.frame.id, fragment) }
            true
        }
    }

    override fun onBackPressed() {
        if (supportFragmentManager.fragments.last() !is AboutMeFragment) {
            supportFragmentManager.commit {
                replace(binding.frame.id, AboutMeFragment())
            }
        } else {
            if (isNeedExit) {
                finish()
            } else {
                isNeedExit = true
                toast(R.string.exit_message)
                GlobalScope.launch(Dispatchers.Main) {
                    delay(2000)
                    isNeedExit = false
                }
            }
        }
    }

}