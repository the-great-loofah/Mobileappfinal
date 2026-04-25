package com.example.groceryrebuildfinal.categorydata

//import android.R

//I understand this is bad :(

//Collection of category titles and some sample items in them
//Lists

val fruitsList: List<String> = listOf("Apples", "Oranges", "StrawBerry", "Grapes", "Pineapple") //Might add this to the string.xml but the sheer quantity of items makes it excessive despite the efficiency gains

val vegetableList: List<String> = listOf("Broccoli", "Potatoes", "Lettuce", "Onions") //The only 4 vegetables youll even need

val meatList: List<String> = listOf("Beef", "Chicken", "Tuna", "Salmon") //ordered in terms of healthiness from worst to best (source?: It came to me in a dream)

val dairyList: List<String> = listOf("Milk", "Butter", "Eggs", "Cheese") //♫One of these things are not like the others♫

var ohAnd: MutableList<String> = mutableListOf()