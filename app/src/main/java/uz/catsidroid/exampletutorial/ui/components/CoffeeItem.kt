package uz.catsidroid.exampletutorial.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import uz.catsidroid.exampletutorial.R
import uz.catsidroid.exampletutorial.data.model.CoffeeData
import uz.catsidroid.exampletutorial.ui.theme.ExampleTutorialTheme


@Composable
fun CoffeeItem(
    data: CoffeeData,
    onClickEdit: (CoffeeData) -> Unit,
    onClickDelete: (CoffeeData) -> Unit
) {
    Row(
        modifier = Modifier
            .padding(10.dp)
            .background(color = Color(0xFF9B9A9A), shape = RoundedCornerShape(12.dp))
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(
            modifier = Modifier
                .weight(1f, true)
        ) {

            Text(
                text = data.name,
                style = MaterialTheme.typography.bodyLarge
            )

            Spacer(modifier = Modifier.size(4.dp))

            Text(text = data.description)
        }

        Spacer(modifier = Modifier.weight(1f))

        Image(
            modifier = Modifier
                .clickable { onClickEdit.invoke(data) },
            painter = painterResource(id = R.drawable.baseline_edit_24),
            contentDescription = "Edit"
        )

        Image(
            modifier = Modifier
                .clickable { onClickDelete.invoke(data) },
            painter = painterResource(id = R.drawable.baseline_delete_24),
            contentDescription = "Delete"
        )
    }
}

@Composable
@Preview(showBackground = true)
private fun MainContentPreview() {
    ExampleTutorialTheme {
        CoffeeItem(data = CoffeeData(0, "Name", "Description"), onClickEdit = { CoffeeData(0, "", "") }) {
            CoffeeData(
                0,
                "",
                ""
            )
        }
    }
}