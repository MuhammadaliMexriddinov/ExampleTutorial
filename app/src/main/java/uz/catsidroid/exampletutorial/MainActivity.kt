package uz.catsidroid.exampletutorial

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.lifecycleScope
import cafe.adriel.voyager.navigator.CurrentScreen
import cafe.adriel.voyager.navigator.Navigator
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import uz.catsidroid.exampletutorial.navigation.NavigationHandler
import uz.catsidroid.exampletutorial.presentation.main.MainScreen
import uz.catsidroid.exampletutorial.ui.theme.ExampleTutorialTheme
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject lateinit var navigationHandler: NavigationHandler

    @SuppressLint("FlowOperatorInvokedInComposition", "CoroutineCreationDuringComposition")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ExampleTutorialTheme {
                Navigator(
                    screen = MainScreen()
                ) { navigator ->
                    navigationHandler.uiNavigator
                        .onEach { it.invoke(navigator) }
                        .launchIn(lifecycleScope)
                    CurrentScreen()
                }
            }
        }
    }
}

