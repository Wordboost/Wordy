package com.tatar.data.repository.auth.mapper

import com.tatar.core.mapper.Mapper
import com.tatar.core.result.Result
import com.tatar.core.result.map
import com.tatar.data.repository.auth.dto.AuthDto
import com.tatar.domain.feature.auth.entity.AuthEntity

object AuthEntityMapper : Mapper<AuthDto, AuthEntity> {
    override fun mapTo(from: Result<AuthDto>): Result<AuthEntity> {
        return from.map {
            AuthEntity(
                test = it.test
            )
        }
    }
}