package ch7notes;
import java.util.Scanner;

public class Ch7_02_03_04_Foreach_CaseStudies
{
	static Scanner kb = new Scanner (System.in);

	public static void main(String[] args)
	{
		/* Before getting into foreach loops and case study: first let's look at how to...
		 *  SHIFT ELEMENTS: Sometimes you need to shift the elements left or right. 
		 *  
		 *  Here is an example of shifting the elements one position to the left and filling the last element with the first element:
		 */
		/*int [ ] myNums = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		
		int temp = myNums[0];			//store the first element so you can put it into last element later
		
		//Now shift elements left:
		for (int i = 1; i < myNums.length; i++)	//we wanna shift each element left one position and place first E into last index
		{
			myNums[i - 1] = myNums[i];
		}
		
		myNums [myNums.length - 1] = temp; 		//put the first value (temp) into the very last index of array*/
		
		//System.out.print("The shifted elements are: ");
		/*for (int k = 0; k < myNums.length; k++)
		{
			System.out.print(myNums[k] + "\t");	
		}	*/
		
		/* FOREACH LOOPS:
		 * Java supports a convenient for loop, known as a foreach loop, which enables you to traverse the array 
		 * sequentially without using an index variable...
		 * For example, the following code displays all the (shifted) elements from our myNums array:
		 */
		/*for (int e: myNums)
		{
			//System.out.print(e + "\t");
		} */
		
		//SYNTAX: 
		//for (arrType anything: arrName)
		//sysout(anything)										//quick way of displaying the elements without looping each index
		
		/*You still have to use an index variable if you wish to traverse the array in a different order or change the 
		 * elements in the array.
		 */
		
		/* Case Study 1: Analyzing Numbers
		 * The problem is to write a program that finds the number of items above the average of all items
		 * The problem is to read x numbers, get the average of these numbers, and find the number of the items (E) 
		 * greater than the average.
		 */
		
		/*System.out.print("Enter the number of items: ");
		int totalItems = kb.nextInt();
		
		double [] numbers = new double [totalItems];
		double sum = 0;	// to compute avg
		
		System.out.print("Enter the numbers: ");
		
		for (int i = 0; i < totalItems; i++)
		{
			numbers [i] = kb.nextDouble();
			sum += numbers[i];
		}
		
		double average = sum / numbers.length;
		int count = 0; //to track above average items
		
		for (int i = 0; i < numbers.length; i++)
		{
			if (numbers[i] > average)
			{
				count++;
			}
		}	
		
		System.out.println("The average is " + average + "\nThe number of items above average is " + count); */
		
		/* Case Study II: Deck of Cards
		 * The problem is to create a program that will randomly select four cards from a deck of cards.
		 * Say you want to write a program that will pick four cards at random from a deck of 52 cards. All the cards 
		 * can be represented using an array named deck, filled with initial values 0 to 51, as follows:
		 */
		
		int [] deck = new int [52];	//creates array called deck of size 52
		//Now initialize the array:
		for (int i = 0; i < deck.length; i++)
		{
			deck [i] = i;
		}
		
		/*Card numbers 0 to 12, 13 to 25, 26 to 38, and 39 to 51 represent 13 Spades, 13 Hearts, 13 Diamonds,
		 * and 13 Clubs, respectively.
		 */
		
		String [] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
		String [] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		
		//Now shuffle the deck:
		
		for (int i = 0; i < deck.length; i++)
		{
			int j = (int) (Math.random() * deck.length); //random num between 0 and 51
			//Now swap
			int temp = deck[i];		//store element into temp;
			deck[i] = deck[j];			//element indexes swapped
			deck[j] = temp;				//store the value into random index
		}
		
		//Display the first 4 cards:
		
		for (int i = 0; i < 4; i++)
		{
			String suit = suits [deck [i] / 13];
			String rank = ranks [deck [i] % 13];
			
			System.out.println("Card number " + deck [i] + ": " + rank + " of " + suit);
		}
		/* After a deck is shuffled, deck[i] contains an arbitrary value. 
		 * deck[i] / 13 is 0, 1, 2, or 3, which determines the suit (suits array). 
		 * deck[i] % 13 is a value between 0 and 12, which determines the rank (ranks array)
		 * 
		 */
		

	}

}
