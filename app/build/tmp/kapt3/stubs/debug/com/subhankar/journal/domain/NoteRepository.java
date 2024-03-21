package com.subhankar.journal.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000e0\rJ\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\r2\u0006\u0010\u0010\u001a\u00020\u0011J\u0019\u0010\u0012\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/subhankar/journal/domain/NoteRepository;", "", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "noteDao", "Lcom/subhankar/journal/data/daos/NoteDao;", "deleteNoteFromRoom", "", "noteModel", "Lcom/subhankar/journal/data/models/NoteModel;", "(Lcom/subhankar/journal/data/models/NoteModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllNotesFromRoom", "Lkotlinx/coroutines/flow/Flow;", "", "getNoteByIdFromRoom", "noteId", "", "insertNoteToRoom", "updateNoteInRoom", "app_debug"})
public final class NoteRepository {
    private com.subhankar.journal.data.daos.NoteDao noteDao;
    
    public NoteRepository(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.subhankar.journal.data.models.NoteModel>> getAllNotesFromRoom() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.subhankar.journal.data.models.NoteModel> getNoteByIdFromRoom(int noteId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object insertNoteToRoom(@org.jetbrains.annotations.NotNull
    com.subhankar.journal.data.models.NoteModel noteModel, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object updateNoteInRoom(@org.jetbrains.annotations.NotNull
    com.subhankar.journal.data.models.NoteModel noteModel, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object deleteNoteFromRoom(@org.jetbrains.annotations.NotNull
    com.subhankar.journal.data.models.NoteModel noteModel, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}