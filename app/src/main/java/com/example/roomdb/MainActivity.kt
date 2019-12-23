package com.example.roomdb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.room.Room

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var db = Room.databaseBuilder(applicationContext, AppDB::class.java, "EmployeeDB").build()

        Thread{
            var emp = Emp_Entity()
            emp.emp_id = 2
            emp.emp_name = "Saiful Islam Sajon"
            emp.emp_post = "Android Developer"

            db.empDao().saveEmp(emp)

            db.empDao().readEmp().forEach{
                Log.i("@AKTDEV", "------ID is "+it.emp_id)
                Log.i("@AKTDEV", "------ID name is "+it.emp_name)
                Log.i("@AKTDEV", "------Your post is "+it.emp_post)
            }
        }.start()
    }
}
