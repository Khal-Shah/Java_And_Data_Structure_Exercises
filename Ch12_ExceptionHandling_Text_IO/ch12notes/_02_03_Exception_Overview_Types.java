package ch12notes;
import java.util.InputMismatchException;
import java.util.Scanner;

/* Chapter 12.1: INTRODUCTION
 * Exception handling enables a program to deal with exceptional situations and continue its normal execution.
Runtime errors occur while a program is running if the JVM detects an operation that is impossible to carry out. 
For example, if you access an array using an index that is out of bounds, you will get a runtime error with an 
ArrayIndexOutOfBoundsException. If you enter a double value when your program expects an integer, you will get a 
runtime error with an InputMismatchException.
In Java, runtime errors are thrown as exceptions. An exception is an object that represents an error or a condition that 
prevents execution from proceeding normally. If the exception is not handled, the program will terminate abnormally. 
How can you handle the exception so that the program can continue to run or else terminate gracefully? 
This chapter introduces this subject and text input and output.
 */

/* Chapter 12.2: Exception Handling Overview. 
 * Exceptions are thrown from a method. The caller of the method can catch and handle the exception.
 * 
 * {Types of exceptions: catch (InputMismatchException ex)
 * 											catch (ArithmeticException ex)
 */
public class _02_03_Exception_Overview_Types
{
	
	static Scanner kb = new Scanner (System.in);
	
	public static void main(String[] args)
	{
		/* To demonstrate exception handling, including how an exception object is created and thrown, let’s begin with
		 *  the example below, which reads in two integers and displays their quotient.
		 */
	//	System.out.println("Enter two integers below: ");
	//	int n1 = kb.nextInt();
	//	int n2 = kb.nextInt();
		//System.out.println(n1 + " / " + n2 + " is " + (n1 / n2));
		//If we put 0 for n2
		//We get the error message Exception in thread "main" java.lang.ArithmeticException: / by zero
		//A simple way to fix this error is to add an if statement to test the second number, as shown below
		
	/*	if (n2 != 0)				//test the "danger" num
		{
			System.out.println(n1 + " / " + n2 + " is " + (n1 / n2));
		}
		
		else
		{
			System.out.println("Divisor cannot be zero.");
		}	*/
		
		/* Before introducing exception handling, let us rewrite it to compute a quotient using a method
		 */
		//int result = quotient(n1, n2);
		//System.out.println(n1 + " / " + n2 + " is " + result);				this is the method w/o exception
		
		/* With Exception (quotientWException meth) and the try catch block:
		 * If n2 is 0, the method throws an exception by executing throw new ArithmeticException("Divisor cannot be zero");
The value thrown, in this case new ArithmeticException("Divisor cannot be zero"), is called an exception. 
The execution of a throw statement is called throwing an exception. The exception is an object created from an 
exception class. In this case, the exception class is java.lang.ArithmeticException. 
The constructor ArithmeticException(str) is invoked to construct an exception object, where str is a message that 
describes the exception.
When an exception is thrown, the normal execution flow is interrupted. As the name suggests, to “throw an exception” 
is to pass the exception from one place to another. The statement for invoking the method is contained in a try 
block and a catch block. The try block contains the code that is executed in normal circumstances. 
The exception is caught by the catch block. The code in the catch block is executed to handle the exception. 
Afterward, the statement  after the catch block is executed.
The throw statement is analogous to a method call, but instead of calling a method, it calls a catch block. 
In this sense, a catch block is like a method definition with a parameter that matches the type of the value being thrown. 
Unlike a method, however, after the catch block is executed, the program control does not return to the 
throw statement; instead, it executes the next statement after the catch block.
The identifier ex in the catch–block header catch (ArithmeticException ex)
acts very much like a parameter in a method. Thus, this parameter is referred to as a catch–block parameter. 
The type (e.g., ArithmeticException) preceding ex specifies what kind of exception the catch block can catch. 
Once the exception is caught, you can access the thrown value from this parameter in the body of a catch block.
In summary, a template for a try-throw-catch block may look like this:
try 
{
Code to run;
A statement or a method that may throw an exception; 
More code to run;
}
catch (type ex) 
{
    Code to process the exception;
  }
An exception may be thrown directly by using a throw statement in a try block, or by invoking a method that may 
throw an exception.
The main method invokes quotientWException. If the quotient method executes normally, it returns a value to the 
caller. If the quotient method encounters an exception, it throws the exception back to its caller. 
The caller’s catch block handles the exception.
		 */
	//	try
		{
		//	int result = quotientWException(n1, n2);
		//	System.out.println(n1 + " / " + n2 + " is " + result);	
		}
	//	catch (ArithmeticException ex)
		{
		//	System.out.println("Exception: an integer cannot be divided by zero.");
		}
		
		System.out.println("Execution continues...");
		
		boolean continueInput = true;
		
		/* When an excepion occurs, Java searches for a handler in the catch clause. 
		 * So to catch an exception in your program, you need to write a try-catch statement like this:
try 
{

}
catch (Exception ex) 
{
  // Catch and process exception
}
		 */
		
		do
		{
			try
			{
				System.out.print("Enter an integer: ");
				int num = kb.nextInt();							//jumps to catch here because an exception occurs if not int
				System.out.println("The number entered is " + num);
				continueInput = false;	
			}
			catch (InputMismatchException ex)					//if input doesn't match, this block gets executed
			{
				System.out.println("Try agian. Incorrect input entered, an integer is required.");
				kb.nextLine();			//Discard input
			}
		} while (continueInput);
		
		/* When executing kb.nextInt() an InputMismatchException occurs if the input entered is not an integer. 
		 * Suppose 3.5 is entered. An InputMismatchException occurs and the control is transferred to the catch block. 
		 * The statements in the catch block are now executed. The statement kb.nextLine() discards the current input line 
		 * so that the user can enter a new line of input. 
		 * The variable continueInput controls the loop. Its initial value is true, and it is changed to false 
		 * when a valid input is received. Once a valid input is received, there is no need to continue the input.
		 * 
		 */
		
		
	}
	
