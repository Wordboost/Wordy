package com.tatar.wordy.di

import com.tatar.remote.api.WordyApi
import com.tatar.remote.util.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module(includes = [RemoteModule::class])
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Singleton
    @Provides
    fun wordyApi(retrofit: Retrofit): WordyApi {
        return retrofit.create(WordyApi::class.java)
    }

    @Singleton
    @Provides
    fun retrofit(
        okHttpClient: OkHttpClient,
        moshiConverterFactory: MoshiConverterFactory
    ): Retrofit {
        return Retrofit.Builder()
            .addConverterFactory(moshiConverterFactory)
            .client(okHttpClient)
            .baseUrl(Constants.BASE_URL)
            .build()
    }

    @Singleton
    @Provides
    fun okHttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .readTimeout(Constants.API_TIMEOUT, TimeUnit.SECONDS)
            .connectTimeout(Constants.API_TIMEOUT, TimeUnit.SECONDS)
            .build()
    }
}