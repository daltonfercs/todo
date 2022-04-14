package com.daltonfercs.miprimeraapp

import android.content.Context
import android.content.SharedPreferences

class Preferences(context: Context) {
    companion object{
       const val PRES_NAME   =   "myDatabase"
        const val TASKS =   "tasks_value"
    }

    val prefs: SharedPreferences    =   context.getSharedPreferences(PRES_NAME, 0)
    fun saveTasks(tasks: List<String>){
        prefs.edit().putStringSet(TASKS, tasks.toSet()).apply()
    }
    fun getTasks(): MutableList<String>{
        return prefs.getStringSet(TASKS, emptySet<String>())?.toMutableList()   ?:  mutableListOf()
    }

}