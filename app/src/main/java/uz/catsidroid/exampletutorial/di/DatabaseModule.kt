package uz.catsidroid.exampletutorial.di

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import uz.catsidroid.exampletutorial.data.source.local.AppDatabase
import uz.catsidroid.exampletutorial.data.source.local.dao.CoffeeDao
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DatabaseModule {

    @[Singleton Provides]
    fun providesDatabase(@ApplicationContext context: Context):AppDatabase= Room.databaseBuilder(context , AppDatabase::class.java , "App.DB").build()

    @[Singleton Provides]
    fun provideCoffeeDao(databse:AppDatabase):CoffeeDao=databse.getCoffeeDao()
}