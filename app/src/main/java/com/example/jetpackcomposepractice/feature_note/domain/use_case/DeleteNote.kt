package com.example.jetpackcomposepractice.feature_note.domain.use_case

import com.example.jetpackcomposepractice.feature_note.domain.model.Note
import com.example.jetpackcomposepractice.feature_note.domain.repository.NoteRepository

class DeleteNote(
    private val noteRepository: NoteRepository
) {
    suspend operator fun invoke(note:Note){
        noteRepository.deleteNote(note)
    }
}