package com.tatar.wordy.di

import com.tatar.data.repository.auth.repository.AuthRepositoryImpl
import com.tatar.domain.feature.auth.repository.AuthRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface DataModule {
    @Binds
    fun bindsAuthRepository(authRepository: AuthRepositoryImpl): AuthRepository
}