package com.example.databindingdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databindingdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val student = Student("W123", "Ales")

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.myData = student

        //binding.tvStudentID.text = student.studentId
        //binding.tvName.text = student.name

        binding.btnUpdate.setOnClickListener(){
            student.name = "John"
            //binding.tvName.text = student.name

            binding.apply{
                invalidateAll()
            }
        }
    }
}