package com.example.mealapi

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun RecipeApp(modifier: Modifier,navHostController: NavHostController) {

    val recipeViewModel: MainViewModel = viewModel()
    val viewState by recipeViewModel.categoryState

    NavHost(navController = navHostController, startDestination = Screen.RecipeScreen.route) {
        composable(Screen.RecipeScreen.route) {
            RecipeScreen(viewState = viewState, navigateToDetails = {
                navHostController.currentBackStackEntry?.savedStateHandle?.set("cat", it)
                navHostController.navigate(Screen.DetailScreen.route)
            })
        }
        composable(Screen.DetailScreen.route) {
            val category = navHostController.previousBackStackEntry?.savedStateHandle?.get<CategoryX>("cat")?: CategoryX("","","","")
            CategoryDetailsScreen(category)
        }
    }
}