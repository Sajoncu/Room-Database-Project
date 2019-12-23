package com.example.roomdb

import android.os.Parcel
import android.os.Parcelable
import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [(Emp_Entity::class)], version = 1)
abstract class AppDB : RoomDatabase(){
    abstract fun empDao(): Emp_Dao
}