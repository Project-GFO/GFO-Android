package com.msg.gfo_v2.gfo.base.di.module

import com.msg.gfo_v2.gfo.data.remote.datasource.AuthDataSource
import com.msg.gfo_v2.gfo.data.remote.datasource.AuthDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class DataSourceModule {
    @Binds
    abstract fun provideAuthDataSource(
        commonDatasourceImpl: AuthDataSourceImpl
    ): AuthDataSource


}