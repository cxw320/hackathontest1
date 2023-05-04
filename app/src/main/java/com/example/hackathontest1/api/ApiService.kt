package com.example.hackathontest1.api

import com.example.hackathontest1.api.model.Location
import com.example.hackathontest1.api.model.PromptResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {

    @POST()
    suspend fun sendPrompt(
        @Body body: Location
    ): Response<PromptResponse>

}