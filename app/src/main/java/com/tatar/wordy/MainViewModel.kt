package com.tatar.wordy

import com.tatar.core.result.disclose
import com.tatar.domain.feature.auth.entity.AuthEntity
import com.tatar.domain.feature.auth.usecase.AuthUseCase
import com.tatar.wordy.viewmodel.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import timber.log.Timber
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val authUseCase: AuthUseCase
) : BaseViewModel() {

    init {
        //onLoginRequest() // TODO why is it not triggered?
    }

    fun onLoginRequest() = launch {
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