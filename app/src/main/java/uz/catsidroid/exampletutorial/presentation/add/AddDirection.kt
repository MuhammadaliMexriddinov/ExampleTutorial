package uz.catsidroid.exampletutorial.presentation.add

import uz.catsidroid.exampletutorial.navigation.AppNavigator
import javax.inject.Inject
import javax.inject.Singleton

interface AddDirection {
    suspend fun  back()
}

@Singleton
class  AddDirectionImpl  @Inject constructor(private  val appNavigator: AppNavigator):AddDirection{
    override suspend fun back() {
        appNavigator.back()
    }

}