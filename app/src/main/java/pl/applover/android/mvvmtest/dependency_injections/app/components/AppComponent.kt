package pl.applover.android.mvvmtest.dependency_injections.app.components

import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import pl.applover.android.mvvmtest.App
import pl.applover.android.mvvmtest.dependency_injections.app.modules.ActivityBuilder
import pl.applover.android.mvvmtest.dependency_injections.app.modules.AppModule
import pl.applover.android.mvvmtest.dependency_injections.internet.example.ExampleNetModule
import javax.inject.Singleton

/**
 * Created by Janusz Hain on 2018-01-08.
 */
@Singleton
@Component(modules = arrayOf(
        AndroidSupportInjectionModule::class,
        ExampleNetModule::class,
        AppModule::class,
        ActivityBuilder::class
))
interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: App): Builder

        fun build(): AppComponent
    }

    fun inject(app: App)

}