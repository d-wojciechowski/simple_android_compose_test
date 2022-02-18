package com.dwojciechowski.simpleandroid1.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.dwojciechowski.simpleandroid1.data.ListDataProvider
import com.dwojciechowski.simpleandroid1.ui.theme.SimpleAndroid1Theme

@Composable
fun MainActivityScreen(navController: NavController) {
    SimpleAndroid1Theme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            ItemView(items = ListDataProvider.getData(), navController)

            Column(
                horizontalAlignment = Alignment.End,
                verticalArrangement = Arrangement.Bottom,
                modifier = Modifier.padding(10.dp)
            ) {
                AddButton {}
            }
        }
    }
}