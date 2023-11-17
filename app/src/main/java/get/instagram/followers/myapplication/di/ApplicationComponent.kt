package get.instagram.followers.myapplication.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import get.instagram.followers.myapplication.MainActivity
import javax.inject.Singleton


@Singleton
@Component(modules = [NetworkModule::class])
interface  ApplicationComponent {
    fun inject(mainActivity: MainActivity)

    @Component.Factory
    interface Factory{
        fun create(@BindsInstance context: Context):ApplicationComponent
    }
}