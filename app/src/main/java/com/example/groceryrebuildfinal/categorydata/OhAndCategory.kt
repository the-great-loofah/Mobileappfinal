package com.example.groceryrebuildfinal.categorydata

import android.view.Display
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import com.example.grocerylist.categorydata.GroceryCategory
import com.example.groceryrebuildfinal.R
import com.example.groceryrebuildfinal.ui.theme.OrangeL
import com.example.groceryrebuildfinal.ui.theme.Typography

class OhAndCategory: GroceryCategory("Oh, and...", ohAnd)
{

    @Composable
    @Override
    public override fun Display()
    {
        var input by remember {mutableStateOf("")}
        //var reset by remember { mutableStateOf(false) }
        Column(modifier = Modifier.fillMaxHeight())
        {
            Row()
            {
                Text(text = categoryName,
                    style = Typography.labelSmall,

                    modifier = Modifier.padding(bottom = dimensionResource(R.dimen.generalpadding), start = dimensionResource(R.dimen.generalpadding)), textDecoration = TextDecoration.Underline, color = MaterialTheme.colorScheme.scrim)
            }

            for(items in ohAnd) {
                Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically)
                {
                    var state by rememberSaveable() { mutableStateOf(true) } //state of the checkbox

                    Checkbox(checked = state, onCheckedChange = {state = it}, modifier = Modifier.padding(start = dimensionResource(R.dimen.itempadding)))
                    Text(text = items, modifier = Modifier.padding(start = dimensionResource(R.dimen.itempadding)))
                }

            }
//            Row(modifier = Modifier.fillMaxWidth())
//            {   //Why wont the text field dimensions change?? :(
//                OutlinedTextField(value = input, onValueChange = {input = it}, modifier = Modifier.width(100.dp).weight(1f))
//            }
//            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center)
//            {
//                TextButton(onClick = {ohAnd.add(input); reset = !reset}, colors = ButtonDefaults.textButtonColors(containerColor = OrangeL))
//                {
//                    Text(text = stringResource(R.string.oh), color = MaterialTheme.colorScheme.scrim)
//                }
//            }
        }
    }
}

