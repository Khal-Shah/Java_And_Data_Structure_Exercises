package ch5_exercises;

/* Chapter 5 - Exercise 32:
 * (Game: lottery) Revise Listing 3.8, Lottery.java, to generate a lottery of a two- digit number. 
 * The two digits in the number are distinct. 
 * (Hint: Generate the first digit. Use a loop to continuously generate the second digit until it is different from the first digit.)
 */
		//By Khaled Shah

public class Ch5_32_Lottery_Generator
{
	static final int FIRST_DIG = (int) (Math.random() * 10);

	public static void main(String[] args)
	{
		int second_dig = (int) (Math.random() * 10);
		
		while (second_dig == FIRST_DIG)
		{
			second_dig = (int) (Math.random() * 10);
		}
		
		System.out.println(FIRST_DIG + "" + second_dig);

	}

}
