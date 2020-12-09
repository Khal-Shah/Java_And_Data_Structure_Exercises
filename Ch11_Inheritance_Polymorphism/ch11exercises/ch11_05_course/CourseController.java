package ch11exercises.ch11_05_course;

public class CourseController
{
    public static void main(String[] args)
    {
        Course soen490 = new Course("Capstone");
        soen490.addStudent("Khaled Shah");
        soen490.addStudent("Paul M");
        soen490.addStudent("Jeff B");

        System.out.println(soen490.toString());

        soen490.dropStudent("Jeff B");

        System.out.println(soen490.toString());
        System.out.println("Students enrolled are " + soen490.getStudents());
    }
}
