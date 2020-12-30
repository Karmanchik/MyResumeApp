package app.nocamelstyle.myresumeapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import app.nocamelstyle.myresumeapp.R

class SkillsAdapter(val skills: List<String>): RecyclerView.Adapter<SkillsAdapter.VH>() {

    inner class VH(view: View): RecyclerView.ViewHolder(view) {
        val titleView = view.findViewById<TextView>(R.id.title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(LayoutInflater.from(parent.context).inflate(R.layout.item_skill, parent, false))
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.titleView.text = skills[position]
    }

    override fun getItemCount() = skills.size

}