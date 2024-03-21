package com.subhankar.journal.ui.presentation.updateNoteScreen;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0016R+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/subhankar/journal/ui/presentation/updateNoteScreen/UpdateNoteViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "<set-?>", "Lcom/subhankar/journal/data/models/NoteModel;", "noteModel", "getNoteModel", "()Lcom/subhankar/journal/data/models/NoteModel;", "setNoteModel", "(Lcom/subhankar/journal/data/models/NoteModel;)V", "noteModel$delegate", "Landroidx/compose/runtime/MutableState;", "noteRepo", "Lcom/subhankar/journal/domain/NoteRepository;", "getNoteById", "", "noteId", "", "updateNote", "note", "", "updateNotes", "updateTitle", "title", "app_debug"})
public final class UpdateNoteViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.subhankar.journal.domain.NoteRepository noteRepo = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState noteModel$delegate = null;
    
    public UpdateNoteViewModel(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.subhankar.journal.data.models.NoteModel getNoteModel() {
        return null;
    }
    
    public final void setNoteModel(@org.jetbrains.annotations.NotNull
    com.subhankar.journal.data.models.NoteModel p0) {
    }
    
    public final void getNoteById(int noteId) {
    }
    
    public final void updateNotes(@org.jetbrains.annotations.NotNull
    com.subhankar.journal.data.models.NoteModel noteModel) {
    }
    
    public final void updateTitle(@org.jetbrains.annotations.NotNull
    java.lang.String title) {
    }
    
    public final void updateNote(@org.jetbrains.annotations.NotNull
    java.lang.String note) {
    }
}