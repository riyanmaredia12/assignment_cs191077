package com.example.student.model.database

import androidx.core.view.WindowInsetsCompat.Type.InsetsType
import androidx.room.*
import com.example.student.model.datamodel.Record

@Dao
interface RecordDao {

        @Query("SELECT * FROM Record")
        fun getAll(): List<Record>

        @Insert
         suspend fun insertRecord(user: Record)

        @Update
        suspend fun updateRecord(user: Record)

        @Delete
        fun delete(user: Record)
    }
