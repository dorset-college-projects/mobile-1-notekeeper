package com.dorsetcollege.notekeeper.models

// Val is for immutable properties (cannot be changed)

// Var is for mutable properties (can be changed)

// Kotlin does a lot of in the constructor

data class CourseInfo(val courseId: String, val title: String) {
    override fun toString(): String {
        return title;
    }
}

data class NoteInfo(var course: CourseInfo, var title: String, var text: String)