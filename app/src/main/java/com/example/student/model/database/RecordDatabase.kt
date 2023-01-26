package com.example.student.model.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.student.model.datamodel.Record
@Database(entities = [Record::class], version = 1, exportSchema = true)
   abstract class RecordDatabase: RoomDatabase() {
    abstract fun recordDao(): RecordDao

    companion object {
        // Singleton prevents multiple instances of database opening at the
        // same time.
        @Volatile
        private var INSTANCE: RecordDatabase? = null
        fun getDatabase(context: Context): RecordDatabase {
            // if the INSTANCE is not null, then return it,
            // if it is, then create the database
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    RecordDatabase::class.java,
                    "Recorddatabase"
                ).build()
                INSTANCE = instance
                // return instance
                instance
            }
        }

    }
}