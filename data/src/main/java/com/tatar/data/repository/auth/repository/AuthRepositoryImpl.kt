package com.tatar.data.repository.auth.repository

import com.tatar.core.mapper.mapTo
import com.tatar.core.result.Result
import com.tatar.data.repository.auth.mapper.AuthEntityMapper
import com.tatar.data.source.LocalDataSource
import com.tatar.data.source.RemoteDataSource
import com.tatar.domain.feature.auth.entity.AuthEntity
import com.tatar.domain.feature.auth.repository.AuthRepository
import javax.inject.Inject

class AuthRepositoryImpl @Inject constructor(
    private val localDataSource: LocalDataSource,
    private val remoteDataSource: RemoteDataSource
) : AuthRepository {
    override suspend fun login(): Result<AuthEntity> {
        return remoteDataSource.login()
            .mapTo(AuthEntityMapper)
    }
}