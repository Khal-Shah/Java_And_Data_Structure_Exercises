package ch10exercises;

/* Chapter 10 - Exercise 9:
 * (The Course class) Revise the Course class as follows:
■ The array size is fixed in Listing 10.6. Improve it to automatically increase the array size by creating a new larger array 
and copying the contents of the current array to it.							//like what the stack class does when size > capacity
■ Implement the dropStudent method.
■ Add a new method named clear() that removes all students from the
course.
Write a test program that creates a course, adds three students, removes one, and displays the students in the course.
 */
		//By Khaled Shah

public class Ch10_09_Revised_Course
{

	public static void main(String[] args)
	{
		Course comp249 = new Course ("JAVA II");
		comp249.addStudent("Khal");
		comp249.addStudent("Drogo");
		comp249.addStudent("Kelly");
		
		System.out.println("Currently there are " + comp249.getNumberOfStudents() + " students enrolled in " +
		comp249.getCourseName() +	". They are: \n" +	comp249.toString());
		
		comp249.dropStudent("Kelly");
		
		System.out.println("Currently there are " + comp249.getNumberOfStudents() + " students enrolled in " +
				comp249.getCourseName() +	". They are: \n" +	comp249.toString());
		comp249.dropStudent("Drogo");
		comp249.dropStudent("Kelly");					//already dropped so says not enrolled
		System.out.println("Currently there are " + comp249.getNumberOfStudents() + " students enrolled in " +
				comp249.getCourseName() +	". They are: \n" +	comp249.toString());
		
		comp249.dropStudent("Khal");
		System.out.println("Currently there are " + comp249.getNumberOfStudents() + " students enrolled in " + 
				comp249.getCourseName() +	". They are: \n" +	comp249.toString());
	}

}

class Course
{
	private String courseName;
	
	private int numberOfStudents;	//will need this for the array^
	private String [] students = new String [numberOfStudents];
	
	Course (int numberOfStudents)
	{
		this.numberOfStudents = numberOfStudents;
		students = new String [numberOfStudents];
	}
	
	Course (String courseName)
	{
		this.courseName = courseName;
	}
	
	public String getCourseName()
	{
		return courseName;
	}
	
	public void addStudent (String student)
	{
		if (numberOfStudents == students.length) 
		{
			String[] moreStudents = new String [students.length + 1];
			
			for (int i = 0; i < numberOfStudents; i++) 
			{
				moreStudents [i] = students [i];
			}
			students = moreStudents;
		}
		students[numberOfStudents] = student;
		numberOfStudents++;
		
	}
	
	public String [] getStudents ()
	{
		return students;
	}
	
	public int getNumberOfStudents()
	{
		return numberOfStudents;
	}
	
	public void dropStudent (String student) 
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
			System.out.println(((numberOfStudents > 0)? "This student isn't enrolled in the class." : ""));
		}
				
	}
	
	public int studentPosition (String student)
	{
		int index;
		
		for (int i = 0; i < students.length; i++)
		{
			if (students[i].equalsIgnoreCase(student))				//Can't use == since we're dealing with Strings
			{
				return i;
			}
		}
		return - 1;
	}
	
	public void removeStudent (int position)
	{
		String [] lessStudents = new String [students.length -1];
		
		for (int i = 0; i < students.length; i ++)
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
		students = new String [0];
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