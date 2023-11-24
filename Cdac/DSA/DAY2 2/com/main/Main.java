package com.main;
import com.student.StudentMarksList;

public class Main {
    public static void main(String[] args) {
        StudentMarksList studentList = new StudentMarksList();

        // Insert students with marks
        studentList.insert(70);
        studentList.insert(60);
        studentList.insert(80);
        studentList.insert(90);
        studentList.insert(75);

        // Display all marks
        studentList.displayMarks();

        // Delete students by mark
        studentList.delete(60);
        studentList.delete(90);
        studentList.delete(90);

        // Display all marks after deletion
        studentList.displayMarks();
    }
}