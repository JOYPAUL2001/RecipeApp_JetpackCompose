package com.example.mealapi

sealed class Screen(val route: String) {
    object RecipeScreen : Screen("recipeScreen")
    object DetailScreen : Screen("detailScreen")
}