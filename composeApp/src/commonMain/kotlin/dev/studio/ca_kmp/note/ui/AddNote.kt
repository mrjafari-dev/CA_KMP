package dev.studio.ca_kmp.note.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import dev.studio.ca_kmp.note.domain.NoteModel

object AddNoteScreen : Screen {
    @Composable
    override fun Content() {
        Scaffold(
            modifier =
            Modifier.fillMaxSize()
                .safeDrawingPadding()
        ) {
           // AddNoteScreenContent()
            Column {
                Text("Sfdf")
            }
        }
    }
}


@Composable
private fun AddNoteScreenContent(state: AddNoteState, onEvent: (AddNoteEvent) -> Unit) {
    var title by remember {
        mutableStateOf("")
    }
    var description by remember {
        mutableStateOf("")
    }

    Column(
        modifier =
        Modifier.fillMaxSize()
            .padding(20.dp)
    ) {
        TextField(value = title, onValueChange = {
            title = it
        }, label = {
            Text("Title")
        },
            modifier = Modifier.fillMaxWidth()
        )

        TextField(value = description, onValueChange = {
            description = it
        }, label = {
            Text("Title")
        },
            modifier = Modifier.fillMaxWidth()
        )
        if (state.isLoading)
            CircularProgressIndicator()
        else
            Button(
                onClick = {
                    val note = NoteModel(
                        id = 0,
                        title = "",
                        content = ""
                    )
                    onEvent(AddNoteEvent.AddNote(note = note))
            }) {
                Text("Create")
            }
    }
}