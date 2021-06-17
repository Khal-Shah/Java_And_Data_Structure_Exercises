package ch13exercises.ex13_course_cloneable;
import java.util.ArrayList;

/**
 * (Enable the Course class cloneable) Rewrite the Course class in Listing 10.6
 * to add a clone method to perform a deep copy on the students field.
 *
 * @author Khaled
 */

public class Course implements Cloneable
{
    private String courseName;
    protected ArrayList<String> students;
    private int numberOfStudents;

    public Course(String courseName)
    {
        this.courseName = courseName;
        students = new ArrayList<>();
    }

    @Override
    public Object clone() throws CloneNotSupportedException
    {
        Course clonedCourse = (Course) super.clone();

        //deep copy students reference
        clonedCourse.students = (ArrayList<String>) students.clone();
        return clonedCourse;
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
