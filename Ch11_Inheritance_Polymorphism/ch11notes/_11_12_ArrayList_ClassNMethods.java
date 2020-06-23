package ch11notes;
import java.util.ArrayList;			//Need to import ArrayList class.
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;					//have to import this to sort

/* Chapter 11.11: THE ARRAYLIST CLASS
 * An ArrayList object can be used to store a list of objects.
Now we are ready to introduce a very useful class for storing objects. You can create an array
  to store objects. But, once the array is created, its size is fixed. Java provides the ArrayList class, which can be used to 
  store an unlimited number of objects. 
   Some methods in ArrayList.
   
   Creates an empty list.
   +ArrayList()
   
   Appends a new element o at the end of this list.
+add(o: E): void																													//objName.add(E)		

Adds a new element o at the specified index in this list.
+add(index: int, o: E): void 																								//objName.add(index, E)

Removes all the elements from this list.
+clear(): void

Returns true if this list contains the element o.
+contains(o: Object): boolean 																						//objName.contains(E)

Returns the element from this list at the specified index.
+get(index: int): E 

Returns the index of the first matching element in this list.
+indexOf(o: Object): int 																									//objName.indexOf(E)

Returns true if this list contains no elements.
+isEmpty(): boolean 

Returns the index of the last matching element in this list.
+lastIndexOf(o: Object): int 

Removes the first element o from this list. Returns true if an element is removed.
+remove(o: Object): boolean																							//objName.remove(E)

Returns the number of elements in this list.			CAREFUL: SIZE, not LENGTH like usual
+size(): int																																//objName.size()

Removes the element at the specified index. Returns true if an element is removed.
+remove(index: int): boolean																							//obName.remove(index)

Sets the element at the specified index
+set(index: int, o: E): E

For example, the following statement creates an ArrayList and assigns its reference to variable cities. 
This ArrayList object can be used to store strings.
ArrayList<String> cities = new ArrayList<>();
					^^OBJECT....wouldn't work with primitive types such as int

ArrayList objects can be used like arrays, but there are many differences
CHECK OUT THE PIC (ARRAYLIST_ARRAY_DIFFERENCES) to see the diff bet. regular array and ArrayList operations

Once an array is created, its size is fixed. You can access an array element using the square-bracket notation 
(e.g., a[index]). When an ArrayList is created, its size is 0.

You cannot use the get(index) and set(index, element) methods if the element is not in the (Array)list. 
It is easy to add, insert, and remove elements in a list, but it is rather complex to add, insert, and remove elements in 
an array. You have to write code to manipulate the array in order to perform these operations. 

SORTING:
Note that you can sort an array using the java.util. Arrays.sort(array) method. 
To sort an array list, use the java.util.Collections. sort(arraylist) method.
Suppose you want to create an ArrayList for storing integers. Can you use the following code to create a list?
ArrayList<int> list = new ArrayList<>();
No. This will not work because the elements stored in an ArrayList must be of an object type. 
You cannot use a primitive data type such as int to replace a generic type. However, you can create an 
ArrayList for storing Integer objects as follows:
ArrayList<Integer> list = new ArrayList<>();
 */

/* Chapter 11.12: USEFUL METHODS FOR THE ARRAY CLASS
 * Java provides the methods for creating a list from an array, for sorting a list, and finding maximum and minimum 
 * element in a list, and for shuffling a list.
 * 
 * Creating an ArrayList from an array of objects:
String[] array = {"red", "green", "blue"};
ArrayList<String> list = new ArrayList<>(Arrays.asList(array));

The static method asList in the Arrays class returns a list that is passed to the ArrayList constructor for creating an 
ArrayList. 

Conversely, you can use the following code to create an array of objects from an array list.
String[] array1 = new String[list.size()]; 
list.toArray(array1);

If the elements in a list are comparable such as integers, double, or strings, you can use the static sort method in the 
java.util.Collections class to sort the elements. 
Here are examples:
Integer[] array = {3, 5, 95, 4, 15, 34, 3, 6, 5}; 
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array)); 
java.util.Collections.sort(list);
System.out.println(list);

You can use the static max and min in the java.util.Collections class to return the maximum and minimal element in a list. 
Here are examples:
Integer[] array = {3, 5, 95, 4, 15, 34, 3, 6, 5}; 
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array)); 
System.out.println(java.util.Collections.max(list)); 
System.out.println(java.util.Collections.min(list));

You can use the static shuffle method in the java.util.Collections class to perform a random shuffle for the elements in 
a list. Here are examples:
Integer[] array = {3, 5, 95, 4, 15, 34, 3, 6, 5}; 
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array)); 
java.util.Collections.shuffle(list);
System.out.println(list);
 */

