package com.tatar.wordy.viewmodel.base

import androidx.annotation.CallSuper
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.*
import timber.log.Timber
import kotlin.coroutines.CoroutineContext

open class BaseViewModel : ViewModel(), CoroutineScope {

    protected open val TAG = this::class.simpleName ?: "Unknown class"

    override val coroutineContext: CoroutineContext by lazy {
        dispatcher() + SupervisorJob() + CoroutineName(TAG) + exceptionHandler
    }

    private val exceptionHandler = CoroutineExceptionHandler { _, e ->
        Timber.tag(TAG).e(e)
    }

    private fun dispatcher(): CoroutineDispatcher {
        return Dispatchers.Main
    }

    @CallSuper
    override fun onCleared() {
        coroutineContext.cancel()
        super.onCleared()
    }
}