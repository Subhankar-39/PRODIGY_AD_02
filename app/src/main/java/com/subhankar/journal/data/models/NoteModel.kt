package com.subhankar.journal.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey

//It simply just create oom database
@Entity(tableName = "noteModel")
data class NoteModel (
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    var title:String,
    var notes:String
)