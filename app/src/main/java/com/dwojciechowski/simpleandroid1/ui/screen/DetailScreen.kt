package com.dwojciechowski.simpleandroid1.ui.screen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.dwojciechowski.simpleandroid1.data.ListDataProvider
import com.dwojciechowski.simpleandroid1.ui.theme.SimpleAndroid1Theme

@Composable
fun DetailsScreen(id: Long) {
    SimpleAndroid1Theme {
        // A surface container using the 'background' color from the theme
        val logo = ListDataProvider.getData(id)
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            DisplayRow(logo.first, logo.second) {}
        }
    }
}

@Composable
@Preview
fun Preview() {
    DetailsScreen(id = 100)
}