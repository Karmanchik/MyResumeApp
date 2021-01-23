package app.nocamelstyle.myresumeapp.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import app.nocamelstyle.myresumeapp.R
import app.nocamelstyle.myresumeapp.Setting
import app.nocamelstyle.myresumeapp.adapters.ProjectsAdapter
import app.nocamelstyle.myresumeapp.projects

class PortfolioFavouritesFragment : Fragment(R.layout.fragment_portfolio_favourites) {

    private val ids get() = Setting(requireContext()).favouritesIds
    private lateinit var stubView: View
    private lateinit var listView: RecyclerView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        listView = view.findViewById(R.id.projectsRV)
        stubView = view.findViewById(R.id.stub)
    }

    override fun onStart() {
        super.onStart()

        stubView.visibility = if (ids.isEmpty()) View.VISIBLE else View.GONE
        listView.adapter =
            ProjectsAdapter(requireContext(), projects.filter { ids.contains(it.id) })
    }

}