package com.mysus.alarm_app.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Alarm (
    @PrimaryKey(autoGenerate = true)
    val id : Int,
    val time : String,
    val date : String,
    val note : String,

    val type : Int
)