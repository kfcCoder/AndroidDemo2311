package com.example.androiddemo2311.navigation

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.NavGraph
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.androiddemo2311.screen.DetailScreen
import com.example.androiddemo2311.screen.HomeScreen
import com.example.androiddemo2311.screen.Screen

private val TAG = "NavGraph"

@Composable
fun SetupNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {

        composable(
            route = Screen.Home.route
        ) {
            HomeScreen(navController = navController)
        }

        composable(
            route = Screen.Detail.route,
            arguments = listOf(
                navArgument("id") { type = NavType.IntType }
            )
        ) {
            Log.e(TAG, "args: ${it.arguments?.getInt("id")}")
            DetailScreen(navController = navController)
        }




    }
}