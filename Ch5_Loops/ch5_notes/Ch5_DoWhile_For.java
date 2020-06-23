package ch5_notes;
import java.util.*;

	/* DO-WHILE
	 * A do-while loop is the same as a while loop except that it executes the loop body first and then checks the loop 
	 * continuation condition. The do-while loop is a variation of the while loop. Its syntax is:
do {
 Loop body; Statement(s);
} while (loop-continuation-condition);
Use a do-while loop if you have statements inside the loop that must be executed at least once,

FOR LOOP:
A for loop has a concise syntax for writing loops. In general, the syntax of a for loop is:
for (initial-action; loop-continuation-condition; action-after-each-iteration) {
// Loop body;
    Statement(s);
  }
  
  The initial-action in a for loop can be a list of zero or more comma-separated variable declaration statements or 
assignment expressions. For example:	for (int i = 0, j = 0; i + j < 10; i++, j++) { // Do something}

Which loop to use? 
In general, a FOR loop may be used if the number of repetitions is known in advance, as, for example, 
when you need to display a message a hundred times. 
A while loop may be used if the number of repetitions is not fixed, as in the case of reading the numbers until the input is 0.
A do-while loop can be used to replace a while loop if the loop body has to be executed before the 
continuation condition is tested.

Nested LOOPS: Nested loops consist of an outer loop and one or more inner loops. Each time the outer loop is 
repeated, the inner loops are reentered, and started anew.
	 * 
	 */

public class Ch5_DoWhile_For
{
	static Scanner kb = new Scanner(System.in);

	
	public static void main(String[] args)
	{//Nested loop to display multiplication table:

		System.out.println("\t\t\t\t\t\tMULTIPLICATION TABLE");
		for (int j = 1; j <= 9; j++)
		{
			System.out.print("\t\t" + j);
		}
		System.out.println("\n-------------------------------------------------------------------------------------------------------------------------");
		
		for (int i = 1; i <= 9; i++)
		{
			System.out.print(i + "\t|");
			
			for (int k = 1; k <= 9; k++)
			{
				System.out.print("\t" + (i*k) + "\t");
			}
			System.out.println("");
		}
		
		
	}

}
