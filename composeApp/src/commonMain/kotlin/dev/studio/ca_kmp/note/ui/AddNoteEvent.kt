package dev.studio.ca_kmp.note.ui

import dev.studio.ca_kmp.note.domain.NoteModel

sealed interface AddNoteEvent {
    data class AddNote(val note:NoteModel):AddNoteEvent
 }