/*Create a student class with the following data members:- rollNo, Name,
Course, Mark, grade, result. Develop function members to
a. assign values for rollNo, name, course and mark.
b. Find out the grade for the student(if mark >90, then grade is A, if
mark is between 80 and 90, then grade is B, if mark is between 70
and 80, then grade is C, if mark is between 60 and 70, then grade
is D, otherwise, grade is F.
c. Find the result of the student. If mark>60, then the result is Pass,
otherwise Fail
d. Print out the details of the student*/


import java.util.Scanner;

public class Student
{
	private int rollno;
    	private String name;
    	private String course;
    	private int mark;

    public Student(String n, int r, int m1, 
    String c) 
    {
        name = n;
        rollno = r;
        course = c;
        mark = m1;
    }
    public void getValue() 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = in.nextLine();
        System.out.println("Enter rollno: ");
      	rollno = in.nextInt();
        System.out.println("Enter course: ");
        course = in.nextInt();
        System.out.println("Enter Marks: ");
        mark= in.nextInt();
    }

    public void findGrade()
    {
        if (mark >90)
            System.out.println("Grade:A");
        else if (90 < mark && mark >80)
           System.out.println("Grade:B"); 
        else if (80 < mark && mark >70)
           System.out.println("Grade:C");
        else if (70 < mark && mark >60)
           System.out.println("Grade:D");
        else  (60 < mark)
           System.out.println("Grade:E");
    }

    public void display() 
    {
        System.out.println("Name: " + name);
        System.out.println("RollNo: " + rollno);
        System.out.println("Course: " + course);
        System.out.println("Marks: " + marks);
        System.out.println("The Grade bof the  " );
        System.out.println("Maximum Marks: " + maximum);
        System.out.println("Average Marks: " + average);
    }

    public static void main(String args[]) 
    {
        Student obj = new Student();
        obj.getValue();
        obj.findGrade();
        obj.display();
    }
}

