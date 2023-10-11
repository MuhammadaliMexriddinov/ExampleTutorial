package uz.catsidroid.exampletutorial.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import uz.catsidroid.exampletutorial.domain.CoffeeRepository
import uz.catsidroid.exampletutorial.domain.impl.CoffeeRepositoryImpl
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {
    @[Binds Singleton]
    fun bindCoffeeRepository(bind:CoffeeRepositoryImpl): CoffeeRepository
}