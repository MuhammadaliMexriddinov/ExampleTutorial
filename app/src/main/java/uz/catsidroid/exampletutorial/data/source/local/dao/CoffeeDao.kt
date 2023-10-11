package uz.catsidroid.exampletutorial.data.source.local.dao

import androidx.room.Dao
import androidx.room.Query
import kotlinx.coroutines.flow.Flow
import uz.catsidroid.exampletutorial.data.source.local.entity.CoffeeEntity

@Dao
interface CoffeeDao: BaseDao<CoffeeEntity> {
    @Query("SELECT * FROM coffee")
    fun getAllCoffee():Flow<List<CoffeeEntity>>
}