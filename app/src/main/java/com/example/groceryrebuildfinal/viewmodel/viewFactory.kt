package com.example.groceryrebuildfinal.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.groceryrebuildfinal.repository.IRepository

class viewFactory(val repo: IRepository): ViewModelProvider.Factory
{
    fun <T: view> create(modelClass: Class<T>) : T
    {
        if(modelClass.isAssignableFrom(view::class.java))
        {
            @Suppress("UNCHECKED_CAST")
            return view(repo) as T
        }
        throw IllegalArgumentException("View broke")
    }
}