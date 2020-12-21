package ch12notes.old;
import java.util.Scanner;

import java.io.FileNotFoundException;

public class _11_12_File_IO_Web
{

	public static void main(String[] args) throws FileNotFoundException
	{
		//an example that creates an instance of PrintWriter and writes two lines to the file scores.txt
		java.io.File file = new java.io.File("scores.txt");
		
		if (file.exists())
		{
			System.out.println("File already exists.");
			System.exit(1);
		}
		//create a file
			java.io.PrintWriter output = new java.io.PrintWriter(file);

			// Write formatted output to the file
			output.print("John T Smith: ");
			output.println(90);
			output.print("Eric K Jones: ");
			output.println(85);
	
			output.close();
			//The close() method must be used to close the file (line 19). If this method is not invoked, the data may not be
			//saved properly in the file.

			//Now read the data (to console) using scanner
			Scanner input = new Scanner (file);
			String score1 = input.nextLine();
			String score2 = input.nextLine();
			System.out.println(score1 + "\n" + score2);

			input.close();
	}

}
