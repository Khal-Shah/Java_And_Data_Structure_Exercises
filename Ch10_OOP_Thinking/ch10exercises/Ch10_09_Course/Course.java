package ch10exercises.Ch10_09_Course;

public class Course
{
    private String courseName;

    private int numberOfStudents;    //will need this for the array^
    private String[] students = new String[numberOfStudents];

    public Course(int numberOfStudents)
    {
        this.numberOfStudents = numberOfStudents;
        students = new String[numberOfStudents];
    }

    public Course(String courseName)
    {
        this.courseName = courseName;
    }

    public String getCourseName()
    {
        return courseName;
    }

    public void addStudent(String student)
    {
        if (numberOfStudents == students.length)
        {
            String[] moreStudents = new String[students.length + 1];        //increasing capacity by 1 each time

            for (int i = 0; i < numberOfStudents; i++)
            {
                moreStudents[i] = students[i];
            }
            students = moreStudents;
        }
        students[numberOfStudents] = student;
        numberOfStudents++;

    }

    public String[] getStudents()
    {
        return students;
    }

    public int getNumberOfStudents()
    {
        return numberOfStudents;
    }

    public void dropStudent(String student)
    {
        //so first the student name in parameter must match one of the student names already in the array list and return
        //the index position so we can drop that name.
        int position = studentPosition(student);

        if (position >= 0)
        {
            removeStudent(position);
        }

        else
        {
            System.out.println(((numberOfStudents > 0) ? "This student isn't enrolled in the class." : ""));
        }

    }

    public int studentPosition(String student)
    {
        int index;

        for (int i = 0; i < students.length; i++)
        {
            if (students[i].equalsIgnoreCase(student))                //Can't use == since we're dealing with Strings
            {
                return i;
            }
        }
        return -1;
    }

    public void removeStudent(int position)
    {
        String[] lessStudents = new String[students.length - 1];

        for (int i = 0; i < students.length; i++)
        {
            if (i == position)
            {
                continue;
            }
            lessStudents[i] = students[i];
        }
        this.students = lessStudents;
        numberOfStudents--;
    }

    public void clear()
    {
        students = new String[0];
        numberOfStudents = 0;
    }

    public String toString()
    {
        String names = "";

        if (numberOfStudents == 0)
        {
            return "There are no students enrolled.";
        }

        else
        {
            for (int i = 0; i < students.length; i++)
            {
                names += students[i] + "\n";
            }
            return names;
        }
    }


}
