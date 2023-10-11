package uz.catsidroid.exampletutorial.data.mapper

import uz.catsidroid.exampletutorial.data.model.CoffeeData
import uz.catsidroid.exampletutorial.data.source.local.entity.CoffeeEntity


fun CoffeeEntity.toData(): CoffeeData = CoffeeData(
    id = this.id,
    name = this.name,
    description = this.description
)

fun CoffeeData.toEntity(): CoffeeEntity = CoffeeEntity(
    id = this.id,
    name = this.name,
    description = this.description
)