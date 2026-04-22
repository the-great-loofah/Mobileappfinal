package com.example.groceryrebuildfinal.ui.theme.app

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import com.example.grocerylist.categorydata.DairyCategory
import com.example.grocerylist.categorydata.FruitCategory
import com.example.grocerylist.categorydata.GroceryCategory
import com.example.grocerylist.categorydata.MeatCategory
import com.example.grocerylist.categorydata.VeggieCategory
import com.example.groceryrebuildfinal.R
import com.example.groceryrebuildfinal.categorydata.OhAndCategory
import com.example.groceryrebuildfinal.repository.Repository
import com.example.groceryrebuildfinal.ui.theme.Black
import com.example.groceryrebuildfinal.ui.theme.OrangeL
import com.example.groceryrebuildfinal.ui.theme.Purple40


//Had to rebuild this whole screen to accommodate the DB. Next time, Ill start backend before frontend ;_;
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppUi()
{
    //val items by view.Repo.GetAllStream().collectAsState(initial = emptyList())

    //var item by remember { mutableStateOf("") } //I feel like im defining these variables alot but i dont know where they are
    //var checked by remember { mutableStateOf(false) }

    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Purple40, titleContentColor = Black),
                title = { Text("Grocery app") }
            )
        }
    )
    { customPadding -> Row(modifier = Modifier.fillMaxWidth().padding(customPadding))
        {
        Row(modifier = Modifier.fillMaxWidth())
        {
            Column(
                modifier = Modifier.weight(1f).fillMaxHeight().verticalScroll(rememberScrollState()).background(color = OrangeL)

            ) //to make it so user can scroll
            {
                var categoriesList: MutableList<GroceryCategory> = mutableListOf()
                categoriesList.add(FruitCategory())
                categoriesList.add(DairyCategory())
                categoriesList.add(MeatCategory())
                categoriesList.add(VeggieCategory())

                categoriesList.forEach { item -> item.Display() }
            }
            Column(modifier = Modifier.weight(1f).fillMaxHeight()) //Ran out of time for this
            {
                Row(modifier = Modifier.fillMaxWidth().weight(1f))
                {
                    OhAndCategory().Display()
                }
            }
        }

        }
    }
}



//class AppUi() {
//    @OptIn(ExperimentalMaterial3Api::class) //For some reason the top bar isnt working for me. References to get this far: SomeKoder. (2023, April 21). Jetpack Compose - Why does my Material3 TopAppBar have a huge padding at the top?. stackoverflow. https://stackoverflow.com/questions/76075850/jetpack-compose-why-does-my-material3-topappbar-have-a-huge-padding-at-the-top
//    @Composable
//    fun DisplayAll() {
//
//    }
//}

