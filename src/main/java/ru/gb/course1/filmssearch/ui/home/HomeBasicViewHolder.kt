package ru.gb.course1.filmssearch.ui.home

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ru.gb.course1.filmssearch.R

class HomeBasicViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val basicTitle: TextView = itemView.findViewById(R.id.basicTitle)
    var adapter: HomeInnerAdapter

    init {
        adapter = HomeInnerAdapter()
        val homeInnerRecyclerView = itemView.findViewById<RecyclerView>(R.id.home_inner_list)
        homeInnerRecyclerView.adapter = adapter
        homeInnerRecyclerView.layoutManager =
            LinearLayoutManager(itemView.context, LinearLayoutManager.HORIZONTAL, false)
    }
}