package com.ghostcorp.notesapp.feature_note.domain.use_case

data class NoteUseCases(
    val getNotes : GetNotesUseCase,
    val deleteNote : DeleteNoteUserCase,
    val addNote : AddNoteUseCase,
    val getNote : GetNoteUseCase
)