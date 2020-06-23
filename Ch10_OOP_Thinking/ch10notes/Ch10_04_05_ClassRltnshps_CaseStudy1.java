package ch10notes;

/* 10.4: CLASS RELATIONSHIPS
 * To design classes, you need to explore the relationships among classes. The common relationships among classes are 
 * association, aggregation, composition, and inheritance.
 * This section explores association, aggregation, and composition. (Inheritance next chapter)
 * 
 * 10.4.1: ASSOCIATION
 * Association is a general BINARY RELATIONSHIP that describes an ACTIVITY between two classes. 
 * For example, a STUDENT taking a COURSE is an association between the Student class and the Course class, 
 * and a faculty member teaching a course is an association between the Faculty class and the Course class. 
 *    				take |>													<| teach
 * |Student|--------------------------|Course|-------------------------|Faculty|				|> indicates that student takes the course (as 
 * 																					Teacher									opposed to course taking student
 * Each class involved in the relationship may have a role name that describes the role it plays in the relationship. In above
 * figure, teacher is the role name for Faculty.
 * 
 * In Java code, you can implement associations by using data fields and methods. For example, the relationships in above
 * figure may be implemented using the classes shown below:
 * 
 * public class Student 
 * { 
 * private Course[]
		courseList;
		
		public void addCourse (Course s) 
		{ ... }
	}
 * 
 * 
 * public class Course 
 * { 
 * private Student[]
		classList;
	private Faculty faculty;

	public void addStudent (Student s) 
	{ ... }
	public void setFaculty (Faculty faculty) 
	{ ... }
	}
	
	public class Faculty 
	{ 
	private Course[]
	courseList;

	public void addCourse (Course c) 
	{ ... }
	}																													The association relations are implemented 
																														using data fields and methods in classes.
	The relation “a student takes a course” is implemented using the addCourse method in the Student class and the 
	addStuent method in the Course class. 
	The relation “a faculty teaches a course” is implemented using the addCourse method in the Faculty class and the 
	setFaculty method in the Course class. 
	The Student class may use a list to store the courses that the student is taking, the Faculty class may use a list to store 
	the courses that the faculty is teaching, and the Course class may use a list to store students enrolled in the course and 
	a data field to store the instructor who teaches the course.	
 */

/* 10.4.2: AGGREGATION AND COMPOSITION:
 * Aggregation is a special form of association that represents an OWNERSHIP RELATIONSHIP between two objects. 
 * Aggregation models has-a relationships. The OWNER object is called an AGGREGATING object & its class is called an 
 * AGGREGATING class. 
 * The subject object is called an AGGREGATED object, and its class is called an AGGREGATED class.
An object can be owned by many other aggregating objects. If an object is EXCLUSIVELY owned by an aggregating object, 
the relationship between the object and its aggregating object is referred to as a COMPOSITION. 
For example, “a student has a name” is a composition relationship between the Student class and the 
Name class, whereas “a student has an address” is an aggregation relationship between the Student class 
and the Address class, since an address can be shared by several students. 

In UML, a filled diamond is attached to an aggregating class (in this case, Student) to denote the composition relationship 
with an aggregated class (Name), and an empty diamond is attached to an aggregating class (Student) to denote the 
aggregation relationship with an aggregated class (Address).

								composition							aggregation
			|Name|----------------------------|Student|----------------------------|Address|
			
			Why is name/student a composition relationship but address/student is an aggregation relationship?
			Each student can only have 1 unique name, so basically you can map (COMPOSITE) the Name (aggregated) class
			to the Student class (aggregation). 
			Whereas, each address can be shared by 3 students...So up to 3 students in the Student class can have the SAME
			address. Student is the aggregator, address is being aggregated. 
			
				1 name    <------------> 1 student					composition
  multiple students <-------------> 1 address				aggregation 
	aggragator								aggregated		
	
	An aggregation relationship is usually represented as a data field in the AGGREGATING (multiple) class. 
	For example, the relationships of above ex may be implemented using the classes in below. 
	The relation “a student has a name” and “a student has an address” are implemented in the data field name and 
	address in the Student class.
	
	public class Name 								public class Student 														public class Address 
	{ ...															{private Name name;														{...
	}																private Address address;												}
 																	...
 	AGGREGATED CLASS						} 	AGGREGATING CLASS													AGGREGATED CLASS
 so in aggregating (has multiple) class datafield put: private aggregatedClassName refVar
 	
 	Aggregation may exist between objects of the same class. For example, a person may have a supervisor.
 	In the relationship “a person has a supervisor,” a supervisor can be represented as a data
field in the Person class, as follows:
	public class Person 
	{
	// The type for the data is the class itself 
	 * private Person supervisor;														//composition relationship (1 person <----> 1 supervisor)
		... 
	}
	
	If a person can have several supervisors, you may use an array to store supervisors, as shown below:
	public class Person 
	{ ...
	private Person[] supervisors;										//aggregation relationship		(1 person <------> many supervisor)
	}
 *Since aggregation and composition relationships are represented using classes in the same way, we will 
 *not differentiate them and call both compositions for simplicity
 */	

public class Ch10_04_05_ClassRltnshps_CaseStudy1
{

	public static void main(String[] args)
	{
		Course comp249 = new Course ("Java II");
		Course comp352 = new Course ("Data Structure");
		
		comp249.addStudent("Peter Jones");
		comp249.addStudent("Kim Smith");
		comp249.addStudent("Anne Kennedy");
		
		comp352.addStudent("Peter Jones");
		comp352.addStudent("Steve Smith");
		
		System.out.println("Number of students in comp249 (" + comp249.getCourseName() +"): " + 
		comp249.getNumberOfStudents());
		
		String [] students = comp249.getStudents();			//gets 100
		
		for (int i = 0; i < comp249.getNumberOfStudents(); i++)		//only shows the ones added through constructor
		{
			System.out.println(students [i]);
		}
		
		System.out.println("Number of students in comp352 (" + comp352.getCourseName() + "): " + 
		comp352.getNumberOfStudents() + "\nThey are: ");
		
		String [] comp352Students = comp352.getStudents();
		
		for (int i = 0; i < comp352.getNumberOfStudents(); i ++)
		{
			System.out.println(comp352Students[i]);
		}

	}

}

/*Suppose you need to process course information. Each course has a name and has students enrolled. 
 * You should be able to add/drop a student to/from the course
 */

class Course
{
	private String courseName;
	private String [] students = new String [100];				//say max is 100 students enrollment to a course
	private int numberOfStudents;	//will need this for the array^
	
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
		this.students [numberOfStudents] = student;
		this.numberOfStudents++;
	}
	
	public String [] getStudents ()
	{
		return students;
	}
	
	public int getNumberOfStudents()
	{
		return numberOfStudents;
	}
	
	//public void dropStudent(String student)
	
		//exercise 10.9
}
