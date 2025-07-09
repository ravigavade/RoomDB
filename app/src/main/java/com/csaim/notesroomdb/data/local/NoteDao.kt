package com.csaim.notesroomdb.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow


@Dao
interface NoteDao {

    @Insert
    suspend fun instertNote(note: Note)

    @Delete
    suspend fun deleteNote(note: Note)

    @Query("SELECT * FROM notes")
    fun getAllNotes(): Flow<List<Note>>

}