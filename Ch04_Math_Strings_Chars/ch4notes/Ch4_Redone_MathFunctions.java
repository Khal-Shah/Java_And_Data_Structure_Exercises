package ch4notes;

	/* This chapter introduces methods for performing common mathematical operations. You will learn how to create 
	 * custom methods in Chapter 6. 
		Java provides many useful methods in the Math class for performing common mathematical functions.
	 
	 * For TRIGS methods:
	 * Method														Description
		sin(radians)										Returns the trigonometric sine of an angle in radians.
		cos(radians)										Returns the trigonometric cosine of an angle in radians.
		tan(radians)										Returns the trigonometric tangent of an angle in radians.
		toRadians(degree)							Returns the angle in radians for the angle in degree. 			(Math.tan(Math.PI / 4))
		toDegree(radians)							Returns the angle in degrees for the angle in radians.
		asin(a)												Returns the angle in radians for the inverse of sine.
		acos(a)												Returns the angle in radians for the inverse of cosine.
		atan(a)												Returns the angle in radians for the inverse of tangent.
		
		^All Math.method 
		
		EXPONENTS:
		There are five methods related to exponents in the Math class as shown below:
		Method																			Description
		exp(x)																Returns e raised to power of x (e^x).								Math.exp(1) = 2.72
		log(x)																Returns the natural logarithm of x (ln(x) = loge(x)).
		log10(x)															Returns the base 10 logarithm of x (log10(x)).
		pow(a, b)														Returns a raised to the power of b (a^b).
		sqrt(x)																Returns the square root of x [x^(1/2)] for x >= 0.
		For example,
		Math.exp(1) returns 2.71828 
		Math.log(Math.E) returns 1.0 
		Math.log10(10) returns 1.0 
		Math.pow(2, 3) returns 8.0 			Math.pow(3, 2) returns 9.0 			Math.pow(4.5, 2.5) returns 22.91765 
		Math.sqrt(4) returns 2.0 				Math.sqrt(10.5) returns 4.24
		
		ROUNDING:
		The Math class contains five rounding methods as shown below:
		Method																							Description
		ceil(x)												x is rounded up to its nearest integer. This integer is returned as a double value.
		Math.ceil(2.1) returns 3.0													Math.ceil(2.0) returns 2.0
		Math.ceil(-2.0) returns -2.0 												Math.ceil(-2.1) returns -2.0
	
		floor(x)											x is rounded down to its nearest integer. This integer is returned as a double value.
		Math.floor(2.1) returns 2.0												Math.floor(2.0) returns 2.0 
		Math.floor(-2.0) returns –2.0 											Math.floor(-2.1) returns -3.0

		rint(x)			(round to int)					x is rounded up to its nearest integer. If x is equally close to two integers, the even 
																    one is returned as a double value.
		Math.rint(2.1) returns 2.0													Math.rint(-2.0) returns –2.0 
		Math.rint(-2.1) returns -2.0												Math.rint(2.5) returns 2.0  < even
		Math.rint(4.5) returns 4.0													Math.rint(-2.5) returns -2.0 <even
			
		round(x)												Returns (int)Math.floor(x + 0.5) if x is a float and returns (long)Math.floor(x + 0.5) 
																	if x is a double.
		Math.round(2.6f) returns 3 // Returns int 						Math.round(2.0) returns 2 // Returns long 
		Math.round(-2.0f) returns -2 // Returns int 					Math.round(-2.6) returns -3 // Returns long 
		Math.round(-2.4) returns -2 // Returns long														

		MIN & MAX & ABSOLUTE VALUE:
		The min and max methods return the minimum and maximum numbers of two numbers (int, long, float, or double). 
		For example, max(4.4, 5.0) returns 5.0, and min(3, 2) returns 2.
		The abs method returns the absolute value of the number (int, long, float, or double). 
		For example,
		Math.max(2, 3) returns 3								 Math.max(2.5, 3) returns 3.0 						Math.min(2.5, 4.6) returns 2.5 
		Math.abs(-2) returns 2 									 Math.abs(-2.1) returns 2.1
	 */

public class Ch4_Redone_MathFunctions
{

	public static void main(String[] args)
	{
		System.out.println(Math.exp(1));
	}

}
