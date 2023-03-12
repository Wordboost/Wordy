package com.tatar.core.result

import kotlin.coroutines.cancellation.CancellationException

inline fun <R> resultOf(block: () -> R): Result<R> {
    return try {
        Result.Success(block())
    } catch (e: CancellationException) {
        throw e
    } catch (e: Exception) {
        Result.Error(e)
    }
}

inline fun <R, T> Result<T>.map(transform: (value: T) -> R): Result<R> {
    return when (this) {
        is Result.Success -> Result.Success(transform(data))
        is Result.Error -> Result.Error(exception)
    }
}

inline fun <R, T> Result<R>.flatMap(transform: (value: R) -> Result<T>): Result<T> {
    return when (this) {
        is Result.Success -> transform(data)
        is Result.Error -> Result.Error(exception)
    }
}

inline fun <T> Result<T>.disclose(onSuccess: (T) -> Unit, onError: (t: Throwable) -> Unit) {
    when (this) {
        is Result.Success -> onSuccess(data)
        is Result.Error -> onError(exception)
    }
}