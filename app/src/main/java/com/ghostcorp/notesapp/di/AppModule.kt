package com.ghostcorp.notesapp.di

import android.app.Application
import androidx.room.Room
import com.ghostcorp.notesapp.feature_note.data.data_source.NoteDatabase
import com.ghostcorp.notesapp.feature_note.data.repository.NoteRepositoryImpl
import com.ghostcorp.notesapp.feature_note.domain.repository.NoteRepository
import com.ghostcorp.notesapp.feature_note.domain.use_case.AddNoteUseCase
import com.ghostcorp.notesapp.feature_note.domain.use_case.DeleteNoteUserCase
import com.ghostcorp.notesapp.feature_note.domain.use_case.GetNoteUseCase
import com.ghostcorp.notesapp.feature_note.domain.use_case.GetNotesUseCase
import com.ghostcorp.notesapp.feature_note.domain.use_case.NoteUseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import org.apache.commons.collections4.Get
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun providesNoteDatabase(app: Application): NoteDatabase {
        return Room.databaseBuilder(
            app,
            NoteDatabase::class.java,
            NoteDatabase.DATABASE_NAME,
        ).build()
    }

    @Provides
    @Singleton
    fun provideNoteRepository(db: NoteDatabase): NoteRepository {
        return NoteRepositoryImpl(db.noteDao)
    }

    @Provides
    @Singleton
    fun provideNoteUseCases(repository: NoteRepository) : NoteUseCases{
        return NoteUseCases(
            getNotes = GetNotesUseCase(repository),
            deleteNote = DeleteNoteUserCase(repository),
            addNote = AddNoteUseCase(repository),
            getNote = GetNoteUseCase(repository)
        )
    }

}