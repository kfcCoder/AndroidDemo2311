package com.example.androiddemo2311.navigation

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.androiddemo2311.screen.DETAIL_ARGUMENT_KEY1
import com.example.androiddemo2311.screen.DETAIL_ARGUMENT_KEY2
import com.example.androiddemo2311.screen.DetailScreen
import com.example.androiddemo2311.screen.HOME_ARGUMENT_KEY1
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
        // Home
        composable(
            route = Screen.Home.route,
            arguments = listOf(
                navArgument(HOME_ARGUMENT_KEY1) {
                    type = NavType.IntType
                    //defaultValue = -1
                }
            )
        ) {
            Log.e(TAG, "id: ${it.arguments?.getInt(HOME_ARGUMENT_KEY1)}")
            HomeScreen(navController = navController)
        }

        // Detail
        composable(
            route = Screen.Detail.route,
            arguments = listOf(
                navArgument(DETAIL_ARGUMENT_KEY1) { type = NavType.IntType },
                navArgument(DETAIL_ARGUMENT_KEY2) { type = NavType.StringType},
            )
        ) {
            Log.d(TAG, "id: ${it.arguments?.getInt(DETAIL_ARGUMENT_KEY1)}")
            Log.d(TAG, "name: ${it.arguments?.getString(DETAIL_ARGUMENT_KEY2)}")
            DetailScreen(navController = navController)
        }




    }
}