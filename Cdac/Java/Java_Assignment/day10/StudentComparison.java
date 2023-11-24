package day10;

import java.util.Objects;

class Student
{
private int rollno; 
private String name;

Student (int rollno, String name)
{
this.rollno = rollno;
this.name = name;
}

boolean equals(Student s)
{
return this.rollno ==s.rollno && this.name.equals(s.name);
}
}

class StudentComparison
{
    public  static void main(String[] args)
    {
        Student s1 = new Student (29, "Nisha");
        Student s2= new Student(29, "Nisha");
        if (s1.equals(s2))
        {
            System.out.println("equal.");
        }
        else
        {
            System.out.println(" not equal.");
        }
    }
}


 