	public static int quotient(int n1, int n2)
	{
		if (n2 == 0)
		{
			System.out.println("Divisor cannot be zero.");
			System.exit(1);										//terminate the program
		}
		return (n1 / n2);
		/*The method quotient returns the quotient of two integers. If n2 is 0, it cannot return a value, so the program is 
		 * terminated. This is clearly a problem. You should not let the method terminate the program—the caller should 
		 * decide whether to terminate the program.
How can a method notify its caller an exception has occurred? 
Java enables a method to throw an exception that can be caught and handled by the caller. Program can be rewritten, 
as shown in the method below
		 */
	}
	
	public static int quotientWException(int n1, int n2)
	{
		if (n2 == 0)
		{
			throw new ArithmeticException("Divisor cannot be zero.");
		}
		return (n1 / n2);
	}

}

/* 12.3: EXCEPTION TYPES:
 Exceptions are objects, and objects are defined using classes. The root class for exceptions is java.lang.Throwable.
 Exceptions thrown are instances of the classes shown in the diagram below (and on page 456), 
 or of subclasses of one of these classes.
Object ---> Throwable
						| 				|
					    v				>>>>>Error-->VirtualMachineError, LinkageError, StackOverflow
					    Exception--->RunTimeException--->ArithmeticException, NullpointerException, InputMismatchException
					        |        |				, IndexOutOfBoundsException, IllegalArgumentException, StringIndexOutOfboundsException
					        |       v				, ClassCastException, 
					        v		IOException	
					        ClassNotFoundException
					             
	The Throwable class is the root of exception classes. All Java exception classes inherit directly or indirectly from 
	Throwable. You can create your own exception classes by extending Exception or a subclass of Exception.
The exception classes can be classified into three major types: system errors, exceptions, and runtime exceptions.

System errors are thrown by the JVM and are represented in the Error class. The Error class describes internal system 
errors, though such errors rarely occur. If one does, there is little you can do beyond notifying the user and trying to 
terminate the program gracefully. 2 types below:
	LinkageError: A class has some dependency on another class, but the latter class has changed incompatibly after the 
	compilation of the former class.
	VirtualMachineError: The JVM is broken or has run out of the resources it needs in order to continue operating.
	
Exceptions are represented in the Exception class, which describes errors caused by your program and by external 
	circumstances. These errors can be caught and handled by your program. Examples of subclasses of Exception are 
	listed below:
	ClassNotFoundException: Attempt to use a class that does not exist. This exception would occur, for example, if 
	you tried to run a nonexistent class using the java command, or if your program were composed of, say, three class 
	files, only two of which could be found.
	IOException: Related to input/output operations, such as invalid input, reading past the end of a file, and opening a 
	nonexistent file. Examples of subclasses of IOException are InterruptedIOException, EOFException 
	(EOF is short for End of File), and FileNotFoundException.

Runtime exceptions are represented in the RuntimeException class, which describes programming errors, such as bad 
casting, accessing an out-of-bounds array, and numeric errors. Runtime exceptions are generally thrown by the JVM. 
Examples of subclasses are listed below:
	ArithmeticException: Dividing an integer by zero. Note that floating-point arithmetic does not throw exceptions..
	NullPointerException: Attempt to access an object through a null reference variable.
	IndexOutOfBoundsException: Index to an array is out of range.
	IllegalArgumentException: A method is passed an argument that is illegal or inappropriate
	
	RuntimeException, Error, and their subclasses are known as unchecked exceptions. All other exceptions are known as 
	checked exceptions, meaning that the compiler FORCES the programmer to check and deal with them in a try-catch 
	block or declare it in the method header (Section 12.4.)
	In most cases, unchecked exceptions reflect programming logic errors that are unrecoverable. For example, a 
	NullPointerException is thrown if you access an object through a reference variable before an object is assigned to it; 
	an IndexOutOfBoundsException is thrown if you access an element in an array outside the bounds of the array. 
	These are logic errors that should be corrected in the program. Unchecked exceptions can occur anywhere in a 
	program. To avoid cumbersome overuse of try-catch blocks, Java does NOT mandate that you write code to catch or 
	declare unchecked exceptions.
	
	So basically, you can use RuntimeException and Error (& their subclasses...ArithmeticException, IndexOutOfBounds, etc)
	without using try-catch block. To use the Exception class however (IO & ClassNotFound), you MUST use try-catch.
 */
