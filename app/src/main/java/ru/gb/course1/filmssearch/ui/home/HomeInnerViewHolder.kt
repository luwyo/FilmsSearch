package ru.gb.course1.filmssearch.ui.home

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ru.gb.course1.filmssearch.R

class HomeInnerViewHolder(
    itemView: View,
    val nameMovie: TextView = itemView.findViewById(R.id.textView2),
    val publicData: TextView = itemView.findViewById(R.id.textView3),
    val rating: TextView = itemView.findViewById(R.id.textView4)
) : RecyclerView.ViewHolder(itemView) {

    init {
        //в этом варианте инициализацию решил провести сразу в конструкторе
    }
}