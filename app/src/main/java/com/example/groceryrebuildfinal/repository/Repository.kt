package com.example.groceryrebuildfinal.repository

import com.example.groceryrebuildfinal.database.Item
import com.example.groceryrebuildfinal.database.ItemDao
import kotlinx.coroutines.flow.Flow

class Repository(val ItemDao: ItemDao): IRepository
{
    companion object
    {

    }
    override fun GetAllStream(): Flow<List<Item>> = ItemDao.getAll()

    override suspend fun getItemStream(item: String): Flow<Item> = ItemDao.getItem(item)

    override suspend fun deleteStream(item: Item) = ItemDao.delete(item)

    override suspend fun insertStream(item: Item) = ItemDao.insert(item)

    override suspend fun updateStream(item: Item) = ItemDao.update(item)
}