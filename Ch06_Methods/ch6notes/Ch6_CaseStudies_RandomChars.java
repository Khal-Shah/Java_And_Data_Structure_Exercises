package ch6notes;

/* and a random lowercase letter is
(char) ('a' + Math.random() * ('z' - 'a' + 1)) bet a and z inclusive. 
 * Hence, a random character between any two characters ch1 and ch2 with ch1 < ch2 can be
generated as follows:
(char) (ch1 + Math.random() * (ch2 – ch1 + 1))
 */

public class Ch6_CaseStudies_RandomChars
{
	static final int NUMBER_OF_CHARS = 175;
	static final int CHARS_PER_LINE = 25;

	public static void main(String[] args)
	{
		for (int i = 0; i < NUMBER_OF_CHARS; i++)
		{
			char ch = RandomCharacter.getRandomLowerCaseLetter();
			
			if ((i + 1) % CHARS_PER_LINE == 0)
			{
				System.out.println(ch);
			}
			else
				System.out.print(ch);
		}
	}
	
}
