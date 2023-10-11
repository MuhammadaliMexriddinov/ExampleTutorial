package uz.catsidroid.exampletutorial.presentation.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import uz.catsidroid.exampletutorial.domain.CoffeeRepository
import uz.catsidroid.exampletutorial.domain.impl.CoffeeRepositoryImpl
import uz.catsidroid.exampletutorial.navigation.AppNavigator
import javax.inject.Inject


@HiltViewModel
class MainViewModelImpl @Inject constructor(
    private val direction: MainDirection,
    private val repository: CoffeeRepository
) : ViewModel(), MainContract.MainViewModel {
    override val uiState = MutableStateFlow(MainContract.UIState())

    init {
        repository.getAllCoffee().onEach { data ->
            uiState.tryEmit(MainContract.UIState(data))
        }.launchIn(viewModelScope)
    }

    override fun onEventDispatcher(intent: MainContract.Intent) {
        when (intent) {
            MainContract.Intent.ClickAdd -> {
                viewModelScope.launch {
                    direction.openAddScreen()
                }
            }

            is MainContract.Intent.ClickEdit -> {
                viewModelScope.launch {
                    direction.openUpdateScreen(intent.coffeeData)
                }
            }

            is MainContract.Intent.ClickDelete -> {
                viewModelScope.launch {
                    repository.deleteCoffee(intent.coffeeData)
                }
            }
        }
    }
}