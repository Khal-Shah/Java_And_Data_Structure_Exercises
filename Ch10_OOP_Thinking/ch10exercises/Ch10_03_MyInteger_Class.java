package ch10exercises;

/* Chapter 10 - Exercise 3:
 * (The MyInteger class) Design a class named MyInteger. The class contains:
 * 
■ An int data field named value that stores the int value represented by this object.
■ A constructor that creates a MyInteger object for the specified int value.
■ A getter method that returns the int value.
■ The methods isEven(), isOdd(), and isPrime() that return true if the value in this object is even, odd, or prime, respectively.
■ The static methods isEven(int), isOdd(int), and isPrime(int) that
return true if the specified value is even, odd, or prime, respectively.
■ The static methods isEven(MyInteger), isOdd(MyInteger), and isPrime(MyInteger) that return true if the specified value 
is even, odd, or prime, respectively.
■ The methods equals(int) and equals(MyInteger) that return true if
the value in this object is equal to the specified value.
■ A static method parseInt(char[]) that converts an array of numeric characters to an int value.
■ A static method parseInt(String) that converts a string into an int value.

Draw the UML diagram for the class and then implement the class. Write a client program that tests all methods in the class.
 */

class MyInteger
{
	private int value;
	
	MyInteger (int value)
	{
		this.value = value;
	}
	
	public int getValue()
	{
		return value;
	}
	
	public void setValue (int value)
	{
		this.value = value;
	}
	
	public boolean isEven()
	{
		return (value % 2 == 0);
	}
	
	public boolean isOdd()
	{
		return (!isEven());
	}
	
	public boolean isPrime()
	{
		for (int divisor = 2; divisor < (value/2.0); divisor++)
		{
			if (value % divisor == 0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static boolean isEven (int value)
	{
		return (value % 2 == 0);
	}
	
	public static boolean isOdd (int value)
	{
		return (!isEven(value));
	}
	
	public static boolean isPrime (int value)
	{
		for (int divisor = 2; divisor <= (value/2); divisor++)
		{
			if (value % divisor == 0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static boolean isEven (MyInteger myInteger)					//can pass Class.meth(obj) to check status of obj
	{
		return (myInteger.isEven());
	}
	
	public static boolean isOdd (MyInteger myInteger)
	{
		return (!myInteger.isOdd());
	}
	
	public static boolean isPrime (MyInteger myInteger)
	{
		return (myInteger.isPrime());
	}
	
	//The methods equals(int) and equals(MyInteger) that return true if the value in this object is equal to the specified value.
	
	public boolean equals (int value)
	{
		return (this.value == value);
	}
	
	public boolean equals (MyInteger myInteger)
	{
		return (this.value == myInteger.value);
	}
	
	// static method parseInt(char[]) that converts an array of numeric characters to an int value
	public static int parseInt (char [] value)
	{
		double valueDub = 0;
        int e = value.length - 1;
        for (char val : value) 
        {
            valueDub += Math.pow(10, e--) * (val - '0');
        }

        return (int) valueDub;
	}
	
	//A static method parseInt(String) that converts a string into an int value.
	public static int parseInt (String value)
	{
		return (MyInteger.parseInt(value.toCharArray()));
	}
	
	
}

public class Ch10_03_MyInteger_Class
{

	public static void main(String[] args)
	{
		MyInteger num1 = new MyInteger(27);
		MyInteger num2 = new MyInteger(15);
		MyInteger num3 = new MyInteger(47);
		
		System.out.println("Num1 is " + num1.getValue() + "\t\tPrime: " + num1.isPrime() + "\t\tEven: " + num1.isEven() + 
				"\t\tOdd: " + num1.isOdd());
		//System.out.println(num1.isOdd(3));			//the default (27) val is overridden when you pass a new num in perimeter
		
		System.out.println("Num2 is " + num2.getValue() + "\t\tPrime: " + num2.isPrime() + "\t\tEven: " + num2.isEven() + 
				"\t\tOdd: " + num2.isOdd());
		System.out.println("Num3 is " + num3.getValue() + "\t\tPrime: " + num3.isPrime() + "\t\tEven: " + num3.isEven() + 
				"\t\tOdd: " + num1.isOdd());
		
		//System.out.println(MyInteger.isPrime(num3));
		System.out.println(num1.getValue() + " == " + num3.getValue() + "? " + num1.equals(num3));
		System.out.println(num2.equals(15));
		
		System.out.println("Parse int 20 string value = "+ MyInteger.parseInt("20"));
		System.out.printf("Parse int 20 char array value = " + MyInteger.parseInt("20".toCharArray()));
		
	}

}
