package com.example.mealapi

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign

import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter

@Composable
fun CategoryDetailsScreen(category: CategoryX) {
    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = category.strCategory, textAlign = TextAlign.Center)
        Image(
            painter = rememberAsyncImagePainter(category.strCategoryThumb),
            contentDescription = "${category.strCategory}+ Thumbnail",
            modifier = Modifier
                .wrapContentSize()
                .aspectRatio(1f)
        )
        Text(text = category.strCategoryDescription, textAlign = TextAlign.Justify,
            modifier = Modifier.verticalScroll(rememberScrollState())
            )
    }
}