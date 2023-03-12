package com.tatar.core.mapper

import com.tatar.core.result.Result

interface Mapper<From, To> {
    fun mapTo(from: Result<From>): Result<To>
}

fun <From, To> Result<From>.mapTo(
    mapper: Mapper<From, To>
): Result<To> = mapper.mapTo(this)