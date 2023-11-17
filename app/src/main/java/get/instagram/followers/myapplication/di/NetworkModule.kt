package get.instagram.followers.myapplication.di

import dagger.Module
import dagger.Provides
import get.instagram.followers.myapplication.retrofit.FakerApi
import get.instagram.followers.myapplication.utils.Constants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
class NetworkModule {
    @Singleton
    @Provides
    fun providesRetrofit():Retrofit{
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL).
            addConverterFactory(GsonConverterFactory.
            create()).build()

    }
    @Singleton
    @Provides
    fun providesFakerAPI(retrofit: Retrofit):FakerApi{
        return retrofit.create(FakerApi::class.java)
    }
}