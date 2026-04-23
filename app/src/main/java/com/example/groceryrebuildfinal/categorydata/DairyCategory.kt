package com.example.grocerylist.categorydata

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.style.TextDecoration
import com.example.groceryrebuildfinal.R
import com.example.groceryrebuildfinal.categorydata.dairyList

import com.example.groceryrebuildfinal.ui.theme.Typography

class DairyCategory: GroceryCategory("Dairy", dairyList)
{
    companion object{fun getDefault(): DairyCategory = DairyCategory()} // Static object

    @Composable
    @Override
    public override fun Display()
    {
        Text(text = categoryName,
            style = Typography.labelSmall,
            modifier = Modifier.padding(bottom = dimensionResource(R.dimen.generalpadding), start = dimensionResource(R.dimen.generalpadding)), color = MaterialTheme.colorScheme.scrim, textDecoration = TextDecoration.Underline)
        for(items in dairyList) {
            Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically)
            {
                var state by rememberSaveable() { mutableStateOf(false) } //state of the checkbox

                Checkbox(checked = state, onCheckedChange = {state = it}, modifier = Modifier.padding(start = dimensionResource(R.dimen.itempadding)))
                Text(text = items, modifier = Modifier.padding(start = dimensionResource(R.dimen.itempadding)))
            }
        }
    }
}