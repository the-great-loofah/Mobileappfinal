package com.example.groceryrebuildfinal

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.groceryrebuildfinal.repository.Repository
import com.example.groceryrebuildfinal.ui.theme.GroceryrebuildfinalTheme
//import com.example.groceryrebuildfinal.ui.theme.app.AppScreen
import com.example.groceryrebuildfinal.ui.theme.app.AppUi
import com.example.groceryrebuildfinal.viewmodel.container
import com.example.groceryrebuildfinal.viewmodel.view

class MainActivity : ComponentActivity() {
    //private lateinit var appContainer: container
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        //appContainer = container(applicationContext)
        setContent {
            GroceryrebuildfinalTheme {
//                val viewModel: view = (viewModelFactory { appContainer.repo })
//                @androidx.compose.runtime.Composable {
//                   AppScreen(viewModel)
//                }
                AppUi()

            }
        }
    }
}



//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    GroceryrebuildfinalTheme {
//        Greeting("Android")
//    }
//}