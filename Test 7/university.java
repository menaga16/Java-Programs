/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package placement_training;

import java.util.Scanner;

/**
 *
 * @author menaga
 */
public class university {
    
 public static void main(String[] args) 
 {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter student name:");
        String studentName=scanner.nextLine();

        System.out.println("Enter student age:");
        int studentAge=scanner.nextInt();

        System.out.println("Enter student ID:");
        int studentId=scanner.nextInt();

        Student student=new Student(studentName, studentAge, studentId);
        scanner.nextLine();

        System.out.println("Enter course name:");
        String courseName=scanner.nextLine();

        Course course=new Course(courseName);

        course.enrollStudent(student);

        scanner.close();
    }
}

class Person 
{
    private String name;
    private int age;

    public Person(String name, int age) 
    {
        this.name=name;
        this.age=age;
    }

    public String getName() 
    {
        return name;
    }

    public int getAge() 
    {
        return age;
    }
}

class Student extends Person 
{
    private int studentId;

    public Student(String name,int age,int studentId) 
    {
        super(name,age);
        this.studentId=studentId;
    }

    public int getStudentId() 
    {
        return studentId;
    }

    public boolean hasCompletedCourse(Course course) 
    {
          return false;
    }

    public void enrollCourse(Course course) 
    {
       
        System.out.println(getName()+" enrolled in course: "+course.getCourseName());
    }
}

class Professor extends Person 
{
    private int employeeId;

    public Professor(String name,int age,int employeeId) 
    {
        super(name,age);
        this.employeeId=employeeId;
    }

    public int getEmployeeId() 
    {
        return employeeId;
    }
}

class Course 
{
    private String courseName;
    private Course[] prerequisites;
    private Student[] enrolledStudents;
    private int enrolledCount;

    public Course(String courseName) 
    {
        this.courseName=courseName;
        prerequisites=new Course[3]; 
        enrolledStudents=new Student[10]; 
        enrolledCount=0;
    }

    public String getCourseName() 
    {
        return courseName;
    }

    public Course[] getPrerequisites() 
    {
        return prerequisites;
    }

    public void addPrerequisite(Course prerequisite) 
    {
        for (int i=0;i<prerequisites.length;i++) 
        {
            if (prerequisites[i]==null) 
            {
                prerequisites[i]=prerequisite;
                break;
            }
        }
    }

    public void enrollStudent(Student student) 
    {
        boolean canEnroll=true;
        for (Course prereq:prerequisites) 
        {
            if (prereq!=null&&!student.hasCompletedCourse(prereq)) 
            {
                canEnroll=false;
                break;
            }
        }
        if (canEnroll) 
        {
            if (enrolledCount<enrolledStudents.length) 
            {
                enrolledStudents[enrolledCount]=student;
                enrolledCount++;
                student.enrollCourse(this);
            }
            else 
            {
                System.out.println("Course capacity reached. Cannot enroll more students.");
            }
        } 
        else 
        {
            System.out.println(student.getName() + " cannot enroll in course: " + getCourseName() +" Missing prerequisites.");
        }
    }
}