package ch10exercises;


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

class BMI
{
    private String name;
    private int age;
    private double weight;
    private double height;
    public static final double KILOGRAMS_PER_POUND = 0.45359237;
    public static final double METERS_PER_INCH = 0.0254;


    public BMI(String name, int age, double weight, double height)
    {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public BMI(String name, double weight, double height)
    {
        this(name, 20, weight, height);
    }

    public BMI(String name, int age, double weight, double feet, double inches)
    {
        this(name, age, weight, (feet * 12) + inches);             //1ft = 12 inches
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public double getWeight()
    {
        return weight;
    }

    public double getHeight()
    {
        return height;
    }

    public double getBMI()
    {
        double bmi = weight * KILOGRAMS_PER_POUND / ((height * METERS_PER_INCH) * (height * METERS_PER_INCH));
        return (Math.round(bmi * 100) / 100.0);
    }

    public String getStatus()
    {
        String status = "";

        if(getBMI() < 18)
        {
            status = "underweight";
        }

        else if(getBMI() < 25)
        {
            status = "normal";
        }

        else if(getBMI() < 30)
        {
            status = "overweight";
        }

        else
        {
            status = "obese";
        }
        return status;
    }
}

public class Ch10_02_BMI
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
