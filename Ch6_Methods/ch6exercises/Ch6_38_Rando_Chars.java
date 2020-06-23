package ch6exercises;

/* Chapter 6 - Exercise 38:
 * (Generate random characters) Use the methods in RandomCharacter in Listing 6.10 to print 100 
 * uppercase letters and then 100 single digits, printing ten per line.
 */
		//By Khaled shah

public class Ch6_38_Rando_Chars
{

	public static void main(String[] args)
	{
		showChars();
	}
	
	public static char randomChars()
	{
		char c = (char) (65 + Math.random() * 26);
				return c;
	}
	
	public static int randomDigits()
	{
		return (int) (-9 + Math.random() * 19);
	}
	
	public static void showChars()
	{
		int count = 0;
		
		for (int i = 1; i <= 100; i++)
		{
			count++;
			System.out.print(randomChars() + " ");
			
			if (count % 10 ==  0)
			{
				System.out.println();
			}
		}
		
		count = 0;
		
		for (int i = 1; i <= 100; i++)
		{
			count++;
			System.out.print(randomDigits() + " ");
			
			if (count % 10 ==  0)
			{
				System.out.println();
			}
		}
		
	}

}
