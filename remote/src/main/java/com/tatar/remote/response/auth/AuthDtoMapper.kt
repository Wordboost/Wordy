package com.tatar.remote.response.auth

import com.tatar.data.repository.auth.dto.AuthDto
import com.tatar.data.util.DataMapper

object AuthDtoMapper : DataMapper<AuthResponse, AuthDto> {
    override fun mapTo(from: AuthResponse): AuthDto {
        return AuthDto(
            test = from.test
        )
    }
}