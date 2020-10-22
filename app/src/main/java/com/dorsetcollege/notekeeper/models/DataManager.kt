package com.dorsetcollege.notekeeper.models

// this does not need a primary constructor
class DataManager {

    val courses = HashMap<String, CourseInfo>()

    val notes = ArrayList<NoteInfo>()

    // Initializer block
    // Similiar to a constructor in Java - it gets called after the class is creatd
    // They do not accept parameters but can access properties
    init {

        initializeCourses()
    }

    private fun initializeCourses() {

        var course = CourseInfo("Kotlin", "Integers")

        courses.set(course.courseId, course)

        // Alternative method: Using named parameters

        course = CourseInfo(courseId="Android", title= "Intents")

        courses.set(course.courseId, course);

        // Alternative method: using named parameters but in a different order

        course = CourseInfo(title="Java", courseId="Classes")
        courses.set(course.courseId, course);

        course = CourseInfo("C#", "Collections")

        courses.set(course.courseId, course);



    }

}

