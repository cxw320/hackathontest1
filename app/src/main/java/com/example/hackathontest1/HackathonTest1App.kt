package com.example.hackathontest1

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.hackathontest1.ui.MapScreen

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HackathonTest1App(){

    val appState = rememberAppState()

    // A surface container using the 'background' color from the theme
    Scaffold(
    modifier = Modifier.fillMaxSize(),
    //color = MaterialTheme.colors.background
    ){
        NavHost(
            navController = appState.navHostController,
            startDestination = "MapScreen",
            modifier = Modifier
        ){
            willowReadsGraph(appState)
        }
    }
}

@Composable
fun rememberAppState(
    navController: NavHostController = rememberNavController(),
) =
    remember(navController){
        HackathonTest1AppState(navController)
    }

fun NavGraphBuilder.willowReadsGraph(
    appState: HackathonTest1AppState
){
    composable("MapScreen"){
        MapScreen ( route -> appState.navigate(route) )
    }
}