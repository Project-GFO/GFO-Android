package com.msg.gfo_v2.gfo.base.di.module

import com.msg.gfo_v2.gfo.data.remote.datasource.AuthDataSourceImpl
import com.msg.gfo_v2.gfo.data.repository.AuthRepositoryImpl
import com.msg.gfo_v2.gfo.domain.repository.AuthRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    abstract fun provideAuthRepository(dataSource: AuthRepositoryImpl): AuthRepository
}