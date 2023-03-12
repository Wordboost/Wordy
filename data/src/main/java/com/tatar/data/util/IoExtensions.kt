package com.tatar.data.util

import com.tatar.core.result.Result
import com.tatar.core.result.resultOf
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

@Suppress("FunctionName")
suspend inline fun <T : Any> IO(
    crossinline producer: suspend () -> T
): Result<T> = resultOf {
    withContext(Dispatchers.IO) {
        producer()
    }
}


