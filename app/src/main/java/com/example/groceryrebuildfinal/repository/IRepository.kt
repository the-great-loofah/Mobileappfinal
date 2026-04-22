package com.example.groceryrebuildfinal.repository

import com.example.groceryrebuildfinal.database.Item
import kotlinx.coroutines.flow.Flow

interface IRepository
{
    suspend fun insertStream(item: Item)

    suspend fun updateStream(item: Item)

    suspend fun deleteStream(item: Item)

    suspend fun getItemStream(item: String): Flow<Item>

    fun GetAllStream(): Flow<List<Item>>
}