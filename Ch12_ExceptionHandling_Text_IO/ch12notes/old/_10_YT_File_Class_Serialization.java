package ch12notes.old;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/* Chapter 12.10: THE FILE CLASS:
 * The File class contains the methods for obtaining the properties of a file/directory and for renaming and deleting a 
 * file/directory.
 * 
 * Data stored in the program are temporary; they are lost when the program terminates. To permanently store the data 
 * created in a program, you need to save them in a file on a disk or other permanent storage device. The file can then be 
 * transported and read later by other programs. Since data are stored in files, this section introduces how to use the 
 * File class to obtain file/directory properties, to delete and rename files/directories, and to create directories. 
 
 * An absolute file name (or full name) contains a file name with its complete path and drive letter. For example, 
 * c:\book\ Welcome.java is the absolute file name for the file Welcome.java on the Windows operating system. 
 * Here c:\book is referred to as the directory path for the file. Absolute file names are machine dependent.
 *
 * A relative file name is in relation to the current working directory. The complete directory path for a relative file name is 
 * omitted. For example, Welcome.java is a relative file name. If the current working directory is c:\book, the absolute file 
 * name would be c:\book\Welcome.java.
 * The file must be in the relative path of the java/jar file that will be executed, not of the sources. –
 * 
 * The file name is a string. The File class is a wrapper class for the file name and its directory path. For example, 
 * new File("c:\\book") creates a File object for the directory c:\book, and new File("c:\\book\\test.dat") creates a File 
 * object for the file c:\book\test.dat, both on Windows. You can use the File class’s isDirectory() method to check whether 
 * the object represents a directory, and the isFile() method to check whether the object represents a file.
 */

/* YT: OBJECT SERIALIZATION:
 * Object serialization is the process of converting an object into a series of byes so they can be written to disk. 
 * Two concepts:
 * 1) Object to disk -> Serialization
 * 2) Disk to Object -> Deserialization
 * To add this capability to your java class, simply "implement" Serializable in the class definition. 
 * public class Student implements Serializable {				}
 * 
 * This type of IO uses streams of raw bytes. Contents of files are in a binary format. 
 * FileInputStream / FileOutputStream -  are used to read/write to file, treating it as bytes instead of text.
 * ObjectInputStream / ObjectOutputStream - Used to deserialize/serialize a data input stream back into an object
 */

public class _10_YT_File_Class_Serialization
{
	//static Scanner kb = new Scanner (System.in);

	public static void main(String[] args) throws IOException
	{
		/* Program below demonstrates how to create a File object and use the methods in the File class to obtain its 
		 * properties. The program creates a File object for the file us.gif. 
		 * This file is stored under the image directory in the current directory.
		 
		 or just File file =....since we imported java.io.File*/
		java.io.File file = new java.io.File("/Users/peoulshah/Documents/workspace/Liang/"
				+ "Ch12_ExceptionHandling_Text_IO/ch12notes/_10_11_File_Class_IO.java"); 
		
		/*System.out.println("Does it exist? " + file.exists()); 
		System.out.println("The file has " + file.length() + " bytes"); 
		System.out.println("Can it be read? " + file.canRead()); 
		System.out.println("Can it be written? " + file.canWrite()); 
		System.out.println("Is it a directory? " + file.isDirectory()); 
		System.out.println("Is it a file? " + file.isFile()); 
		System.out.println("Is it absolute? " + file.isAbsolute()); 
		System.out.println("Is it hidden? " + file.isHidden()); 
		System.out.println("Absolute path is " +	file.getAbsolutePath()); 
		System.out.println("Canonical path is " +	file.getCanonicalPath()); 
		System.out.println("Last modified on " + new java.util.Date(file.lastModified()));	*/
		
		//The File class can be used to obtain file properties and manipulate files, but cannot perform I/O.
		//Creating a File object does not create a file/directory on the disk.
	//	Class refVar = new Class (actual file name)
		File textFile = new File ("text.txt");		//create a text.txt file with refVar textFile (saves on the project folder Liang)
		
		try
		{
		//WRITE to this file (name and age)...You'll need to use the class PrintWriter to do it.
		PrintWriter pw = new PrintWriter(textFile);		//refVar of actual file
																//it's gonna write TO textFile...textFile is reference to the file text.txt
		pw.println("Name: Khal Shah");
		pw.println("Age: 66");
		pw.close();						//must (closes the file)
		}
		
		catch (IOException ex)
		{
			System.out.printf("ERROR: %s\n", ex);
		}
		//READ the file to the console
																//we don't want the input to be the keyboard, we want the input to be the file
		Scanner input = new Scanner (new File ("text.txt"));		//read the refVar of actual file created
		//could also use Scanner input = new Scanner (textFile);...Then put each line into var below:
		//String name = input.nextLine();	//save first line
		//String age = input.nextLine();		//save 2nd line
		System.out.println(input.nextLine() + "\n" + input.nextLine());	//print both lines
	}

}
