package com.example.grocerylist.categorydata

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.tooling.ComposeToolingApi
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.unit.dp
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat
import com.example.grocerylist.R
import com.example.grocerylist.fruitsList
import com.example.grocerylist.categorydata.GroceryCategory
import com.example.grocerylist.ui.theme.Typography

class FruitCategory: GroceryCategory("Fruit", fruitsList)
{
    companion object{fun getDefault(): FruitCategory = FruitCategory()} // Static object

    @Composable
    @Override
    public override fun Display()
    {
            Text(text = categoryName,
                style = Typography.headlineMedium,
                modifier = Modifier.padding(bottom = dimensionResource(R.dimen.generalpadding), start = dimensionResource(R.dimen.generalpadding)))
            for(items in fruitsList) {
                Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically)
                {
                    var state by rememberSaveable() { mutableStateOf(false) } //state of the checkbox

                    Checkbox(checked = state, onCheckedChange = {state = it}, modifier = Modifier.padding(start = dimensionResource(R.dimen.itempadding)))
                    Text(text = items, modifier = Modifier.padding(start = dimensionResource(R.dimen.itempadding)))
                }
            }
    }
}