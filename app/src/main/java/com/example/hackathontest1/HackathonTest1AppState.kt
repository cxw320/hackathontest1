package com.example.hackathontest1

import androidx.compose.runtime.Stable
import androidx.navigation.NavHostController

@Stable
class HackathonTest1AppState(
    val navHostController: NavHostController
) {

    fun navigate(route: String){
        navHostController.navigate(route){
            launchSingleTop = true
        }
    }
}