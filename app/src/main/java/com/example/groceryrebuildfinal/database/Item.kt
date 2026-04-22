package com.example.groceryrebuildfinal.database

import androidx.room.Entity
import androidx.room.PrimaryKey



@Entity(tableName = "list") //table stores, the item name and whether its checked
data class Item(@PrimaryKey(autoGenerate = true)
                val id: Int = 0,
                val item: String,
                val checked: Boolean)
{


}

