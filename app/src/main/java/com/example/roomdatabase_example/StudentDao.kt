package com.example.roomdatabase_example

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface StudentDao {
    @Query("select * from student")
     fun getAllStudent():LiveData<List<Student>>
    @Insert
     fun insertStudent(student: Student)

    @Update
    fun updateStudent(student: Student)

    @Delete
     fun deleteStudent(student: Student)
}