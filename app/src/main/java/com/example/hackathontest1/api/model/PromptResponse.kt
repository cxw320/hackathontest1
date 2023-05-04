package com.example.hackathontest1.api.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PromptResponse(
    @Json(name="result") val result : List<PromptResponseText>
) {
    companion object {

    }
}
