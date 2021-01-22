package app.nocamelstyle.myresumeapp.adapters

import android.content.Context
import android.graphics.BitmapFactory
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import app.nocamelstyle.myresumeapp.Project
import app.nocamelstyle.myresumeapp.R
import app.nocamelstyle.myresumeapp.activities.ProjectActivity
import app.nocamelstyle.myresumeapp.startActivity

class ProjectsAdapter(val ctx: Context, val projects: List<Project>): RecyclerView.Adapter<ProjectsAdapter.VH>() {

    inner class VH(view: View): RecyclerView.ViewHolder(view) {
        val titleView = view.findViewById<TextView>(R.id.project_name)
        val imageView = view.findViewById<ImageView>(R.id.project_icon)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(LayoutInflater.from(parent.context).inflate(R.layout.item_portfolio, parent, false))
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.titleView.text = projects[position].name
        holder.itemView.setOnClickListener {
            ctx.startActivity<ProjectActivity> {
                putExtra("project", projects[position])
            }
        }
        holder.imageView.setImageBitmap(
            BitmapFactory.decodeStream(ctx.assets.open(projects[position].iconName))
        )
    }

    override fun getItemCount() = projects.size

}