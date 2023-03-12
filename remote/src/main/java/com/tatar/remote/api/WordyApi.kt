package com.tatar.remote.api

import com.tatar.remote.response.auth.AuthResponse
import retrofit2.http.GET

interface WordyApi {
    @GET("")
    suspend fun login(): AuthResponse
}