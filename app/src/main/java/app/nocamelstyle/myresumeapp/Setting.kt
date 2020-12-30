package app.nocamelstyle.myresumeapp

import android.content.Context
import androidx.core.content.edit

class Setting(ctx: Context) {

    private val pref = ctx.getSharedPreferences("setting", Context.MODE_PRIVATE)

    var isOnBoardingShowed: Boolean
        get() = pref.getBoolean("is_onboarding_showed", false)
        set(value) = pref.edit { putBoolean("is_onboarding_showed", value) }

}