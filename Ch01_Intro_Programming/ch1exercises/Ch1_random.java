package ch1exercises;


/* Chapter 1 - Exercise 12:
	 *  (Average speed in kilometers) Assume a runner runs 24 miles in 1 hour, 40 minutes, and 35 seconds. 
	 *  Write a program that displays the average speed in kilometers per hour. (Note that 1 mile is 1.6 kilometers.)
	 */

class Ch1_random
{
	/* 1 hr 40 mins and 35 secs ===> hr
	 * 1 hr = 3600 secs 
	 * 40 mins: 40mins * (60 sec / 1 min) 
	 * + 35 secs
	 * total secs = 3600 + 35 + (40 * 60)
	 * secs to hr: [600 + 35 + (40 * 60)] secs * (1 hr / 3600 sec)
	 */
	final static double HR = ((3600 + 35 + (40 * 60)) / 3600.0);
	final static double KM = 24 * 1.6;
	
	final static double RADIUS = 5.5;

	public static void main(String[] args)
	{
	
		//System.out.println(KM / HR);
		
		/* Chapter 1 - Exercise 6:
		 * (Summation of a series) Write a program that displays the result of:
		 * 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9.
		 */
		/*
		System.out.print("The result is ");
		int sum = 0;
		
		for (int i = 1;  i <= 9; i++)
		{
			sum += i;
		}
		
		System.out.println(sum);*/
		
		/* Chapter 1 - Exercise 7:
		 * (Approximate π) π can be computed using the following formula:
		 *  pi = 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 +...)
		 */
		
		/*System.out.print("π is ");
		double pi = 0;
		double negDeno = 0;
		double posDeno = 0;
		
		for (int i = 3; i <= 300; i += 4)
		{
			negDeno -= 1.0 / i;
			posDeno += 1.0 / (i + 2);
		}
		
		pi = 4 * (1 + posDeno + negDeno);
		
		System.out.println(pi);*/
		
		/* Chapter 1 - Exercise 8:
		 * (Area and perimeter of a circle) Write a program that displays the area and perimeter of a circle that has a radius 
		 * of 5.5 meter using the following formula:
		 * perimeter = 2 * radius * pi 
		 * area = radius * radius * pi
		 */
/*		
		double perimeter = 2 * RADIUS * Math.PI;
		double area = RADIUS * RADIUS * Math.PI;
		
		System.out.print("Area is " + area + " and perimeter is " + perimeter);
		*/
		
		/* Chapter 1 - Exercise 11:
		 * (Population projection) The U.S. Census Bureau projects population based on the following assumptions:
		 * ■ One birth every 7 seconds
			■ One death every 13 seconds
			■ One new immigrant every 45 seconds
			
			Write a program to display the population for each of the next five years. Assume the current population is 
			312,032,486 and one year has 365 days. Hint: In Java, if two integers perform division, the result is an integer. 
			The fractional part is truncated. For example, 5 / 4 is 1 (not 1.25) and 10 / 4 is 2 (not 2.5). To get an accurate result 
			with the fractional part, one of the values involved in the division must be a number with a decimal point. 
			For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.
		 */
		
		int currentPop = 312_032_486;
		int year = 2019;
		
		//one birth every 7 seconds: 1 birth / 7 seconds * (60 secs / min) * (60 min / hr) * (24 hr / day) * (365 day/yr)
		
		double perYear =  60 * 60 * 24 * 365;
		int projection = currentPop;
		
		System.out.println("The population for " + year + " is " + projection);
		
		for (int i = 1; i <= 5; i++)
		{
			year++;
			projection += (1 / 7.0) * perYear - (1 / 13.0) * perYear + (1 / 45.0) * perYear;
			System.out.println("The projection for " + year + " is " + projection);
			
		}
		
		
		
		

	}

}
