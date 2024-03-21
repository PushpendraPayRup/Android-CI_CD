package com.example.androidcicd.hilt

import com.example.androidcicd.network.ApiInterface
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
@InstallIn(SingletonComponent::class)
class HiltModule {
    @Provides
    fun providesGson(): GsonConverterFactory {
        return GsonConverterFactory.create()
    }

    @Provides
    fun providesRetrofit(gsonConverterFactory: GsonConverterFactory): Retrofit {
        return Retrofit.Builder()
            .baseUrl("url")
            .addConverterFactory(gsonConverterFactory)
            .build()
    }

    @Provides fun providesHomeApi(retrofit: Retrofit) = retrofit.create(ApiInterface::class.java)
}