package ch13exercises.ex13_course_cloneable;

public class CloneableCourse_Driver
{
    public static void main(String[] args)
    {
        Course course1 = new Course("Capstone");
        course1.addStudent("KS");
        course1.addStudent("JC");
        course1.addStudent("RS");

        Course course2 = new Course("CapStone Cloned");
        try
        {
            course2 = (Course) course1.clone();
        }

        catch(CloneNotSupportedException e)
        {
            e.printStackTrace();
        }

        course2.dropStudent("JC");

        System.out.println(course1);
        System.out.println(course2);
    }
}
