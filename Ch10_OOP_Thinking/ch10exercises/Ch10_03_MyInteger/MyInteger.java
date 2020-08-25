package ch10exercises.Ch10_03_MyInteger;

public class MyInteger
{
    private int value;

    public MyInteger(int value)
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

        for (int j = 2; j <= i; j++)
        {
            if (value % j == 0)
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

    public static boolean isOdd(int value)
    {
        return (value % 2 != 0);
    }

    public static boolean isPrime(int value)
    {
        int i = (value / 2);

        for (int j = 2; j <= i; j++)
        {
            if (value % j == 0)
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
        int[] numVals = new int[charVals.length];
        for (int i = 0; i < numVals.length; i++)
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
