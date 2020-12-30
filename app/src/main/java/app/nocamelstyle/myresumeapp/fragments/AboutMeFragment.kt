package app.nocamelstyle.myresumeapp.fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import app.nocamelstyle.myresumeapp.Constants
import app.nocamelstyle.myresumeapp.adapters.SkillsAdapter
import app.nocamelstyle.myresumeapp.databinding.FragmentAboutMeBinding
import com.bumptech.glide.Glide
import com.google.android.flexbox.FlexDirection
import com.google.android.flexbox.FlexboxLayoutManager
import com.google.android.flexbox.JustifyContent


class AboutMeFragment : Fragment() {

    private var binding: FragmentAboutMeBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAboutMeBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.apply {
            skillsRV.apply {
                layoutManager = FlexboxLayoutManager(context).apply {
                    flexDirection = FlexDirection.ROW
                    justifyContent = JustifyContent.FLEX_START
                }
                adapter = SkillsAdapter(listOf(
                    "OOP", "C++", "Postman", "Java", "Python", "Kotlin", "JavaScript", "MySQL",
                    "C#", "Swift", "PHP", "DELPHI", "XML", "HTML", "CSS", "Firebase", "Wordpress",
                    "Bootstrap", "Google Maps", "NFC", "Inmobi", "Admob", "Flutter",
                    "Kotlin Multiplatform", "Dagger", "RxJava", "Coroutines", "Billing system",
                    "Figma", "Slack", "Trello", "Git"
                ))
            }


            Glide.with(requireContext())
                .load("file:///android_asset/avatar.jpg")
                .into(avatarIV)

            githubLinkIv.setOnClickListener { openUrl(Constants.gihubLink) }
            telegramLinkIv.setOnClickListener { openUrl(Constants.telegramLink) }
            whatsappLinkIv.setOnClickListener { openUrl(Constants.whatsAppLink) }
            emailLinkIv.setOnClickListener { openUrl("to:${Constants.email}") }
            skypeLinkIv.setOnClickListener { openUrl("skype:${Constants.skypeLink}") }
            linkedinLinkIv.setOnClickListener { openUrl(Constants.linkedInLink) }
        }
    }

    private fun openUrl(url: String) {
        startActivity(
            Intent(Intent.ACTION_VIEW).apply {
                data = Uri.parse(url)
            }
        )
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

}