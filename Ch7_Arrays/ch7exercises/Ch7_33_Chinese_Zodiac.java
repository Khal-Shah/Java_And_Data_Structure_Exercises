package ch7exercises;
import java.util.Scanner;

/* Chapter 7 - Exercise 33:
 * (Culture: Chinese Zodiac) Simplify Listing 3.9 using an array of strings to store the animal names.
 * Chinese zodiac - Year mod 12 = 
 * 0: monkey 
 * 1: rooster 
 * 2: dog
3: pig
4: rat
5: ox
6: tiger
7: rabbit 
8: dragon 
9: snake 
10: horse 
11: sheep
 */
	//By Khaled Shah

public class Ch7_33_Chinese_Zodiac
{

	static Scanner kb = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		int [] number = getNumbers(12);
		String [] names = getNames(number);
		
		askAndShow(names);

	}
	
	public static String [] getNames(int [] monthNum)
	{
		String [] names = new String [monthNum.length];
		int i = 0;
		
		while (i < names.length)
		{
			names [i] = getName(i);
			i++;
		}
		return names;
	}
	
	public static String getName(int currentNum)
	{
		String name = "";
		
		switch (currentNum)
		{
			case  0: name = "monkey";
			break;
			case 1: name = "rooster";
			break;
			case 2: name = "dog";
			break;
			case 3: name = "pig";
			break;
			case 4: name = "rat";
			break;
			case 5: name = "ox";
			break;
			case 6: name =  "tiger";
			break;
			case 7: name = "rabbit";
			break;
			case 8: name = "dragon";
			break;
			case 9: name = "snake";
			break;
			case 10: name = "horse";
			break;
			case 11:  name = "sheep";
			break;
			default: name = "invalid";
		}
		return name;
	}
	
	public static int [] getNumbers(int sz)
	{
		int [] nums = new int [sz];
		
		for (int i = 0; i < sz; i++)
		{
			nums [i] = i;
		}
		return nums;
	}

	public static void askAndShow(String [] names)
	{
		int year;
		System.out.print("Enter the year: ");
		year = kb.nextInt();
		
		System.out.println("The year " + year + " in Chinese Zodiac is " + names[year % 12] + ".");
	}
}
