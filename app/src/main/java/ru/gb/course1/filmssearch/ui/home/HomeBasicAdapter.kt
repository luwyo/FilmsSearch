package ru.gb.course1.filmssearch.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.gb.course1.filmssearch.R
import ru.gb.course1.filmssearch.domain.ListMovies

class HomeBasicAdapter(_homeViewModel: HomeViewModel) :
    RecyclerView.Adapter<HomeBasicViewHolder>() {

    val homeViewModel: HomeViewModel = _homeViewModel
    var items: ArrayList<ListMovies> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeBasicViewHolder {
        val root =
            LayoutInflater.from(parent.context).inflate(R.layout.basic_item_home, parent, false)
        return HomeBasicViewHolder(root)
    }

    override fun onBindViewHolder(holder: HomeBasicViewHolder, position: Int) {

        var item = items.get(position)

        var currentIdList = item.listId
        var innerItems = homeViewModel.fetchDataListById(currentIdList)
        holder.basicTitle.text = item.listName

        holder.adapter.items.clear()
        holder.adapter.items.addAll(innerItems)
        holder.adapter.notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return items.size
    }
}