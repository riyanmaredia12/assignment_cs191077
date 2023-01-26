package com.example.student.model.datamodel

import android.media.Image
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Record")
data class Record(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "name") val  image:Int,
    @ColumnInfo(name = "name") val name:String,

    @ColumnInfo(name = "description") val desc: String) {

}
