package com.dwojciechowski.simpleandroid1.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dwojciechowski.simpleandroid1.data.ListDataProvider
import com.dwojciechowski.simpleandroid1.model.Detailed
import com.dwojciechowski.simpleandroid1.model.Recipee
import com.dwojciechowski.simpleandroid1.ui.theme.MainAppTheme

@Composable
fun DetailsScreen(id: Long) {
    MainAppTheme {
        val logo = ListDataProvider.getData(id)
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            DetailsComponent(detailed = logo)
        }
    }
}

//@Composable
//@Preview
//fun Preview() {
//    DetailsScreen(id = 100)
//}

@Composable
@Preview
fun DetailsComponentPreview() {
    MainAppTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            val detailed = Recipee("Spagetti", listOf("step1: Test", "step2: Test"))
            DetailsComponent(detailed = detailed)
        }
    }
}

@Composable
fun DetailsComponent(detailed: Detailed) {

    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .fillMaxWidth(1.0f)
            .background(MaterialTheme.colors.background)
            .padding(10.dp)
    ) {

        Surface(
            shape = RoundedCornerShape(30),
            modifier = Modifier.padding(bottom = 10.dp),
            elevation = 5.dp,
        ) {
            Row(modifier = Modifier.fillMaxWidth()) {
                Icon(
                    imageVector = Icons.Default.Info,
                    contentDescription = "",
                    modifier = Modifier.size(50.dp)
                )

                Spacer(modifier = Modifier.size(5.dp))

                Text(
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.h4,
                    text = detailed.name,
                )
            }
        }

        Surface(
            shape = RoundedCornerShape(5),
            elevation = 5.dp,
        ) {
            Row(
                modifier = Modifier
                    .fillMaxSize(1f)
                    .padding(10.dp)
            ) {
                Text(text = detailed.details)
            }
        }

    }

}