public class _11_12_ArrayList_ClassNMethods
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		ArrayList <String> cityList = new ArrayList <> ();
		
		/* Since the ArrayList is in the java.util package, it is imported (at the top). 
		 * The program creates an ArrayList of strings using its no-arg constructor and assigns the reference to cityList. 
		 * The add methods below adds strings to the end of list.
		 */
		// Add some cities in the list
		cityList.add("London");								// cityList now contains [London] 
		cityList.add("Denver");								// cityList now contains [London, Denver] 
		cityList.add("Paris");					// cityList now contains [London, Denver, Paris] 
		cityList.add("Miami");					// cityList now contains [London, Denver, Paris, Miami] 
		cityList.add("Seoul");					// Contains [London, Denver, Paris, Miami, Seoul] 
		cityList.add("Tokyo");					// Contains [London, Denver, Paris, Miami, Seoul, Tokyo]
		//you can think of cityList refVar as one object/instance of the ArrayList class (obj.method)

		System.out.println("List size is " + cityList.size());					//6
		System.out.println("Is \"Montreal\" in the list? " + cityList.contains("Montreal"));				//false
		System.out.println("The index/location of Denver in the list is at " + cityList.indexOf("Denver"));			//1
		
		// Insert a new city at index 2
		cityList.add(2, "Xian");
		// Remove a city from the list
		cityList.remove("Miami");
		//Now it contains  [London, Denver, Xian, Paris, Seoul, Tokyo]
	
		// Remove a city at index 1
		cityList.remove(1);
		//Now it contains  [London, Xian, Paris, Seoul, Tokyo]
		
		// Display the contents in the list
		System.out.println(cityList.toString());					// [London, Xian, Paris, Seoul, Tokyo]
		
		// Display the contents in the list in reverse order
		for (int i = (cityList.size() - 1); i >= 0; i--)
		{
			System.out.print(cityList.get(i) + "\t");						//Tokyo	Seoul	Paris	Xian	London	
		}										//Remember ArrayList is a CLASS, so you have to use the getter (methods) to access 
		
		System.out.println();
		
		cityList.set(4, "Xian");		//sets E Xian to index 4 (last in the list)
		cityList.set(1, "Tokyo");
		
		//Previously it was [London, Xian, Paris, Seoul, Tokyo]....we've moved Xian to index 4 and Tokyo to index 1 
		//We've essentially swapped their position.
		
		System.out.println(cityList.toString());				//[London, Tokyo, Paris, Seoul, Xian
		
		//cityList.clear();														//removes ALL elements
		//System.out.println(cityList.toString());			// [ ] (i.e. empty)
		System.out.println(cityList.isEmpty());	 			//true
		
		
		/* FOR OBJECTS: 
		 * / Create a list to store two circles
		ArrayList<CircleFromSimpleGeometricObject> list = new ArrayList<>();
		So basically, ArrayList <className> refVar = new ArrayList <> ();
		
	// Add two circles													Radius
	list.add(new CircleFromSimpleGeometricObject(2)); 				//refVar.add(new ClassName());
	list.add(new CircleFromSimpleGeometricObject(3));
// Display the area of the first circle in the list
System.out.println("The area of the circle? " + list.get(0).getArea());
		 */											//refVar.get(index).....NOT refVar[i].method
		
		//distinctNums();
		
		String [] arrayObj = {"Red", "Blue", "Purple"};
		
		//System.out.println(arrayObj[2]);		Purple
		
		ArrayList <String> arObjList = new ArrayList <> (Arrays.asList(arrayObj));
		//^Puts the arrayObj refVar into an ArrayList							Arrays.asList(refVar)
		//System.out.println(arObjList.toString());  				//	[Red, Blue, Purple]
		
		//conversely, ArrayList to regular array:
		//Say we wanna put the cityList into a regular array of obj:
		String [] cities = new String [cityList.size()];				//creating it
		cityList.toArray(cities);
		
		for (String e: cities)
		{
			System.out.println(e);			//London, Tokyo...prints all 5
		}
		
		//Integer class so we can put it on arraylist and sort using collection
		Integer [] unsortedNums = {3, 5, 95, 4, 15, 34, 3, 6, 5}; 
		
		//int [] unsortedNums = {....} wouldn't work cuz to use ArrayList, array above must be array of Obj (Integer class here)
		ArrayList <Integer> sortedNums = new ArrayList <> (Arrays.asList(unsortedNums));
		Collections.sort(sortedNums);
		
		System.out.println(sortedNums.toString());			//[3, 3, 4, 5, 5, 6, 15, 34, 95]
		//if I want the max (or min) valu:
		System.out.println(Collections.max(sortedNums));	//95
		//if you wanna shuffle em do Collections.shuffle(sortedNums);
		
	}
	
	public static void distinctNums()
	{
		/*  program that prompts the user to enter a sequence of numbers and displays the distinct numbers in the 
		 * sequence. Assume that the input ends with 0 and 0 is not counted as a number in the sequence.
		 */
		
		System.out.println("Enter an integer (0 to exit): ");
		int value;
		ArrayList <Integer> list = new ArrayList<> ();
		
		do
		{
			value = kb.nextInt();
			
			if (!list.contains(value) && value != 0)
			{
				list.add(value);
			}
		} while (value != 0);
		
		//System.out.println(list.toString());			or you could use for each (for arrayList)
		/* for (elementType element: arrayList) 
		 * {
		 *  // Process the element
			}																						*/
	/*	for (int e: list)
		{
			System.out.println(e);
		} */
		
		
	}  
		
		

}


