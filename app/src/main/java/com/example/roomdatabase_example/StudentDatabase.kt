package com.example.roomdatabase_example

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Student::class], version = 2)
abstract class StudentDatabase :RoomDatabase (){

    abstract fun studentDao():StudentDao
}