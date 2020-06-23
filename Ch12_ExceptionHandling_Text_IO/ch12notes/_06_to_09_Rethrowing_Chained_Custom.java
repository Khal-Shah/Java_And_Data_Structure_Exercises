package ch12notes;

/* 12.6: WHEN TO USE EXCEPTIONS:
 * A method should throw an exception if the error needs to be handled by its caller.
 * The try block contains the code that is executed in normal circumstances. The catch block contains the code that is 
 * executed in exceptional circumstances.
 * When should you use a try-catch block in the code? Use it when you have to deal with unexpected error conditions. 
 * Do not use a try-catch block to deal with simple, expected situations. 
 * For example, the following code
try { System.out.println(refVar.toString());
}
catch (NullPointerException ex) {
System.out.println("refVar is null"); }

is better replaced by
if (refVar != null) System.out.println(refVar.toString());
else
System.out.println("refVar is null");
 */

/* 12.7: RETHROWING EXCEPTIONS: 
 * Java allows an exception handler to rethrow the exception if the handler cannot process the exception or simply wants 
 * to let its caller be notified of the exception.
 * syntax for rethrowing an exception may look like this:
try { statements;
}
catch (TheException ex) {
    perform operations before exits;
throw ex; }													//throws back to the caller
^The statement throw ex rethrows the exception to the caller so that other handlers in the caller get a chance to process 
the exception ex.
 */

/* 12.8: CHAINED EXCEPTION: Throwing an exception along with another exception forms a chained exception.
 * In the preceding section, the catch block rethrows the original exception. Sometimes, you may need to throw a new 
 * exception (with additional information) along with the original exception. This is called chained exceptions.
 * Ex:
 * 
 * main:
 * 		try																			catch (Exception ex)
 * 		{																				{
 * 			method1();															ex.printStackTrace();						c) catches thrown exception from meth1
 * 		}																				}
 *
 *public static void method1() throws Exception
 * {
 * 		try { 	method2()		}
 * 		catch (Exception Ex)															
 * 		{																							b) gets rethrown to the caller
 * 			throw new Exception("New info from method1", ex);						<=Rethrowing/chained
 * 		}
 * }
 * 
 * public static void method2() throws Exception
 * {	throw new Exception("New info from method 2.")	};					a) gets caught by catch in method 1
 * 
 * The main method invokes method1, method1 invokes method2, and method2 throws an exception. This exception is 
 * caught in the catch block in method1 and is wrapped in a new exception. The new exception is thrown and caught in the 
 * catch block in the main method 
 */

/* 12.9: DEFINING CUSTOM EXCEPTION CLASSES:
 * You can define a custom exception class by extending the java.lang.Exception class.
 * You create it by doing customClassName extends Exception:
 * Custom exception class extends java.lang.Exception. The (real) Exception class extends java.lang.Throwable. 
 * All the methods (e.g., getMessage(), toString(), and printStackTrace()) in Exception are inherited from Throwable.
 * So java.lang > Object > Throwable > Exception & Error > Custom
 */
public class _06_to_09_Rethrowing_Chained_Custom
{

	public static void main(String[] args)
	{

	}

}
