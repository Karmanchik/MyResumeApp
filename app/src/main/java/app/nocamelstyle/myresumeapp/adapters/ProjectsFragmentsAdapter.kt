package app.nocamelstyle.myresumeapp.adapters

import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import app.nocamelstyle.myresumeapp.fragments.PortfolioAllFragment
import app.nocamelstyle.myresumeapp.fragments.PortfolioFavouritesFragment

class ProjectsFragmentsAdapter(
    fragmentManager: FragmentManager
) : FragmentPagerAdapter(fragmentManager) {

    private val fragments = listOf(
        PortfolioAllFragment(),
        PortfolioFavouritesFragment()
    )
    private val tabTitles = listOf(
        "Все проекты",
        "Избранные"
    ) // todo: локализация

    override fun getCount() = fragments.size

    override fun getItem(position: Int) = fragments[position]

    override fun getPageTitle(position: Int) = tabTitles[position]

}