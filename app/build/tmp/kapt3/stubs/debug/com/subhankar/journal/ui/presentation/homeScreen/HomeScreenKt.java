package com.subhankar.journal.ui.presentation.homeScreen;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aG\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0007\u001a;\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u001a3\u0010\u0010\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u001a\b\u0010\u0011\u001a\u00020\u0001H\u0007\u00a8\u0006\u0012"}, d2 = {"HomeScreen", "", "onFabClicked", "Lkotlin/Function0;", "navigateToUpdateNoteScreen", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "noteId", "navigateToAboutScreen", "NoteSwappable", "noteModel", "Lcom/subhankar/journal/data/models/NoteModel;", "viewModel", "Lcom/subhankar/journal/ui/presentation/homeScreen/HomeViewModel;", "NotesCard", "ShowNoNotes", "app_debug"})
public final class HomeScreenKt {
    
    @androidx.compose.runtime.Composable
    @kotlin.OptIn(markerClass = {androidx.compose.material.ExperimentalMaterialApi.class})
    public static final void HomeScreen(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onFabClicked, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> navigateToUpdateNoteScreen, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> navigateToAboutScreen) {
    }
    
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    public static final void NoteSwappable(@org.jetbrains.annotations.NotNull
    com.subhankar.journal.data.models.NoteModel noteModel, @org.jetbrains.annotations.NotNull
    com.subhankar.journal.ui.presentation.homeScreen.HomeViewModel viewModel, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> navigateToUpdateNoteScreen) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void ShowNoNotes() {
    }
    
    @androidx.compose.runtime.Composable
    public static final void NotesCard(@org.jetbrains.annotations.NotNull
    com.subhankar.journal.data.models.NoteModel noteModel, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> navigateToUpdateNoteScreen) {
    }
}