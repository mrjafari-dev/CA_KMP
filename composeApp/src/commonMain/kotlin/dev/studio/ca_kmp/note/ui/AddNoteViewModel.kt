package dev.studio.ca_kmp.note.ui

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dev.studio.ca_kmp.note.domain.NoteRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch


class AddNoteViewModel(private val repository: NoteRepository) : ViewModel() {
    private val _state = MutableStateFlow(AddNoteState())
    val state = _state.asStateFlow()
    fun onEvent(event: AddNoteEvent) {
        when (event) {
            is AddNoteEvent.AddNote -> addNote(event)
        }
    }

    fun addNote(event: AddNoteEvent.AddNote) {
        if (_state.value.isLoading) return
        _state.update {
            it.copy(isLoading = true)
        }
        viewModelScope.launch {
            repository.insert(event.note)
                .onSuccess {
                    _state.update {
                        it.copy(isLoading = false, isSuccess = true)
                    }
                }
                .onFailure {
                    _state.update {
                        it.copy(isLoading = false, isFailure = true)
                    }
                }

        }
    }
}