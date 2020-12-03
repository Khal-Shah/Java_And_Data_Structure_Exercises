package ch11notes.oldnotes.geometricobjects;

/* EXAMPLE: 
 * A general class GeometricObject can be used to model all geometric objects. This class contains the properties color 
 * and filled and their appropriate getter and setter methods. Assume that this class also contains the dateCreated property 
 * and the getDateCreated() and toString() methods. The toString() method returns a string representation of the object. 
 * 
 * Since a circle is a special type of geometric object, it shares common properties and methods with other geometric 
 * objects. Thus it makes sense to define the Circle class that extends the GeometricObject class. 
 * Likewise, Rectangle can also be defined as a subclass of GeometricObject. 
 */

public class GeometricObject
{
		private String color;
		private boolean filled;
		private java.util.Date dateCreated;	//have to import java class, same way we could use pvt import java.util.Scanner kb;
		
		GeometricObject()					//default
		{
			color = "white";
			filled = false;
			dateCreated = new java.util.Date();
		}
		
		GeometricObject (String color, boolean filled)
		{
			this.color = color;
			this.filled = filled;
			dateCreated = new java.util.Date();
		}
		
		public String getColor()
		{
			return color;
		}
		
		public void setColor (String color)
		{
			this.color = color;
		}
		
		public boolean isFilled()											//"getFilled" but since boollean convention is to name it isX
		{
			return filled;
		}
		
		public void setFilled (boolean filled)
		{
			this.filled = filled;
		}
		
		public java.util.Date getDateCreated()			//pretty much have to use java.util.Date every time referencing Date class
		{
			return dateCreated;
		}
		
		//Return a string representation of this object (return all the instance variables/attributes)
		public String toString()
		{
		return ("created on " + getDateCreated() + ". Color: " + getColor() + ((isFilled())? ". It is filled\n" : " It is not filled.\n"));
		}
		
	}

