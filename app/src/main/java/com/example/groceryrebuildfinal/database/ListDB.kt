package com.example.groceryrebuildfinal.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.groceryrebuildfinal.viewmodel.view

//import androidx.room.processor.Context

@Database(entities = [Item::class], version = 1, exportSchema = false)//we really need all of this?

abstract class ListDB: RoomDatabase()
{
    abstract fun Dao(): ItemDao

    companion object
    {
        @Volatile
        var INSTANCE: ListDB? = null

        fun getDb(context: Context?): ListDB
        {
            return INSTANCE?: synchronized(this)
            { //Starting below this comment, I have no idea what is actually happening?
                val instance = Room.databaseBuilder(context!!.applicationContext, klass = ListDB::class.java, name = "listDB").build()

                INSTANCE = instance //???Still dont understand this part
                instance
            }
        }
    }
}