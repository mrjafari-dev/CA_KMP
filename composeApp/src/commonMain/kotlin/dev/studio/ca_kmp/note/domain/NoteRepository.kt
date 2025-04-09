package dev.studio.ca_kmp.note.domain

interface NoteRepository {
    suspend fun insert(noteModel: NoteModel): Result<NoteModel>

    suspend fun update(noteModel: NoteModel): Result<NoteModel>

    suspend fun getById(id: Int): Result<NoteModel>

    suspend fun getAllNotes(): Result<List<NoteModel>>

    suspend fun delete(noteModel: NoteModel): Result<Unit>


}