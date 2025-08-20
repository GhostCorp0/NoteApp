package com.ghostcorp.notesapp.feature_note.domain.model

import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.graphics.Color.Companion.Magenta
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.graphics.Color.Companion.Yellow
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Note(
    val title:String,
    val content:String,
    val timeStamp:Long,
    val color:Int,
    @PrimaryKey
    val id:Int? = null
) {
    companion object {
        val noteColors = listOf(Red, Green, Yellow, Blue, Magenta)
    }
}

class InvalidNoteException(message:String) : Exception(message)