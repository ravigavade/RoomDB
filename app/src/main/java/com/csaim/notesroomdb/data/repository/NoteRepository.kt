package com.csaim.notesroomdb.data.repository

import com.csaim.notesroomdb.data.local.Note
import com.csaim.notesroomdb.data.local.NoteDao
import kotlinx.coroutines.flow.Flow

class NoteRepository(private val noteDao: NoteDao) {

    val allNotes: Flow<List<Note>> = noteDao.getAllNotes()

    suspend fun insertNote(note: Note){
        noteDao.instertNote(note)
    }

    suspend fun deleteNote(note: Note){
        noteDao.deleteNote(note)
    }

}