package com.application.tableviewwithrecyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.application.tableviewwithrecyclerview.R
import com.application.tableviewwithrecyclerview.model.User
import java.util.*

class TableRowAdapter(private var userArrayList: ArrayList<User>) :
    RecyclerView.Adapter<TableRowAdapter.ViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v: View = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.table_row_layout, viewGroup, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        viewHolder.tvUserName.text = userArrayList[i].name
        viewHolder.tvAge.text = userArrayList[i].age.toString()
        viewHolder.tvDesignation.text = userArrayList[i].designation
    }

    override fun getItemCount(): Int {
        return userArrayList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvUserName: TextView = itemView.findViewById(R.id.tv_user_name)
        val tvAge: TextView = itemView.findViewById(R.id.tv_user_age)
        val tvDesignation: TextView = itemView.findViewById(R.id.tv_user_designation)


    }
}

