package com.dwojciechowski.simpleandroid1.ui.screen

import android.util.Pair
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.dwojciechowski.simpleandroid1.ui.nav.Screen
import com.dwojciechowski.simpleandroid1.ui.theme.MainAppTheme

@Composable
fun ItemView(items: List<Pair<String, String>>, navController: NavController) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 10.dp, end = 10.dp)
    ) {
        items(items) { item ->
            DisplayRow(item.first, item.second) {
                navController.navigate(Screen.Details.withArgs("${item.first}L"))
            }
            Spacer(Modifier.size(5.dp))
        }
    }
}

@Preview
@Composable
fun ItemViewPreview() {

    val listOf = listOf(
        Pair("AA", "AAAAAAAAAAAAAAAAAAA"),
        Pair("AA", "AAAAAAAAAAAAAAAAAAA"),
        Pair("AA", "AAAAAAAAAAAAAAAAAAA"),
        Pair("AA", "AAAAAAAAAAAAAAAAAAA"),
        Pair("AA", "AAAAAAAAAAAAAAAAAAA"),
    )
    val rememberNavController = rememberNavController()
    MainAppTheme(darkTheme = true) {
        Surface(color = MaterialTheme.colors.background) {
            ItemView(listOf, rememberNavController)
        }
    }
}


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun DisplayRow(logo: String = "NN", description: String = "Lorem Ipsum", onClick: () -> Unit) {

    Surface(
        shape = RoundedCornerShape(25),
        elevation = 10.dp,
        color = MaterialTheme.colors.background,
        onClick = onClick,
        modifier = Modifier.padding(top = 5.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth(1.0f)
                .padding(7.dp)
        ) {

            Text(
                textAlign = TextAlign.Center,
                text = logo,
                style = MaterialTheme.typography.h6,
                color = MaterialTheme.colors.background,
                modifier = Modifier
                    .background(color = MaterialTheme.colors.onBackground, CircleShape)
                    .size(40.dp)
                    .wrapContentHeight(align = Alignment.CenterVertically)
            )

            Spacer(modifier = Modifier.size(5.dp))

            Text(description)
        }
    }
}

@Preview
@Composable
fun DisplayRowPreview() {
    MainAppTheme {
        DisplayRow {

        }
    }
}

@Composable
fun AddButton(onClick: () -> Unit) {
    val size = 70.dp
    Button(
        onClick = { /*TODO*/ },
        modifier = Modifier.size(size),
        shape = CircleShape,
        contentPadding = PaddingValues(0.dp),
    ) {
        Icon(
            imageVector = Icons.Default.Add,
            contentDescription = "",
            modifier = Modifier.size(size.times(0.8f))
        )
    }
}