package com.tatar.wordy.di

import com.tatar.data.source.LocalDataSource
import com.tatar.local.LocalDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import java.util.*


@Module(includes = [LocalModule.Binder::class])
@InstallIn(SingletonComponent::class)
object LocalModule {

    @Module
    @InstallIn(SingletonComponent::class)
    interface Binder {
        @Binds
        fun bindLocalDataSourceImpl(localDataSourceImpl: LocalDataSourceImpl): LocalDataSource
    }
}