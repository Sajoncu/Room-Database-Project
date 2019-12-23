package com.example.roomdb

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface Emp_Dao {

    @Insert
    fun saveEmp(emp: Emp_Entity)

    @Query("SELECT * FROM Emp_Entity")
    fun readEmp():List<Emp_Entity>
}