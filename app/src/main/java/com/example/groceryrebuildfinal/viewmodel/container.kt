package com.example.groceryrebuildfinal.viewmodel

import com.example.groceryrebuildfinal.database.ListDB
import com.example.groceryrebuildfinal.repository.IRepository
import com.example.groceryrebuildfinal.repository.Repository

class container(context: android.content.Context?)
{
    val database = ListDB.getDb(context)

    val repo: IRepository by lazy { Repository(database.Dao()) }

}