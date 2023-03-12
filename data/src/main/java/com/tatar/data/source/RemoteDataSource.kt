package com.tatar.data.source

import com.tatar.core.result.Result
import com.tatar.data.repository.auth.dto.AuthDto

interface RemoteDataSource {
    suspend fun login(): Result<AuthDto>
}