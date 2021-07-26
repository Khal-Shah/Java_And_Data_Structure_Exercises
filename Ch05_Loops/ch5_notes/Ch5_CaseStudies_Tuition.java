package ch5_notes;
import java.util.*;

	/* 
	 * Suppose that the tuition for a university is $10,000 this year and tuition increases 7% every year. In how many 
	 * years will the tuition be doubled?
	 */
public class Ch5_CaseStudies_Tuition
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		double tuition = 10_000;	//so double = 20_000
		int year = 0;
		
		do
		{
			year++;
			tuition += (tuition * 0.07);
		} while (tuition <= 20000);
			
		System.out.printf("The tuition will double after %d years. \nTuition will be $%.2f then.", year, tuition);

	}

}
