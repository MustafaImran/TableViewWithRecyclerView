package com.application.tableviewwithrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.application.tableviewwithrecyclerview.adapter.TableRowAdapter
import com.application.tableviewwithrecyclerview.model.User

class MainActivity : AppCompatActivity() {

    private lateinit var tableRecyclerView : RecyclerView
    private var userList = ArrayList<User>()
    private lateinit var tableRowAdapter: TableRowAdapter
    private lateinit var user : User

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        userList.add(User("John", 24, "Software Engineer"))
        userList.add(User("Mark", 29, "Data Analyst"))
        userList.add(User("Charlie", 26, "Senior Software Engineer"))
        userList.add(User("Amy", 24, "Quality Assurance Engineer"))
        userList.add(User("Elizabeth", 32, "Project Manager"))

        tableRecyclerView = findViewById(R.id.table_recycler_view)
        tableRowAdapter = TableRowAdapter(userList)

        tableRecyclerView.layoutManager = LinearLayoutManager(this)
        tableRecyclerView.adapter = tableRowAdapter

    }
}