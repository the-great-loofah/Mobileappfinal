package com.example.grocerylist.categorydata

import android.view.Display
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable

//abstract class for the different list categories

abstract class GroceryCategory(val categoryName: String, var items: List<String>)
{
    var isClicked = mutableStateOf(false)

    @Composable
     public open fun Display()
     {

     }
}