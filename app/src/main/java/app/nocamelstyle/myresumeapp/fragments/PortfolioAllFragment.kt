package app.nocamelstyle.myresumeapp.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import app.nocamelstyle.myresumeapp.R
import app.nocamelstyle.myresumeapp.adapters.ProjectsAdapter
import app.nocamelstyle.myresumeapp.projects

class PortfolioAllFragment : Fragment(R.layout.fragment_portfolio_all) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<RecyclerView>(R.id.projectsRV).apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = ProjectsAdapter(requireContext(), projects)
        }
    }

}