package com.student;

public class StudentMarksList {
    private Student head;

    public void insert(int mark) {
        Student newStudent = new Student(mark);
        if (head == null || mark < head.mark) {
            newStudent.next = head;
            head = newStudent;
        } else {
            Student current = head;
            while (current.next != null && mark > current.next.mark) {
                current = current.next;
            }
            newStudent.next = current.next;
            current.next = newStudent;
        }
    }

    public void displayMarks() {
        Student current = head;
        System.out.print("Student Marks (ascending order): ");
        while (current != null) {
            System.out.print(current.mark + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void delete(int mark) {
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }

        if (head.mark == mark) {
            head = head.next;
            System.out.println("Deleted student with mark " + mark);
            return;
        }

        Student current = head;
        while (current.next != null && current.next.mark != mark) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
            System.out.println("Deleted student with mark " + mark);
        } else {
            System.out.println("Student with mark " + mark + " not found.");
        }
    }
}
