package com.tatar.remote.response.auth

import com.squareup.moshi.Json

data class AuthResponse(
    @Json(name = "test") val test: String
)