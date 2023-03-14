package com.msg.gfo_v2.gfo.base.di.module

import com.msg.gfo_v2.BuildConfig
import com.msg.gfo_v2.gfo.data.remote.network.AuthAPI
import com.msg.gfo_v2.gfo.data.remote.network.EmailAPI
import com.msg.gfo_v2.gfo.data.remote.network.LoginInterceptor
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import java.util.concurrent.TimeUnit

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {


    @Provides
    fun provideOkhttpClient(
        loginInterceptor : LoginInterceptor
    ): OkHttpClient{
        return OkHttpClient.Builder()
            .connectTimeout(30, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(30, TimeUnit.SECONDS)
            .addInterceptor(loginInterceptor)
            .build()
    }

    @Provides
    fun provideRetrofitInstance(
        okHttpClient: OkHttpClient,
        gsonConverterFactory: GsonConverterFactory
    ): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BuildConfig.BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(gsonConverterFactory)
            .build()
    }

    @Provides
    fun provideGsonConverterFactory() : GsonConverterFactory{
        return GsonConverterFactory.create()
    }

    @Provides
    fun provideCommonService(retrofit: Retrofit): AuthAPI{
        return retrofit.create(AuthAPI::class.java)
    }

    @Provides
    fun provideEmailService(retrofit: Retrofit): EmailAPI = retrofit.create(EmailAPI::class.java)


}