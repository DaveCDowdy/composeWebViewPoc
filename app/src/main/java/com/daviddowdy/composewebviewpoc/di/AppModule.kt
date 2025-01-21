package com.daviddowdy.composewebviewpoc.di

import com.daviddowdy.composewebviewpoc.data.WebRepositoryImpl
import com.daviddowdy.composewebviewpoc.domain.WebRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class AppModule {

    @Binds
    @Singleton
    abstract fun bindWebRepository(
        webRepositoryImpl: WebRepositoryImpl
    ): WebRepository
}