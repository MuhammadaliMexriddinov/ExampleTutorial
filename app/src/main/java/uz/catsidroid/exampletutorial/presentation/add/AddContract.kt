package uz.catsidroid.exampletutorial.presentation.add

import uz.catsidroid.exampletutorial.presentation.main.MainContract

interface AddContract {
    interface AddViewModel{
        fun onEventDispatcher(intent:Intent)
    }

    interface  Intent{
        data class ClickSave(
            val name : String,
            val description:String
        ):Intent
    }
}