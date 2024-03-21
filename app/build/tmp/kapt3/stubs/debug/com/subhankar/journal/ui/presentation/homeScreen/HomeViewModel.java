package com.subhankar.journal.ui.presentation.homeScreen;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\tJ\u0006\u0010\u0014\u001a\u00020\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R7\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0015"}, d2 = {"Lcom/subhankar/journal/ui/presentation/homeScreen/HomeViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "noteRepo", "Lcom/subhankar/journal/domain/NoteRepository;", "<set-?>", "", "Lcom/subhankar/journal/data/models/NoteModel;", "notesModel", "getNotesModel", "()Ljava/util/List;", "setNotesModel", "(Ljava/util/List;)V", "notesModel$delegate", "Landroidx/compose/runtime/MutableState;", "deleteNote", "", "noteModel", "getAllNotes", "app_debug"})
public final class HomeViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.subhankar.journal.domain.NoteRepository noteRepo = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState notesModel$delegate = null;
    
    public HomeViewModel(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.subhankar.journal.data.models.NoteModel> getNotesModel() {
        return null;
    }
    
    public final void setNotesModel(@org.jetbrains.annotations.NotNull
    java.util.List<com.subhankar.journal.data.models.NoteModel> p0) {
    }
    
    public final void getAllNotes() {
    }
    
    public final void deleteNote(@org.jetbrains.annotations.NotNull
    com.subhankar.journal.data.models.NoteModel noteModel) {
    }
}