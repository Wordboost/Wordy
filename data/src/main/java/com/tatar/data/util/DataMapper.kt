package com.tatar.data.util

interface DataMapper<From, To> {
    fun mapTo(from: From): To
}

fun <From, To> From.mapTo(
    mapper: DataMapper<From, To>
): To = mapper.mapTo(this)