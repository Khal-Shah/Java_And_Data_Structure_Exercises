package ch10exercises.Ch10_02_BMI;


/* Chapter 10 - Exercise 2:
 * -name: String -age: int -weight: double -height: double
 * +BMI(name: String, age: int, weight: double, height: double)
 *
 * Creates a BMI object with the specified name, weight, height, and a default age 20.
 * +BMI(name: String, weight: double, height: double)
 *
 * +getBMI(): double
 * +getStatus(): String
 * +getter methods
 * Construct a BMI with the specified name, age, weight,
 * feet, and inches: public BMI(String name, int age, double weight, double feet, double inches)
 *
 * Enter weight in pounds: 95.5
			Enter height in inches: 50
			BMI is 26.8573
 */
        //By Khaled Shah

public class Ch10_02_BMI_Driver
{
    public static void main(String[] args)
    {
        BMI person1 = new BMI("Khaled", 34, 164, 5, 8);
        System.out.println("BMI of " + person1.getName() + " is " + person1.getBMI() + " which is " + person1.getStatus());
        System.out.println("Height of " + person1.getName() + " is " + person1.getHeight() + "\"");

        BMI person2 = new BMI("Jane Doe", 95.5, 50);
        System.out.println("BMI of " + person2.getName() + " is " + person2.getBMI() + " which is " + person2.getStatus());
    }
}
