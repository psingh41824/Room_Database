package com.example.roomdatabase_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.Room
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private lateinit var database: StudentDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        database= Room.databaseBuilder(applicationContext,StudentDatabase::class.java, "studentDB").build()

        GlobalScope.launch {
            database.studentDao().insertStudent(Student(0, name = "prakash singh","singhasrar@gmail.com"))
        }
    }
}