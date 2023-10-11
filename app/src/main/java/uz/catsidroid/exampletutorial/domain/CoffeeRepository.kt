package uz.catsidroid.exampletutorial.domain

import kotlinx.coroutines.flow.Flow
import uz.catsidroid.exampletutorial.data.model.CoffeeData

interface CoffeeRepository {
    fun getAllCoffee(): Flow<List<CoffeeData>>
    suspend fun addCoffee(coffee: CoffeeData)
    suspend fun updateCoffee(coffee: CoffeeData)
    suspend fun deleteCoffee(coffee: CoffeeData)
}