package com.example.groceryrebuildfinal.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
//Kind of wanted to do custom typography but ended up seeing 500 billion prebuilts and theyre proabably the best
// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),


     //Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle( //I cant add my own cusomt named types, so I have commandeered this one
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Bold,
        fontSize = 36.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    ),


)