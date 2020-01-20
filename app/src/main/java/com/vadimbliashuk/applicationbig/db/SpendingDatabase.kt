package com.vadimbliashuk.applicationbig.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.vadimbliashuk.applicationbig.model.SpendingEntity

@Database(entities = [SpendingEntity::class], version = 1, exportSchema = false)
abstract class SpendingDatabase : RoomDatabase() {
    abstract fun spendingDao(): SpendingDao

    companion object {
        @Volatile
        private var INSTANCE: SpendingDatabase? = null

        fun getInstance(context: Context): SpendingDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }

            synchronized(SpendingDatabase::class) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    SpendingDatabase::class.java,
                    "spending_database"
                ).build()

                INSTANCE = instance
                return instance
            }
        }
    }
}
