package com.tatar.wordy

import com.tatar.core.result.disclose
import com.tatar.domain.feature.auth.entity.AuthEntity
import com.tatar.domain.feature.auth.usecase.AuthUseCase
import com.tatar.wordy.viewmodel.base.BaseViewModel
import kotlinx.coroutines.launch
import timber.log.Timber

class MainViewModel constructor(
    private val authUseCase: AuthUseCase
) : BaseViewModel() {

    init {
        onLoginRequest()
    }

    private fun onLoginRequest() = launch {
        authUseCase()
            .disclose(
                { onSuccess(it) },
                { onError(it) }
            )
    }

    private fun onSuccess(authEntity: AuthEntity) {
        Timber.tag(TAG).d("authUseCase onSuccess: $authEntity")
    }

    private fun onError(throwable: Throwable) {
        Timber.tag(TAG).e(throwable, "authUseCase onError")
    }
}