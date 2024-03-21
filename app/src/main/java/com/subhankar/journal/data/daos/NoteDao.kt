package com.subhankar.journal.data.daos

import androidx.room.*
import com.subhankar.journal.data.models.NoteModel
import kotlinx.coroutines.flow.Flow

//DAOs are interfaces that define methods for accessing and manipulating data in your database
@Dao
interface NoteDao {
    @Query("SELECT * FROM noteModel ORDER BY id ASC")
    fun getAllNotes(): Flow<List<NoteModel>>

    @Query("SELECT * FROM noteModel WHERE id = :noteId")
    fun getNoteById(noteId: Int): Flow<NoteModel>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNote(noteModel: NoteModel)

    @Update
    suspend fun updateNote(noteModel: NoteModel)

    @Delete
    suspend fun deleteNote(noteModel: NoteModel)
}