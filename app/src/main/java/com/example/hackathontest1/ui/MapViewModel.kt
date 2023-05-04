package com.example.hackathontest1.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.hackathontest1.api.ApiService
import com.example.hackathontest1.api.model.Location
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MapViewModel @Inject constructor(
    private val apiService: ApiService
) : ViewModel(){

    val mapScreenStateFlow = MutableStateFlow(MapScreenState())

    fun onPromptSubmit(locationValue: String): String {

        viewModelScope.launch{
            apiService.sendPrompt(
                Location(locationValue)
            ).body().apply{
                val result = this?.result?.get(0)?.promptResponseText?:""
                mapScreenStateFlow.emit(
                    mapScreenStateFlow.value.copy(
                        promptResponse = result
                    )
                )
            }
        }
    }

}