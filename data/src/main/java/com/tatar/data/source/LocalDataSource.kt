package com.tatar.data.source

import com.tatar.core.result.Result

interface LocalDataSource {
    suspend fun saveToken(): Result<Unit>
}