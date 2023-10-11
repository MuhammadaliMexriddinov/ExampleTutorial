package uz.catsidroid.exampletutorial.presentation.main

import kotlinx.coroutines.flow.StateFlow
import uz.catsidroid.exampletutorial.data.model.CoffeeData

interface MainContract {
    interface MainViewModel {
        val uiState: StateFlow<UIState>
        fun onEventDispatcher(intent: Intent)
    }

    data class UIState(
        val coffeeState: List<CoffeeData> = emptyList()
    )

    interface Intent {
        object ClickAdd:Intent
        data class ClickEdit(val coffeeData:CoffeeData):Intent
        data class ClickDelete(val coffeeData:CoffeeData):Intent
    }
}