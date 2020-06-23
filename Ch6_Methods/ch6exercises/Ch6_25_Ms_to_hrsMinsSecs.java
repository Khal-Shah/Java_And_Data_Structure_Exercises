package ch6exercises;

/* Chapter 6 - Exercise 25:
 * (Convert milliseconds to hours, minutes, and seconds) Write a method that converts milliseconds to hours, 
 * minutes, and seconds using the following header:
public static String convertMillis(long millis)

The method returns a string as hours:minutes:seconds. 
For example, convertMillis(5500) returns a string 0:0:5, 
convertMillis(100000) returns a string 0:1:40, 
and convertMillis(555550000) returns a string 154:19:10.
 */
		//By Khaled Shah

public class Ch6_25_Ms_to_hrsMinsSecs
{

	public static void main(String[] args)
	{
		System.out.println(convertMillis(5500));
		System.out.println(convertMillis(100000));
		System.out.println(convertMillis(555550000));

	}
	
	public static String convertMillis(long millis)
	{
		long total_ms =  millis;
		long total_s = (total_ms) / 1000;
		long current_s = (total_s % 60);
		
		long total_min = (total_s / 60);
		long current_min = (total_min % 60);
		
		long total_hr = (total_min / 60);
		//long current_hr = (total_hr % 24);
		
		return (total_hr + ":" + current_min + ":" + current_s);
	}

}
