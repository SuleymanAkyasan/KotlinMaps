package com.suleyman.kotlinmaps.roomdb

import androidx.room.Database
import androidx.room.RoomDatabase
import com.suleyman.kotlinmaps.model.Place


@Database(entities = [Place::class], version = 1)
abstract class PlaceDatabase : RoomDatabase(){
    abstract fun placeDao(): PlaceDao
}