package uz.catsidroid.exampletutorial.domain.impl

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.withContext
import uz.catsidroid.exampletutorial.data.mapper.toData
import uz.catsidroid.exampletutorial.data.mapper.toEntity
import uz.catsidroid.exampletutorial.data.model.CoffeeData
import uz.catsidroid.exampletutorial.data.source.local.dao.CoffeeDao
import uz.catsidroid.exampletutorial.domain.CoffeeRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CoffeeRepositoryImpl @Inject constructor(private val dao: CoffeeDao) : CoffeeRepository {
    override fun getAllCoffee(): Flow<List<CoffeeData>> = dao.getAllCoffee().map {
        it.map { it.toData() }
    }.flowOn(Dispatchers.IO)

    override suspend fun addCoffee(coffee: CoffeeData) = withContext(Dispatchers.IO) {
        dao.insert(coffee.toEntity())
    }

    override suspend fun updateCoffee(coffee: CoffeeData) = withContext(Dispatchers.IO) {
        dao.update(coffee.toEntity())
    }

    override suspend fun deleteCoffee(coffee: CoffeeData) = withContext(Dispatchers.IO) {
        dao.delete(coffee.toEntity())
    }

}