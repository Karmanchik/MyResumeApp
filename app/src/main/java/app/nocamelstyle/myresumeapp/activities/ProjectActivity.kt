package app.nocamelstyle.myresumeapp.activities

import android.content.Intent
import android.graphics.BitmapFactory
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.annotation.DrawableRes
import app.nocamelstyle.myresumeapp.Project
import app.nocamelstyle.myresumeapp.R
import app.nocamelstyle.myresumeapp.Setting
import app.nocamelstyle.myresumeapp.adapters.SkillsAdapter
import app.nocamelstyle.myresumeapp.databinding.ActivityProjectBinding
import com.google.android.flexbox.FlexDirection
import com.google.android.flexbox.FlexboxLayoutManager
import com.google.android.flexbox.JustifyContent

class ProjectActivity : AppCompatActivity() {

    private val setting by lazy { Setting(this) }
    private lateinit var binding: ActivityProjectBinding
    private lateinit var project: Project

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProjectBinding.inflate(layoutInflater)
        setContentView(binding.root)

        project = intent.getSerializableExtra("project") as Project

        binding.apply {
            projectDetailsAvatar.setImageBitmap(
                BitmapFactory.decodeStream(assets.open(project.fileName))
            )
            projectDetailsName.text = project.name
            projectDetailsDescription.text = project.description

            technologyRV.apply {
                layoutManager = FlexboxLayoutManager(context).apply {
                    flexDirection = FlexDirection.ROW
                    justifyContent = JustifyContent.FLEX_START
                }
                adapter = SkillsAdapter(project.skills)
            }

            favouritesFab.setImageResource(getStar())
            favouritesFab.setOnClickListener {
                if (setting.favouritesIds.contains(project.id)) {
                    //remove
                    setting.favouritesIds = setting.favouritesIds.filterNot { it == project.id }
                } else {
                    //add
                    setting.favouritesIds = setting.favouritesIds + project.id
                }
                favouritesFab.setImageResource(getStar())
            }

            webUrl.visibility = if (project.websiteUrl == null) View.GONE else View.VISIBLE
            appStoreUrl.visibility = if (project.iOSUrl == null) View.GONE else View.VISIBLE
            googlePlayUrl.visibility = if (project.androidUrl == null) View.GONE else View.VISIBLE

            webUrl.setOnClickListener { openUrl(project.websiteUrl ?: "") }
            googlePlayUrl.setOnClickListener { openUrl(project.androidUrl ?: "") }
            appStoreUrl.setOnClickListener { openUrl(project.iOSUrl ?: "") }
        }
    }

    private fun getStar(): Int {
        return if (setting.favouritesIds.contains(project.id))
            R.drawable.ic_baseline_star_rate_24
        else
            R.drawable.ic_baseline_star_outline_24
    }

    private fun openUrl(url: String) {
        startActivity(
            Intent(Intent.ACTION_VIEW).apply {
                data = Uri.parse(url)
            }
        )
    }

}