package uz.catsidroid.exampletutorial.presentation.add

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import uz.catsidroid.exampletutorial.data.model.CoffeeData
import uz.catsidroid.exampletutorial.domain.CoffeeRepository
import uz.catsidroid.exampletutorial.presentation.main.MainContract
import javax.inject.Inject


@HiltViewModel
class AddViewModelImpl  @Inject constructor(
    private  val direction :AddDirection,
    private  val appRepository:  CoffeeRepository
):AddContract.AddViewModel , ViewModel() {
    override fun onEventDispatcher(intent: AddContract.Intent) {
        when(intent){
            is AddContract.Intent.ClickSave -> {
                viewModelScope.launch {
                    appRepository.addCoffee(CoffeeData(0,intent.name , intent.description))
                    direction.back()
                }
            }
        }
    }
}