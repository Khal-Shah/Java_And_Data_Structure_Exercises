package ch4exercises;
import java.util.Scanner;

public class Ch4_03_Area_Enclosed_byCities

		/* Chapter 4 - Exercise 3:
		 * (Geography: estimate areas) Find the GPS locations for Atlanta, Georgia; Orlando, Florida; Savannah, Georgia; 
		 * and Charlotte, North Carolina from www.gps-data-team.com/map/ and compute the estimated area enclosed 
		 * by these four cities. (Hint: Use the formula in Programming Exercise 4.2 to compute the distance between two cities. 
		 * Divide the polygon into two triangles and use the formula in Programming Exercise 2.19 to compute the area of a 
		 * triangle.)
		 * 
		 * (From 4.2) distance = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2)) 	(radius is 6,371.01 km)
		 * 
		 *  (From 2.19) area = Math.sqrt[s (s - side1) * (s - side2) * (s - side3)] where s = (side1 + side2 + side3) / 2
		 */ 
				// By Khaled Shah
{
	static Scanner kb = new Scanner (System.in);
	
	static final double RADIUS = 6371.01; 
	
	static final double ATLANTA_X = Math.toRadians(33.7405800);
	static final double ATLANTA_Y = Math.toRadians(-84.5545400);
	
	static final double ORLANDO_X = Math.toRadians(28.4115300);
	static final double ORLANDO_Y = Math.toRadians(-81.5250400);
	
	static final double SAVANNAH_X = Math.toRadians(32.1170839);
	static final double SAVANNAH_Y = Math.toRadians(-81.2462386);
	
	static final double CHARLOTTE_X = Math.toRadians(35.2072400);
	static final double CHARLOTTE_Y = Math.toRadians(-80.9567600);
	
	//distance = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2)) 	(radius is 6,371.01 km)
	
	static final double D_ATL_ORL = RADIUS * Math.acos((Math.sin(ATLANTA_X) * Math.sin(ORLANDO_X)) + 
										(Math.cos(ATLANTA_X) * Math.cos(ORLANDO_X) * Math.cos(ATLANTA_Y - ORLANDO_Y))); 
	
	static final double D_ATL_SAV = RADIUS * Math.acos((Math.sin(ATLANTA_X) * Math.sin(SAVANNAH_X)) + 
			(Math.cos(ATLANTA_X) * Math.cos(SAVANNAH_X) * Math.cos(ATLANTA_Y - SAVANNAH_Y))); 
	
	static final double D_ATL_CHAR = RADIUS * Math.acos((Math.sin(ATLANTA_X) * Math.sin(CHARLOTTE_X)) + 
			(Math.cos(ATLANTA_X) * Math.cos(CHARLOTTE_X) * Math.cos(ATLANTA_Y - CHARLOTTE_Y))); 
	
	static final double D_ORL_SAV = RADIUS * Math.acos((Math.sin(ORLANDO_X) * Math.sin(SAVANNAH_X)) + 
			(Math.cos(ORLANDO_X) * Math.cos(SAVANNAH_X) * Math.cos(ORLANDO_Y - SAVANNAH_Y)));
	
	static final double D_ORL_CHAR = RADIUS * Math.acos((Math.sin(ORLANDO_X) * Math.sin(CHARLOTTE_X)) + 
			(Math.cos(ORLANDO_X) * Math.cos(CHARLOTTE_X) * Math.cos(ORLANDO_Y - CHARLOTTE_Y))); 
	
	static final double D_SAV_CHAR = RADIUS * Math.acos((Math.sin(SAVANNAH_X) * Math.sin(CHARLOTTE_X)) + 
			(Math.cos(SAVANNAH_X) * Math.cos(CHARLOTTE_X) * Math.cos(SAVANNAH_Y - CHARLOTTE_Y))); 
	
	public static void main(String[] args)
	
	{
		double s1 = (D_ATL_ORL + D_ATL_SAV + D_ATL_CHAR) / 2.0;
		double s2 = (D_ORL_SAV + D_ORL_CHAR + D_SAV_CHAR) / 2.0;
		// area = Math.sqrt[s (s - side1) * (s - side2) * (s - side3)] 
		double area1 = Math.sqrt(s1 * (s1 - D_ATL_ORL) * (s1 - D_ATL_SAV) * (s1 - D_ATL_CHAR));
		double area2 = Math.sqrt(s2 * (s2 - D_ORL_SAV) * (s2 - D_ORL_CHAR) * (s2 - D_SAV_CHAR));
		double totalArea = area1 + area2;
		
		System.out.printf("The estimated area enclosed by these 4 cities is: %.2f km", totalArea);

	}

}
