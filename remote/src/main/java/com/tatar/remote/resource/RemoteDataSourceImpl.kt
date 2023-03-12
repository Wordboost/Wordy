package com.tatar.remote.resource

import com.tatar.core.result.Result
import com.tatar.data.repository.auth.dto.AuthDto
import com.tatar.data.source.RemoteDataSource
import com.tatar.data.util.IO
import com.tatar.data.util.mapTo
import com.tatar.remote.api.WordyApi
import com.tatar.remote.response.auth.AuthDtoMapper
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RemoteDataSourceImpl @Inject constructor(
    private val wordyApi: WordyApi
) : RemoteDataSource {

    override suspend fun login(): Result<AuthDto> {
        return IO {
            wordyApi.login()
                .mapTo(AuthDtoMapper)
        }
    }
}