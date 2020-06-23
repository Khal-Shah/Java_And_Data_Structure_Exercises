package ch9exercises;

/* Chapter 9 - Exercise 2:
 * The Stock class) Following the example of the Circle class in Section 9.2, design a class named Stock that contains:
 * 
■ A string data field named symbol for the stock’s symbol.
■ A string data field named name for the stock’s name.
■ A double data field named previousClosingPrice that stores the stock price for the previous day.
■ A double data field named currentPrice that stores the stock price for the current time.
■ A constructor that creates a stock with the specified symbol and name.
■ A method named getChangePercent() that returns the percentage changed from previousClosingPrice to currentPrice.

Draw the UML diagram for the class and then implement the class. Write a test program that creates a Stock object with the 
stock symbol ORCL, the name Oracle Corporation,and the previous closing price of 34.5. Set a newcurrentprice to 34.35 
and display the price-change percentage.
 */
		//By Khaled Shah


public class Ch9_02_Stock_Class
{

	public static void main(String[] args)
	{
		Stock stockObject = new Stock ("ORCL", "Oracle Corporation");
		stockObject.setPreviousClosingPrice(34.5);
		stockObject.setCurrentPrice(34.35);
		
		System.out.println("The price-change is " + stockObject.getChangePercent() + "%");
		

	}

}

class Stock
{
	private String symbol;
	private String name;
	private double previousClosingPrice;
	private double currentPrice;
	
	Stock (String newSymbol, String newName)
	{
		symbol = newSymbol;
		name = newName;
	}
	
	public double getChangePercent ()
	{
		return ((previousClosingPrice - currentPrice) / previousClosingPrice) * 100;
	}
	
	public void setPreviousClosingPrice (double newClosingPrice)
	{
		previousClosingPrice = newClosingPrice;
	}
	
	public double getPreviousClosingPrice ()
	{
		return previousClosingPrice;
	}
	
	public void setCurrentPrice (double newCurrentPrice)
	{
		currentPrice = newCurrentPrice;
	}
	
	public double getCurrentPrice ()
	{
		return currentPrice;
	}
	
}
