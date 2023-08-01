package com.machado001.words.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navDeepLink
import com.machado001.words.MainActivity
import com.machado001.words.ui.navigation.AppDestinations.GAME_SCREEN_ROUTE
import com.machado001.words.ui.navigation.AppDestinations.HOME_SCREEN_ROUTE
import com.machado001.words.ui.navigation.AppDestinations.INSTRUCTIONS_SCREEN_ROUTE
import com.machado001.words.ui.screens.gameScreen.GameScreen
import com.machado001.words.ui.screens.homeScreen.Home
import com.machado001.words.ui.screens.instructionsScreen.InstructionsScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = HOME_SCREEN_ROUTE,
    routes: AppDestinations = AppDestinations,
    activity: MainActivity = MainActivity()
) {
    val actions = remember(navController) {
        AppActions(navController, routes)
    }
    val uri = "https://machado001.blogspot.com/2023/07/privacy-policy-gabriel-machado-built.html"
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {
        composable(
            startDestination,
            deepLinks = listOf(navDeepLink { uriPattern = "$uri/{id}" })
        ) {
            Home(
                modifier = modifier,
                onNavigateToGame = actions.navigateToGameScreen,
                onNavigateToInstructions = actions.navigateToInstructionsScreen,
                onNavigateUp = { actions.finishActivity(activity.finish()) },
                activity = activity
            )
        }
        composable(
            GAME_SCREEN_ROUTE,
        ) {
            GameScreen(
                onNavigateUp = actions.navigateUp,
                onPopBack = actions.popBack,
                onNavigateToHome = actions.navigateToHome,
            )
        }
        composable(INSTRUCTIONS_SCREEN_ROUTE) {
            InstructionsScreen(onNavigateUp = actions.navigateUp)
        }

    }
}