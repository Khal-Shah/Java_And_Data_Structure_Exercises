package ch9notes;

public class Ch9_Practice
{
	public static void main(String[] args)
	{
		Test test = new Test();
		test.setI(10);
		test.show();
	}

}

class Test
{
	private int i;
	private int j;

	Test()
	{
		i = 0;
		j = 1;
	}

	public void setI(int i)
	{
		this.i = i;
	}

	public void show()
	{
		System.out.println("i = " + i + ". j = " + j);
	}
}
