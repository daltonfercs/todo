package com.daltonfercs.miprimeraapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class TaskAdapter(private val tasks:List<String>, private val onItemDone: (Int) -> Unit):RecyclerView.Adapter<TaskViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        val layoutInflater  =   LayoutInflater.from(parent.context)
        return  TaskViewHolder(layoutInflater.inflate(R.layout.items_task,  parent, false))
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        holder.reder(tasks[position], onItemDone)

    }

    override fun getItemCount(): Int {
        return tasks.size
    }
}