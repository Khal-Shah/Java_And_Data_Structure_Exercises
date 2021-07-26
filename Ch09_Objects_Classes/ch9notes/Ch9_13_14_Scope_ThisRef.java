package ch9notes;

/* 9.13: THE SCOPE OF VARIABLE:
 * The scope of instance and static variables is the entire class, regardless of where the variables are declared.
 * Convention is to declare the variables at the start of the class, but you can declare them anywhere in the class in any
 * order, meaning you could declare/initialize/assign them AFTER the methods that use them.
 * The only exception is when the variable depends on another variable, then that other variable it depends on has to be 
 * declared first. Ex: int i = 1,  has to come before j because j depends on it.
 * int j = 5 * i
 * 
 * If a local variable (var inside a meth) has the same name as a class’s variable, the local variable takes precedence and 
 * the class’s variable with the same name is hidden. So if you call that method, the value of var defined inside the meth will
 *  take precedence. 
 */

public class Ch9_13_14_Scope_ThisRef
{

	public static void main(String[] args)
	{
		/* 9.14: THE THIS REFERENCE
		 * The keyword this refers to the object itself. It can also be used inside a constructor to invoke another constructor 
		 * of the same class.
		 * 
		 * public class Circle 
		 * { private double radius;
...
			public double getArea() {
			return this.radius * this.radius * Math.PI; }
			
			public String toString() {
			return "radius: " + this.radius + "area: " + this.getArea() ; }
			}
		 *  is equivalent to 
		 *  public class Circle 
		 *  { private double radius;
...
				public double getArea() {
				return radius * radius * Math.PI;	}
				
				public String toString() { return "radius: " + radius + "area: " + getArea() ; }
				}
		 */
		
		/* public class F 																	Suppose that f1 and f2 are two objects of F.
		 * {
			private int i = 5;															Invoking f1.setI(10) is to execute
			private static double k = 0;											this.i = 10, where this refers f1
		
			public void setI(int i) { 													Invoking f2.setI(45) is to execute
			this.i = i;						}													this.i = 45, where this refers f2
			
			public static void setK(double k) { 						Invoking F.setK(33) is to execute
			F.k = k;												}						F.k = 33. setK is a static method		(don't need to use this cuz static)
			}
		 * The this keyword can be used to reference a class’s hidden data fields. For example, a data- field name is often 
		 * used as the parameter name in a setter method for the data field. In this case, the data field is hidden in the setter 
		 * method. (because remember scope of variable says that when the same variable names used in methods and in 
		 * data-fields, the method one will take precedence and make the data-field one hidden).
		 * You need to reference the hidden data-field name in the method in order to set a new value to it. 
		 * A hidden static variable can be accessed simply by using the ClassName.staticVariable reference. A hidden 
		 * instance variable can be accessed by using the keyword this, as shown in the above program (class F).
		 * {The keyword this refers to the calling object that invokes the method.}
		 * 
		 * The this keyword gives us a way to reference the object that invokes an instance method. To invoke f1.setI(10),
		 * this.i = i is executed (assign the parameter passed as the value of THIS OBJECT'S data-field i), 
		 * which assigns the value of parameter i (10) to the data field i of this calling object f1. 
		 * The keyword this refers to the object that invokes the instance method setI...
		 * The line F.k = k means that the value in parameter k is assigned to the static data field k of the class, which is shared 
		 * by all the objects of the class.
		 * 
		 * public class Circle 
		 * {
			private double radius;
			
			Java requires that the this(arg-list) statement appear first in the constructor before any other executable statements.
			public Circle(double radius) { 			The this keyword is used to reference the hidden 
			this.radius = radius;					} 			data field radius of the object being constructed.
		
			public Circle() { 
			this(1.0);			   } 									The this keyword is used to invoke another constructor.
...								The line this(1.0) in the second constructor invokes the first constructor with a double value argument.
			}
		 */

	}

}
