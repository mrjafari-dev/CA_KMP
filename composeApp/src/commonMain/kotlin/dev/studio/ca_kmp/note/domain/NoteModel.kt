package dev.studio.ca_kmp.note.domain

data class NoteModel(
    val id:Int,
    val title:String,
    val content:String,
){
    companion object{
        val empty = NoteModel(0,"","")
    }
}