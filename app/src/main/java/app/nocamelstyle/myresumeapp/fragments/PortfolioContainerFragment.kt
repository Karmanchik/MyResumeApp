package app.nocamelstyle.myresumeapp.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import app.nocamelstyle.myresumeapp.R
import app.nocamelstyle.myresumeapp.adapters.ProjectsFragmentsAdapter
import com.google.android.material.tabs.TabLayout

class PortfolioContainerFragment : Fragment(R.layout.fragment_portfolio_container) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val viewPager = view.findViewById<ViewPager>(R.id.viewPager)

        viewPager.adapter =
            ProjectsFragmentsAdapter(childFragmentManager)

        view.findViewById<TabLayout>(R.id.tabs).setupWithViewPager(viewPager)

    }


}