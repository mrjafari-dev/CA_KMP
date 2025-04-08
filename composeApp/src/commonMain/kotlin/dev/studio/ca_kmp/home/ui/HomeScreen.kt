package dev.studio.ca_kmp.home.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.core.screen.Screen

object HomeScreen : Screen {
    @Composable
    override fun Content() {

        Scaffold(
            topBar = {
                TopAppBar(
                    title = {
                        Text("Home Screen")
                    },
                    actions = {
                        IconButton(onClick = { }) {
                            Icon(
                                Icons.Rounded.Add,
                                contentDescription = "Add",
                            )
                        }
                    }
                )
            },
            modifier = Modifier.fillMaxSize()
                .safeDrawingPadding()
        ){

        }
    }
}