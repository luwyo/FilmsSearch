package ru.gb.course1.filmssearch.ui.ratings

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.gb.course1.filmssearch.R


class RatingInnerAdapter : RecyclerView.Adapter<RatingInnerViewHolder>() {
    var items: ArrayList<String> = ArrayList()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RatingInnerViewHolder {
        val root =
            LayoutInflater.from(parent.context).inflate(R.layout.inner_item_home, parent, false)
        return RatingInnerViewHolder(root)
    }

    override fun onBindViewHolder(holder: RatingInnerViewHolder, position: Int) {
        val item = items.get(position)
        holder.nameMovie.text = item
        holder.publicData.text = "2022"
        holder.rating.text = "8,9"
    }

    override fun getItemCount(): Int {
        return items.size
    }
}