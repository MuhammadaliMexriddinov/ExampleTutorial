package uz.catsidroid.exampletutorial.data.source.local

import androidx.room.Database
import androidx.room.RoomDatabase
import uz.catsidroid.exampletutorial.data.source.local.dao.CoffeeDao
import uz.catsidroid.exampletutorial.data.source.local.entity.CoffeeEntity

@Database(entities = [CoffeeEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun getCoffeeDao(): CoffeeDao
}