package uz.catsidroid.exampletutorial.presentation.main

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.view.KeyEventDispatcher
import cafe.adriel.voyager.androidx.AndroidScreen
import cafe.adriel.voyager.hilt.getViewModel
import uz.catsidroid.exampletutorial.ui.components.CoffeeItem
import uz.catsidroid.exampletutorial.ui.theme.ExampleTutorialTheme

class MainScreen : AndroidScreen() {
    @Composable
    override fun Content() {

        val viewModel: MainContract.MainViewModel = getViewModel<MainViewModelImpl>()
        ExampleTutorialTheme {
            MainContent(
                uiState = viewModel.uiState.collectAsState().value,
                onEventDispatcher = viewModel::onEventDispatcher
            )
        }
    }
}

@Composable
private fun MainContent(
    uiState: MainContract.UIState,
    onEventDispatcher: (MainContract.Intent) -> Unit
) {
    Box(modifier = Modifier.fillMaxSize()) {
        LazyColumn(content = {
            items(uiState.coffeeState.size) { it ->
                CoffeeItem(data = uiState.coffeeState[it], onClickEdit = {
                    onEventDispatcher.invoke(
                        MainContract.Intent.ClickEdit(it)
                    )
                }, onClickDelete = {
                    onEventDispatcher.invoke(MainContract.Intent.ClickDelete(it))
                })
            }

        }
        )

        FloatingActionButton(modifier = Modifier
            .align(Alignment.BottomEnd)
            .padding(0.dp, 0.dp, 30.dp, 30.dp),
            onClick = { onEventDispatcher.invoke(MainContract.Intent.ClickAdd) }) {
            Text(text = "Add")
        }
    }


}

@SuppressLint("UnrememberedMutableState")
@Composable
@Preview(showBackground = true)
private fun MainScreenPreview() {
    ExampleTutorialTheme {
        MainContent(mutableStateOf(MainContract.UIState()).value) {}
    }
}