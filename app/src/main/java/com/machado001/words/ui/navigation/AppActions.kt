package com.machado001.words.ui.navigation

import androidx.navigation.NavHostController

class AppActions(
    private val navController: NavHostController,
    private val routes: AppDestinations
) {
    val navigateToGameScreen = {
        navController.navigate(routes.GAME_SCREEN_ROUTE)
    }
    val navigateToHome = {
        navController.navigate(routes.HOME_SCREEN_ROUTE)
    }
    val navigateToInstructionsScreen = {
        navController.navigate(routes.INSTRUCTIONS_SCREEN_ROUTE)
    }

    fun finishActivity(finishActivity: Unit) = finishActivity

    // Navigates to previous screen from current screen.
    val navigateUp: () -> Unit = { navController.navigateUp() }
    val popBack: () -> Boolean = { navController.popBackStack() }
}