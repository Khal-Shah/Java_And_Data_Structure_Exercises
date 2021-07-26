package ch7notes;
import java.util.*;

/* Once an array is created, its size is fixed. An array reference variable is used to access the elements in an array using 
 * an index. An array is used to store a collection of data, but often we find it more useful to think of an array as a collection 
 * of variables of the same type. Instead of declaring individual variables, such as number0, number1, . . . , and number99, 
 * you declare one array variable such as numbers and use numbers[0], numbers[1], . . . , and numbers[99] to represent 
 * individual variables.
 * 
 * Syntax for DECLARING an Array: elementType[] arrayRefVar; 				(could also use elementType arrayRefVar[])
 * Ex: double[] myList;																												double myList[]
 */

	/* CREATING an array:		elementType[] arrayRefVar = new elementType[arraySize]
	 * 																double[] myList = new double[10]
	 * This statement declares an array variable, myList, creates an array of ten elements of double type, and assigns its 
	 * reference to myList. 
	 * 
	 * To ASSIGN VALUES to the elements, use the syntax:
  		arrayRefVar[index] = value;	(after declaring it^^^^)
  		myList [0] = 100;
	 */
	

public class Ch7_02_ArrayBasics
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		//CREATING AN ARRAY
		//double[] myList = new double [10]; //creates array myList of 10 elements
		
		//ARRAY SIZE:
		//int arraySize = myList.length; //would print 10
		//System.out.println(arraySize);
		
		//ASSIGNING VALUES TO ARRAY
	//	myList [0] = 22.2; //assigns the first element of the array 22.2
		//System.out.println("The 1st element of the array is: " + myList[0]); //22.2
		
		//You could also create and assign in one fell swoop:
		//DIRECT ASSIGNMENT
		//int myLists[] = {22, 11, 44, 5};	//equivalent to int myLists[] = new double [4] and then assigning each element
		//individually like myLists[0] = 22..........myLists[3] = 5; notice no "new int".....just arrType arrVar = {values,} 
		
		/*Processing array elements: you'll most often use for loop
		 * Example:
		 */
		
	//	int[] myNumbers = new int[5]; //creates an array of 5 elements. Now say we wanna input those 5 elements:
		
		//System.out.println("Enter " + myNumbers.length + " elements: ");
		
		/*for (int i = 0; i < myNumbers.length; i++)
		{
			myNumbers[i] = kb.nextInt();
		}
		*/
		
		//Let's say instead of inputting, we wanna assign random values as elements to the array
		
	//	for (int i = 0; i < myNumbers.length; i++)
		{
		//	myNumbers[i] = (int) (Math.random() * 101); //assigns a random int between 0 and 100 to each element of array
		}
		
		//DISPLAYING THE ELEMNTS: 
		//System.out.println("The array elements are: ");
		
		//for (int i = 0; i < myNumbers.length; i++)
		{
			//System.out.println(myNumbers[i]);
		}
		
		/*For an array of the char[] type, it can be printed using one print statement. For example, 
		 * the following code displays Montreal:
		 */
		
		char [] city = {'M', 'o', 'n', 't', 'r', 'e', 'a', 'l',};
		
		System.out.println(city);	//prints Montreal
		
		//SUMMING ALL ELEMENTS:
		
		/*int [] jerseyNums = {11, 27, 67, 31};
		
		int total = 0;
		
		for(int i = 0; i < jerseyNums.length; i++)
		{
			total += jerseyNums[i];
		}
		
		System.out.println("The total of elements is " + total); //136
		*/
		
		//FINDING THE LARGEST ELEMENT:
		/*int max = jerseyNums[0];
		
		for (int i =  0; i < jerseyNums.length; i++)
		{
			if (jerseyNums[i] > max)
			{
				max = jerseyNums[i];
			}
		}
		
		System.out.println("The largest element is " + max);	//67
		 */
		
		//FINDING THE SMALLEST INDEX OF LARGEST ELEMENT
		
		/*double [] evenOdds = {12.1, 12.5, 22.1, 10.7, 22.1, 18.9};	//so the largest should be index 2
		int index = 0;
		double max = evenOdds [0];
		
		for (int i = 0; i < evenOdds.length; i++)
		{
			if (evenOdds [i] > max)	//since it's not "greater than or equal to", the condition is false for the second 22.1
			{
				max = evenOdds [i];
				index = i;
			}
		} 
		
		System.out.println("The largest element is " + max + " and it's at index " + index);	*/
		
		/* RANDOM SHUFFLING: randomly REORDERING the elements in an array. 
		 * for each element myList[i], randomly generate an index j and swap myList[i] with myList[j], as follows:
		 */
		double [] myList = {11.1, 22.2, 33.3, 44.4, 55.5, 66.6, 77.7, 88.8, 99.9};	//originally in ascending order
		
		for (int i = myList.length - 1; i > 0; i--)	//9 elements but i will start at index 8
		{
			int j = (int) (Math.random() * (i + 1));	// 0 <=j < i (1st time thru j will be between 0 and 8 
			//now swap:
			double temp = myList[i];	//store last element value into temp
			myList[i] = myList[j];	//last element of og array will be assigned to a random INDEX (myList[8] = myList[random#]
			myList[j] = temp;			//now that random index will be assigned the last element VALUE (myList[random#] = 99.9
		}
		
		System.out.print("The shuffled elements in the array are: ");
		
		for (int i = 0; i < myList.length; i++)
		{
			System.out.print(myList[i] + " ");
		}
		
	}
	
	
	

}
