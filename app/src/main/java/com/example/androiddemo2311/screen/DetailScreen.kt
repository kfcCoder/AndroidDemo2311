package com.example.androiddemo2311.screen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun DetailScreen(
    navController: NavHostController
) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Detail",
            color = MaterialTheme.colorScheme.error,
            style = MaterialTheme.typography.bodyLarge,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            modifier = Modifier.clickable {
                //navController.navigateUp()

//                navController.navigate(route = Screen.Home.route) {
//                    popUpTo(Screen.Home.route) {
//                        inclusive = true
//                    }
//                }

                navController.navigate(route = Screen.Home.passIdAndName(id = 21, name = "hihi"))
            }
        )
    }
}

@Composable
@Preview(showBackground = true)
fun PreviewDetailScreen() {
    DetailScreen(navController = rememberNavController())
}