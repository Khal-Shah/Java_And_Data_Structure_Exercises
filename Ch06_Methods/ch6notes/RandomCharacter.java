package ch6notes;


class RandomCharacter
{
	public static char getRandomCharacter(char ch1, char ch2)
	{
		return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
	}
	
	public static char getRandomCharacter()
	{
		return getRandomCharacter('\u0000', '\uFFFF');
	}
	
	public static char getRandomLowerCaseLetter()
	{
		return getRandomCharacter('a', 'z');
	}
	
}

