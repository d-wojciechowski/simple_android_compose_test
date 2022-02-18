package com.dwojciechowski.simpleandroid1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.dwojciechowski.simpleandroid1.data.ListDataProvider
import com.dwojciechowski.simpleandroid1.ui.nav.Navigation
import com.dwojciechowski.simpleandroid1.ui.screen.AddButton
import com.dwojciechowski.simpleandroid1.ui.screen.ItemView
import com.dwojciechowski.simpleandroid1.ui.theme.SimpleAndroid1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Navigation()
        }
    }
}


//@Preview(showBackground = true)
@Composable
fun RowPreview() {
    val navController = rememberNavController()
    SimpleAndroid1Theme {
        ItemView(items = ListDataProvider.getData().subList(0, 10), navController = navController)
    }
}

@Preview(showBackground = true)
@Composable
fun ButtonPreview() {
    SimpleAndroid1Theme {
        AddButton {

        }
    }
}



