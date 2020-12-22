package ch12notes.oldnotes;

/* Chapter 12.4: MORE ON EXCEPTION HANDLING:
 * A handler for an exception is found by propagating the exception backward through a chain of method calls, starting 
 * from the current method.
 * 
 * Java’s exception-handling model is based on three operations: 1) declaring an exception, 2) throwing an exception, 
 * and 3) catching an exception as shown below:
 * 
 * method1()
 {
	try
		{
		invoke method2;								======>			method2() throws Exception				1) declaring an exception
		}																						{
	catch(Exception ex)																if (an error occurs)
	{		{3)catching an exception}											{
	Process exception;																	throw new Exception();					2) Throwing an exception
	}																								}
}																								}

1) DECLARING AN EXCEPTION: {only applies to checked exceptions}.
Every method must state the types of checked exceptions it might throw. This is known as declaring exceptions. 
Because system errors and runtime errors can happen to any code, Java does not require that you declare Error and 
RuntimeException (unchecked exceptions) explicitly in the method. However, all other exceptions thrown by the method 
must be explicitly declared in the method header so that the caller of the method is informed of the exception.

To declare an exception in a method, use the throws keyword in the method header, as in:
public void myMethod() throws IOException

The throws keyword indicates that myMethod might throw an IOException. If the method might throw multiple exceptions, 
add a list of the exceptions, separated by commas, after throws:
public void myMethod() throws Exception1, Exception2, ..., ExceptionN
 
 2) THROWING AN EXCEPTION: 
 * A program that detects an error can create an instance of an appropriate exception type and throw it. This is known as 
 * throwing an exception. 
 Suppose the program detects that an argument passed to the method violates the method contract (e.g., the argument
 must be nonnegative, but a negative argument is passed); the program can create an instance of IllegalArgumentException 
 and throw it, as follows:
IllegalArgumentException ex = new IllegalArgumentException("Wrong Argument");
throw ex;
Or, if you prefer, you can use the following:
throw new IllegalArgumentException("Wrong Argument");
	
*The keyword to DECLARE an exception is throws, and the keyword to THROW an exception is throw.
								^public void method() throws ExceptionType1, ExceptionType2...etc
								
	3) CATCHING AN EXCEPTION: 
You now know how to declare an exception and how to throw an exception. When an exception is thrown, 
it can be caught and handled in a try-catch block, as follows:
	try {
statements; // Statements that may throw exceptions
}
catch (Exception1 exVar1) {
    handler for exception1;
  }
catch (Exception2 exVar2) 
{ handler for exception2;
}
...
catch (ExceptionN exVarN) {
    handler for exceptionN;										//So you can have as many catch blocks as one for 1 try block
  }
  
  If no exceptions arise during the execution of the try block, the catch blocks are skipped. If one of the statements inside 
  the try block throws an exception, Java skips the remaining statements in the try block and starts the process of finding the 
  code to handle the exception. The code that handles the exception is called the exception handler; it is found by 
  propagating the exception backward through a chain of method calls, starting from the current method
  
  CHECK PAGE 460 for visual example.
  If an exception is not caught in the current method, it is passed to its caller. The process is repeated until the exception 
  is caught or passed to the main method.
  
  The order in which exceptions are specified in catch blocks is important. A compile error will result if a catch block for a 
  superclass type appears before a catch block for a subclass type. 
  try { ...
}
catch (RuntimeException ex) {					<==Subclass first (RuntimeException is a subclass of Exception)
... }
catch (Exception ex) { ...								<= Superclass last
}
catch (Exception1 | Exception2 | ... | Exceptionk ex) { // Same code for handling these exceptions
}
 */

public class _04_05_ExceptionHandling_FinallyClause
{

	public static void main(String[] args)
	{
		//12.4: Getting Information from Exceptions (using methods)

		try 
		{
			System.out.println(sum(new int [] {1, 2, 3, 4, 5}));
		}
		
		catch (Exception ex)
		{
			ex.printStackTrace();		//Prints the Throwable object and its call stack trace information on the console.
			System.out.println("\n" + ex.getMessage()); ////Returns the message that describes this exception object.
			//^prints 5 (cuz thats what the for loop in method sets its upper bound (should be 4)
			
			//Returns the concatenation of three strings: (1) the full name of the exception
			//class; (2) ":" (a colon and a space); (3) the getMessage() method.
			System.out.println("\n" + ex.toString());		//^^^^
			
			System.out.println("\nTrace Info Obtained from getStackTrace");
			 StackTraceElement [] traceElements = ex.getStackTrace();
			 //^Returns an array of stack trace elements representing the stack trace pertaining to this exception object
			 
			 for (int i = 0; i < traceElements.length; i++) 
			 {
			 System.out.print("method " + traceElements[i].getMethodName()); 
			 System.out.print("(" + traceElements[i].getClassName() + ":"); 
			 System.out.println(traceElements[i].getLineNumber() + ")");
			 }
		}
		/* For the try-catch block (setRadius method) in main:
		 * try
		 * {
		 * CircleWithException c1 = new CircleWithException(5);
		 *  CircleWithException c2 = new CircleWithException(-5); 		//Catches IllegalArgumentException
		 *  CircleWithException c3 = new CircleWithException(0);
		 * }
 		catch (IllegalArgumentException ex) 											//3) CATCHING
 		{
 		System.out.println(ex);
 		}

		 */
			
		}
	
	public static int sum (int [] list)
	{
		int result = 0;
		for (int i = 0; i <= list.length; i++)
		{
			result += list[i];
		}
		return result;
	}

	//Example: putting an exception handler in the setRadius method (in the Circle class):
	/*
	 * First, there would need to be a new constructor:
	 * 
	 * public CircleWithException (double newRadius)
	 * {
	 * 		setRadius(newRadius);
	 * }
	 * 
	 * public void setRadius(double newRadius) throws IllegalArgumentException 		1)  DECLARING: 
	 * {
			if (newRadius >= 0) 
			{
			radius = newRadius;
			}
			else
			throw new IllegalArgumentException("Radius cannot be negative");				2) THROWING
		}
	 */
}

/* 12.5: THE FINALLY CLAUSE: The finally clause is always executed regardless whether an exception occurred or not.
Occasionally, you may want some code to be executed regardless of whether an exception occurs or is caught. 
Java has a finally clause that can be used to accomplish this objective. The syntax for the finally clause might look like this:
try 
{
 statements;
}
catch (TheException ex) 
{
  handling ex;
}
finally 
{ 
finalStatements;
}

The code in the finally block is executed under all circumstances, regardless of whether an exception occurs in the try 
block or is caught. Consider three possible cases:
■ If no exception arises in the try block, finalStatements is executed, and the next statement after the try statement is 
executed.
■ If a statement causes an exception in the try block that is caught in a catch block, the rest of the statements in the try 
block are skipped, the catch block is executed, and the finally clause is executed. The next statement after the try 
statement is executed.
■ If one of the statements causes an exception that is not caught in any catch block, the other statements in the try block 
are skipped, the finally clause is executed, and the exception is passed to the caller of this method.
^So if it doesn't catch it, the normal flow is disrupted (doesn't execute the statements after the try-catch block)
The finally block executes even if there is a return statement prior to reaching the finally block.

The catch block may be omitted when the finally clause is used.
 */
