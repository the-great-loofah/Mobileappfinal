package com.example.grocerylist.ui.app

import android.R
import android.content.res.Resources
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.grocerylist.categorydata.DairyCategory
import com.example.grocerylist.categorydata.FruitCategory
import com.example.grocerylist.categorydata.GroceryCategory
import com.example.grocerylist.categorydata.MeatCategory
import com.example.grocerylist.categorydata.VeggieCategory
import com.example.grocerylist.fruitsList
import com.example.grocerylist.ui.theme.Black
import com.example.grocerylist.ui.theme.OrangeL
import com.example.grocerylist.ui.theme.Purple40

class AppUi() {
    @OptIn(ExperimentalMaterial3Api::class) //For some reason the top bar isnt working for me. References to get this far: SomeKoder. (2023, April 21). Jetpack Compose - Why does my Material3 TopAppBar have a huge padding at the top?. stackoverflow. https://stackoverflow.com/questions/76075850/jetpack-compose-why-does-my-material3-topappbar-have-a-huge-padding-at-the-top
    @Composable
    fun DisplayAll() {
        Scaffold(
            topBar = {
                TopAppBar(
                    colors = TopAppBarDefaults.topAppBarColors(containerColor = Purple40, titleContentColor = Black),
                    title = { Text("My Grocery App") }
                    )

            }
        )
        { customPadding -> Row(modifier = Modifier.fillMaxWidth().padding(customPadding))
        {
                Column(
                    modifier = Modifier.fillMaxHeight().weight(1f).statusBarsPadding()
                        .verticalScroll(rememberScrollState()).background(
                            OrangeL
                        )
                ) //to make it so user can scroll
                {
                    var categoriesList: MutableList<GroceryCategory> = mutableListOf()
                    categoriesList.add(FruitCategory())
                    categoriesList.add(DairyCategory())
                    categoriesList.add(MeatCategory())
                    categoriesList.add(VeggieCategory())

                    categoriesList.forEach { item -> item.Display() }
                }
//                Column(modifier = Modifier.fillMaxHeight().weight(1f).statusBarsPadding()) //Ran out of time for this
//                {
//                    Spacer(modifier = Modifier.padding())
//                }
        }
        }
    }
}

