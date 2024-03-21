package com.subhankar.journal.ui.presentation.addNoteScreen

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.subhankar.journal.data.models.NoteModel
import com.subhankar.journal.domain.NoteRepository
import kotlinx.coroutines.launch

class AddNoteViewModel(application: Application) : AndroidViewModel(application) {
    private val noteRepo = NoteRepository(application)

    fun insertNote(noteModel: NoteModel) {
        viewModelScope.launch {
            noteRepo.insertNoteToRoom(noteModel)
        }
    }
}