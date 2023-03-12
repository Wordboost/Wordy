package com.tatar.local

import com.tatar.core.result.Result
import com.tatar.data.source.LocalDataSource
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class LocalDataSourceImpl @Inject constructor() : LocalDataSource {
    override suspend fun saveToken(): Result<Unit> {
        return Result.Success(Unit)
    }
}