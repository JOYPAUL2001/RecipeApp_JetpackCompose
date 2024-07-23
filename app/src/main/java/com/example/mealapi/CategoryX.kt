package com.example.mealapi

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class CategoryX(
    val idCategory: String,
    val strCategory: String,
    val strCategoryDescription: String,
    val strCategoryThumb: String
):Parcelable