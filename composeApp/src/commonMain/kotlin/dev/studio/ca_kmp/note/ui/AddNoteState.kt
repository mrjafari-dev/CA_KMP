package dev.studio.ca_kmp.note.ui

import dev.studio.ca_kmp.note.domain.NoteModel

data class AddNoteState(
    val noteModel: NoteModel=NoteModel.empty,
    val isSuccess: Boolean=false,
    val isLoading: Boolean= false,
    val isFailure: Boolean = false
)
