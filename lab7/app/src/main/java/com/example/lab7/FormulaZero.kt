package com.example.lab7

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun FormulaZeroApp() {
    val navController = rememberNavController()
    NavHost(navController=navController, startDestination= "home"){
        composable(route="home"){HomeScreen(navController)}
        composable(route="races"){UpcomingRacesScreen(navController)}
        composable(route="drivers"){DriversScreen(navController)}

    }
}