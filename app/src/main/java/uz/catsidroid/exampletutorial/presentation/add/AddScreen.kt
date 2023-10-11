package uz.catsidroid.exampletutorial.presentation.add

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.androidx.AndroidScreen
import cafe.adriel.voyager.hilt.getViewModel
import uz.catsidroid.exampletutorial.navigation.NavigationDispatcher
import uz.catsidroid.exampletutorial.ui.theme.ExampleTutorialTheme

class AddScreen : AndroidScreen() {
    @Composable
    override fun Content() {
        val viewModel: AddContract.AddViewModel = getViewModel<AddViewModelImpl>()


        ExampleTutorialTheme {
            MainContent(
                viewModel::onEventDispatcher
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun MainContent(
    onEvDispatcher: (AddContract.Intent) -> Unit
) {
    Box(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.align(Alignment.TopCenter)) {
            var name by remember {
                mutableStateOf("")
            }

            var description by remember {
                mutableStateOf("")
            }

            TextField(placeholder = { Text("Input Name") },
                modifier = Modifier.fillMaxWidth(),
                value = name,
                onValueChange = {
                    name = it
                })

            TextField(placeholder = { Text("Input Description") },
                modifier = Modifier.fillMaxWidth(),
                value = description,
                onValueChange = {
                    description = it
                })

            Box(modifier = Modifier.fillMaxSize()) {
                Button(modifier = Modifier.align(Alignment.BottomCenter),
                    onClick = { onEvDispatcher.invoke(AddContract.Intent.ClickSave(name, description)) }) {
                    Text(text = "Save")
                }
            }

        }

    }

}