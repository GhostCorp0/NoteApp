package com.ghostcorp.notesapp.feature_note.domain.use_case

import com.ghostcorp.notesapp.feature_note.domain.model.Note
import com.ghostcorp.notesapp.feature_note.domain.repository.NoteRepository

class DeleteNoteUserCase(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }

}