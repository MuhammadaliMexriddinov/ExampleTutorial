package uz.catsidroid.exampletutorial.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import uz.catsidroid.exampletutorial.navigation.AppNavigator
import uz.catsidroid.exampletutorial.navigation.NavigationDispatcher
import uz.catsidroid.exampletutorial.navigation.NavigationHandler

@Module
@InstallIn(SingletonComponent::class)
interface NavigationModule {


    @Binds
    fun bindAppNavigator(impl : NavigationDispatcher):AppNavigator

    @Binds
    fun bindNavigationHandler(impl: NavigationDispatcher): NavigationHandler
}