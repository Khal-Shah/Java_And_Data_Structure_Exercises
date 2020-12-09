package ch11exercises.ch11_05_course;


import java.util.ArrayList;

/** Chapter 11 - Exercise 5:
 *  (The Course class) Rewrite the Course class in Listing 10.6. Use an ArrayList to replace an array
 *  to store students. Draw the new UML diagram for the class. You should not change the original contract
 *  of the Course class (i.e., the definition of the constructors and methods should not be changed,
 *  but the private members may be changed.)
 *
 * @@author Khaled Shah
 */

public class Course
{
    private String courseName;
    private ArrayList<String> students;
    private int numberOfStudents;

    public Course(String courseName)
    {
        this.courseName = courseName;
        students = new ArrayList<>();
    }

    public String getCourseName()
    {
        return courseName;
    }


    public int getNumberOfStudents()
    {
       return this.numberOfStudents = this.students.size();
    }

    public void addStudent(String student)
    {
        students.add(student);
        this.numberOfStudents = students.size();
    }

    public void dropStudent(String student)
    {
//        int index = students.indexOf(student);
//        students.remove(index);
        this.students.remove(student);
        this.numberOfStudents = students.size();
    }

    public ArrayList<String> getStudents()
    {
        return this.students;
    }

    @Override
    public String toString()
    {
        return "Course{" +
               "courseName='" + courseName + '\'' +
               ", students=" + students +
               ", numberOfStudents=" + numberOfStudents +
               '}';
    }
}
