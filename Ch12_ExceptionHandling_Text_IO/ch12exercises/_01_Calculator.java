package ch12exercises;


public class _01_Calculator
{

	public static void main(String[] args)
	{
		//System.out.println("Hello " + args[0]);
		//check number of strings passed:
		if (args.length != 3)
		{
			System.out.println("Usage: java Calculator operand1 operator operand2");
			System.exit(0);													//args[1]
		}
		
		//Result of the operation:
		int result = 0;
		
		//determine the operator
		switch (args[1].charAt(0))
		{
			case '+': result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
			break;
			case '-': result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
			break;
			case '.': result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
			break;
			//we used the . symbol for mult, not the common * symbol. The reason for this is that the * symbol refer to all the files
			//in the current directory when it is used on a command line
			case '/': result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
		}
		
		//display result:
		System.out.println(args[0] + ' ' + args[1] + " " + args[2] + " = " + result);
	}

}
