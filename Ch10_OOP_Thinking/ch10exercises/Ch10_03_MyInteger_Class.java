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
		//By Khaled Shah

class MyInteger
{
    private int value;

    MyInteger(int value)
    {
        this.value = value;
    }

    public int getValue()
    {
        return value;
    }

    // The methods isEven(), isOdd(), and isPrime() that return true if the value in this object is even, odd, or prime, respectively.
    public boolean isEven()
    {
        return (value % 2 == 0);
    }

    public boolean isOdd()
    {
        return (value % 2 != 0);
    }

    public boolean isPrime()
    {
        int i = (value / 2);

        for(int j = 2; j <= i; j++)
        {
            if(value % j == 0)
            {
                return false;
            }
        }
        return true;
    }

    // ■ The static methods isEven(int), isOdd(int), and isPrime(int) that return true if the specified value is even,
    // odd, or prime, respectively.public static boolean isEven()
    public static boolean isEven(int value)
    {
        return (value % 2 == 0);
    }

    public boolean isOdd(int value)
    {
        return (value % 2 != 0);
    }

    public boolean isPrime(int value)
    {
        int i = (value / 2);

        for(int j = 2; j <= i; j++)
        {
            if(value % j == 0)
            {
                return false;
            }
        }
        return true;
    }

    //The static methods isEven(MyInteger), isOdd(MyInteger), and isPrime(MyInteger) that return true if the specified
    // value is even, odd or prime, respectively.

    //Instance methods can also take "className obj" as parameter. We can then use the obj to call other
    //instance methods such as the ones above (no parameter) to compare objects.
    public static boolean isEven(MyInteger obj)
    {
        return obj.isEven();
    }

    public static boolean isOdd(MyInteger obj)
    {
        return obj.isOdd();
    }

    public static boolean isPrime(MyInteger obj)
    {
        return (obj.isPrime());
    }

    //The methods equals(int) and equals(MyInteger) that return true if
    //the value in this object is equal to the specified value.
    public boolean equals(int value)
    {
        return this.value == value;
    }

    public boolean equals(MyInteger obj)
    {
        return (this.value == obj.value);
    }

    //A static method parseInt(char[]) that converts an array of numeric characters to an int value.
    public static int[] parseInt(char[] charVals)
    {
        int [] numVals = new int[charVals.length];
        for(int i = 0; i < numVals.length; i++)
        {
            numVals[i] = charVals[i];
        }
        return numVals;
    }

    //A static method parseInt(String) that converts a string into an int value.
    public static int[] parseInt(String stringVal)
    {
        return (MyInteger.parseInt(stringVal.toCharArray()));
    }
}

public class Ch10_03_MyInteger_Class
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
