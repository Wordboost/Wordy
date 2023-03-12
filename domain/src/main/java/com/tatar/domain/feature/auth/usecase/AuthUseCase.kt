package com.tatar.domain.feature.auth.usecase

import com.tatar.core.result.Result
import com.tatar.domain.base.UseCase
import com.tatar.domain.feature.auth.entity.AuthEntity
import com.tatar.domain.feature.auth.repository.AuthRepository
import javax.inject.Inject

class AuthUseCase @Inject constructor(
    private val authRepository: AuthRepository
) : UseCase.NoArg<AuthEntity>() {
    override suspend fun invoke(): Result<AuthEntity> {
        return authRepository.login()
    }
}