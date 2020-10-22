package com.dorsetcollege.notekeeper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.dorsetcollege.notekeeper.models.CourseInfo
import com.dorsetcollege.notekeeper.models.DataManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //this is the code that determines what layout gets loaded
        // R is a generated class
        // Layout Names are contained in the R.layout
        // Kotlin generates synthetic properties, makes it easier than java
        // Property name has the same name as the View ID
        setContentView(R.layout.activity_main)

        val dm = DataManager()

        val adapterCourses = ArrayAdapter<CourseInfo>(this,
            android.R.layout.simple_spinner_item,
            dm.courses.values.toList()
        )

        adapterCourses.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)


        spinner3.adapter = adapterCourses
    }
}