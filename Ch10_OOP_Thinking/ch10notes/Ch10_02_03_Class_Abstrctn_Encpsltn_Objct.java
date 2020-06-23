package ch10notes;
import java.util.Date;
import java.util.Scanner;

/* Chapter 10.2: CLASS ABSTRACTION AND ENCAPSULATION
 * The user of the class does not need to know how the class is implemented. The details of implementation are 
 * encapsulated and hidden from the user. This is called class encapsulation. For example, you can create a Circle 
 * object and find the area of the circle without knowing how the area is computed. For this reason, a class is also known 
 * as an abstract data type.
 * 
 * Consider, for instance, building a computer system. Your personal computer has many components—a CPU, memory, 
 * disk, motherboard, fan, and so on. Each component can be viewed as an object that has properties and methods. 
 * To get the components to work together, you need know only how each component is used and how it interacts with 
 * the others. You don’t need to know how the components work internally. The internal implementation is encapsulated 
 * and hidden from you. You can build a computer without knowing how a component is implemented.
 * 
 * The computer-system analogy precisely mirrors the object-oriented approach. Each component can be viewed as an 
 * object of the class for the component. For example, you might have a class that models all kinds of fans for use in a 
 * computer, with properties such as fan size and speed and methods such as start and stop. 
 * A specific fan is an instance of this class with specific property values.
 * 
 * As another example, consider getting a loan. A specific loan can be viewed as an object of a Loan class. 
 * The interest rate, loan amount, and loan period are its data properties, and computing the monthly payment and 
 * total payment are its methods. When you buy a car, a loan object is created by instantiating the class with your loan 
 * interest rate, loan amount, and loan period. You can then use the methods to find the monthly payment and total
 *  payment of your loan. As a user of the Loan class, you don’t need to know how these methods are implemented.
 */

/* 10.3: THINKING IN OBJECTS:
 * The procedural paradigm focuses on designing methods. The object-oriented paradigm couples data and methods 
 * together into objects. Software design using the object-oriented paradigm focuses on objects and operations on objects.
 
 * Listing 3.4, ComputeAndInterpretBMI.java, presented a program for computing body mass index. The code cannot be 
 * reused in other programs, because the code is in the main method. To make it reusable, we COULD define a static 
 * method to  compute body mass index as follows:			public static double getBMI(double weight, double height)
 * 
This method is useful for computing body mass index for a specified weight and height. How- ever, it has limitations. 
Suppose you need to associate the weight and height with a person’s name and birth date. You could declare separate 
variables to store these values, but these values would not be tightly coupled. The ideal way to couple them is to create 
an object that contains them all. Since these values are tied to individual objects, they should be stored in instance data 
fields.
 */

public class Ch10_02_03_Class_Abstrctn_Encpsltn_Objct
{
	static Scanner kb = new Scanner (System.in);

	public static void main(String[] args)
	{
	
		//System.out.print("Enter annual interest rate, for example (8.25): ");
		//double annualInterestRate = kb.nextDouble();
		
	//	System.out.print("Enter number of years as an integer: ");
		//int numberOfYears = kb.nextInt();
		
	//	System.out.print("Enter loan amount, for example (120000.95): ");
	//	double loanAmount = kb.nextDouble();
		
		//Loan loan1 = new Loan (annualInterestRate, numberOfYears, loanAmount);
		
	//	System.out.printf("The loan was created on %s\nThe monthly payment is $%.2f\nThe total payment is $%.2f",
		//		loan1.getLoanDate().toString(), loan1.getMonthlyPayment(), loan1.getTotalPayment());

		BMI ky = new BMI ("Kim Yang", 18, 145, 70);
		BMI kps = new BMI ("Khaled Shah", 31, 170, 68);
		BMI sk = new BMI ("Susan King", 215, 70);
		
		System.out.printf("The BMI for %s is %.2f, which is %s\n", ky.getName(), ky.getBMI(), ky.getStatus());
		System.out.printf("The BMI for %s is %.2f, which is %s\n", kps.getName(), kps.getBMI(), kps.getStatus());
		System.out.printf("The BMI for %s is %.2f, which is %s\n", sk.getName(), sk.getBMI(), sk.getStatus());
	}

}

class BMI
{
	private String name;
	private int age;
	private double weight;			//lbs
	private double height;			//inches
	
	public static final double KILOGRAMS_PER_POUND = 0.45359237;
	public static final double METERS_PER_INCH = 0.0254;
	
	BMI (String name, int age, double weight, double height)
	{
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}
	
	BMI (String name, double weight, double height)
	{
		this (name, 20, weight, height);	//sends it back to the above constructor
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public double getWeight()
	{
		return weight;
	}
	
	public double getHeight()
	{
		return height;
	}
	
	public double getBMI()
	{
		return (weight * KILOGRAMS_PER_POUND / Math.pow((height * METERS_PER_INCH), 2));
	}
	
	public String getStatus()
	{
		if (getBMI() < 18.5)
		{
			return "Underweight";
		}
		
		else if (getBMI() < 25)
		{
			return "Normal";
		}
		
		else if (getBMI() < 30)
		{
			return "Overweight";
		}
		
		else
		{
			return "Obese";
		}
	}
	
}

class Loan
{
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private Date loanDate;
	
	public Loan()
	{
		this (2.5, 1, 1000);		//will assign 2.5 to annualInterestRate, 1 to numberOfYears, etc
		loanDate = new Date();
	}
	
	public Loan (double annualInterestRate, int numberOfYears, double loanAmount)
	{
		this.annualInterestRate = annualInterestRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
		loanDate = new Date();
	}
	
	public double getAnnualInterestRate()
	{
		return annualInterestRate;
	}
	
	public int getNumberOfYears()
	{
		return numberOfYears;
	}
	
	public double getLoanAmount()
	{
		return loanAmount;
	}
	
	public void setAnnualInterestRate (double annualInterestRate)
	{
		this.annualInterestRate = annualInterestRate;
	}
	
	public void setNumberOfYears (int numberOfYears)
	{
		this.numberOfYears = numberOfYears;
	}
	
	public void setLoanAmount (double loanAmount)
	{
		this.loanAmount = loanAmount;
	}
	
	//Monthy Payment method
	public double getMonthlyPayment() 
	{
		double monthlyInterestRate = annualInterestRate / (12 * 100);
		double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (1 / Math.pow(1 + monthlyInterestRate, 
																																										numberOfYears * 12)));
		return monthlyPayment;
	}
	
	public double getTotalPayment()
	{
		return (getMonthlyPayment() * 12 * numberOfYears);
	}
	
	//loan date
	public Date getLoanDate()
	{
		return loanDate;
	}
	
}

/*In procedural programming, data and operations on the data are separate, and this methodology requires passing 
 * data to methods. Object-oriented programming places data and the operations that pertain to them in an object. 
 * This approach solves many of the problems inherent in procedural programming. The object-oriented programming 
 * approach organizes programs in a way that mirrors the real world, in which all objects are associated with both 
 * attributes and activities. Using objects improves software reusability and makes programs easier to develop and easier 
 * to maintain. Programming in Java involves thinking in terms of objects; a Java program can be viewed as a 
 * collection of cooperating objects.
 */
