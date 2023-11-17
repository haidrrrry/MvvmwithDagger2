package get.instagram.followers.myapplication

import android.app.Application
import dagger.Component
import get.instagram.followers.myapplication.di.ApplicationComponent
import get.instagram.followers.myapplication.di.DaggerApplicationComponent


class FakerApplication:Application() {

    lateinit var application: ApplicationComponent

    override fun onCreate() {
        super.onCreate()

            application=DaggerApplicationComponent.factory().create(this)
    }
}