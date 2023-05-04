package com.example.hackathontest1.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel

data class MapScreenState(
    val promptResponse: String
)

@Composable
fun MapScreen(
    navigate: (String) -> Unit,
    viewModel: MapViewModel = hiltViewModel()
){

    viewModel.onPromptSubmit("Alaska")

    Column(

    ){

    }
}