package com.example.groceryrebuildfinal.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.groceryrebuildfinal.database.Item
import com.example.groceryrebuildfinal.repository.IRepository
import kotlinx.coroutines.launch

class view(public val repo: IRepository): ViewModel()
{
    fun add(name: String, checked: Boolean)
    {
        val item = Item(item = name, checked = checked)

        viewModelScope.launch { repo.insertStream(item) }
    }

    fun update(item: Item)
    {
        viewModelScope.launch { repo.updateStream(item) }
    }

    fun get(item: Item)
    {
        viewModelScope.launch { repo.getItemStream(String()) }
    }

    fun getAll()
    {
        viewModelScope.launch { repo.GetAllStream() }
    }



}