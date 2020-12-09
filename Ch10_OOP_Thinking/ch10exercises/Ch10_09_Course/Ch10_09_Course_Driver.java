package ch10exercises.Ch10_09_Course;

/* Chapter 10 - Exercise 9:
 * (The Course class) Revise the Course class as follows:
■ The array size is fixed in Listing 10.6. Improve it to automatically increase the array size by creating a new larger array 
and copying the contents of the current array to it.					//like what the stack class does when size > capacity
■ Implement the dropStudent method.
■ Add a new method named clear() that removes all students from the
course.
Write a test program that creates a course, adds three students, removes one, and displays the students in the course.
 */
		//By Khaled Shah


public class
Ch10_09_Course_Driver
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

