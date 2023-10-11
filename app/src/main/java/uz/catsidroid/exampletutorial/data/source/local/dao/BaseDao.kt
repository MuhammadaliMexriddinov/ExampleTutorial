package uz.catsidroid.exampletutorial.data.source.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Entity
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Update

@Dao
interface BaseDao<T> {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(coffee: T)

    @Delete
    suspend fun  delete(coffee: T)

    @Update

    suspend fun  update(coffee: T)
}