package uz.catsidroid.exampletutorial.presentation.main

import uz.catsidroid.exampletutorial.data.model.CoffeeData
import uz.catsidroid.exampletutorial.navigation.AppNavigator
import uz.catsidroid.exampletutorial.presentation.add.AddScreen
import uz.catsidroid.exampletutorial.presentation.update.EditScreen
import javax.inject.Inject
import javax.inject.Singleton

interface MainDirection {
    suspend fun openAddScreen()
    suspend fun openUpdateScreen(coffeeData: CoffeeData)
}


@Singleton
class MainDirectionImpl @Inject constructor(private val appNavigator: AppNavigator) :
    MainDirection {
    override suspend fun openAddScreen() {
        appNavigator.openScreenWithSave(AddScreen())
    }

    override suspend fun openUpdateScreen(coffeeData: CoffeeData) {
        appNavigator.openScreenWithoutSave(EditScreen(coffeeData))
    }

}