package ch10exercises.Ch10_03_MyInteger;

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
		//By Khaled Shah


public class Ch10_03_MyInteger_Driver
{

	public static void main(String[] args)
	{
        MyInteger num1 = new MyInteger(314);
        System.out.println(num1.getValue() + " is odd? - " + num1.isOdd() + "\nIs prime? - " + num1.isPrime());

        MyInteger num2 = new MyInteger(7);
        System.out.println(num2.getValue() + " is odd? - " + num2.isOdd() + "\nIs prime? - " + num2.isPrime());

        System.out.println("Passing in value 12 to num2. Is it still odd? - " + num2.isOdd(12));

        System.out.println(num2.getValue() + " equals " + num2.getValue() + "? - " + num2.equals(num2.getValue()));
        System.out.println(num1.getValue() + " equals " + num2.getValue() + "? - " + num1.equals(num2));

        System.out.println(num2.getValue() + " is prime? - " + MyInteger.isPrime(num2));
        char[] chars = {'A', 'B', 'C', 'Z'};
        MyInteger.parseInt(chars);
        for(int e: chars)
        {
            System.out.print(e + ", ");     //65, 66, 67, 90
        }

        String stringVal = "ABCZ";
        int[] stringToInt = MyInteger.parseInt(stringVal);
        System.out.println("\n" + stringVal + " in int is ");

        for(int e: stringToInt)
        {
            System.out.print(e + ", ");     //65, 66, 67, 90
        }

	}

}
