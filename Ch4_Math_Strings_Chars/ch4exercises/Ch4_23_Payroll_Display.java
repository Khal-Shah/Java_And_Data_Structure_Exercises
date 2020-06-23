package ch4exercises;
import java.util.Scanner;

public class Ch4_23_Payroll_Display

		/* Chapter 4 - Exercise 23: 
		 * (Financial application: payroll) Write a program that reads the following information and prints a payroll statement:
			Employee’s name (e.g., Smith)
			Number of hours worked in a week (e.g., 10) 
			Hourly pay rate (e.g., 9.75)
			Federal tax withholding rate (e.g., 20%) 
			State tax withholding rate (e.g., 9%)

			A sample run is shown below:
			Enter employee's name: Smith
			Enter number of hours worked in a week: 10
			Enter hourly pay rate: 9.75
			Enter federal tax withholding rate: 0.20
			Enter state tax withholding rate: 0.09
			
			Employee Name: Smith
			Hours Worked: 10.0
			Pay Rate: $9.75
			Gross Pay: $97.5
			Deductions:
  			Federal Withholding (20.0%): $19.5
  			State Withholding (9.0%): $8.77
  			Total Deduction: $28.27
			Net Pay: $69.22
		 */
				// By Khaled Shah

{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.print("Employee's name: ");
		String employeeName = kb.nextLine();
		
		System.out.print("Number of hours worked in a week: ");
		double hoursWorkedWeek = kb.nextInt();
		
		System.out.print("Hourly rate: ");
		double hourlyRate = kb.nextDouble();
		
		System.out.print("Federal tax rate: ");
		double fedTax = kb.nextDouble();
		
		System.out.print("State tax rate:");
		double stateTax = kb.nextDouble();
		
		double grossPay = (hoursWorkedWeek * hourlyRate);
		double totalDeduction = (fedTax * grossPay) + (stateTax * grossPay);
		double netPay = grossPay - totalDeduction;
		
		System.out.printf("\nEmployee Name: %s\nHours Worked: %.1f\nPay Rate: $%.2f\nGross Pay: $%.2f\nDeductions: \n"
										+"Federal Withholding (%.1f%%): $%.2f\nState Withholding (%.1f%%): $%.2f\nTotal Deduction: "
										+ "$%.2f\nNet Pay: $%.2f", 
										 employeeName, hoursWorkedWeek, hourlyRate, grossPay, (fedTax * 100),
										 (fedTax * grossPay), (stateTax * 100), (stateTax * grossPay), totalDeduction,
										 netPay);
	}

}
