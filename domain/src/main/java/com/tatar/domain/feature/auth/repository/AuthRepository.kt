package com.tatar.domain.feature.auth.repository

import com.tatar.core.result.Result
import com.tatar.domain.feature.auth.entity.AuthEntity

interface AuthRepository {
    suspend fun login(): Result<AuthEntity>
}