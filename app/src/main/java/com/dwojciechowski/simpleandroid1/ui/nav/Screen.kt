package com.dwojciechowski.simpleandroid1.ui.nav

sealed class Screen(val route: String) {
    object MainScreen : Screen("main_screen")
    object Details : Screen("details_screen")

    fun withArgs(vararg args: String): String {
        return buildString {
            append(route)
            args.forEach { arg ->
                append("/$arg")
            }
        }
    }
}
