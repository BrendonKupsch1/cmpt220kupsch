// ***************************************************************
// Salary.java
// Computes the raise and new salary for an employee
// ***************************************************************
import java.util.Scanner;
public class Salary 
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        // Get the current salary and performance rating
        System.out.print("Enter the current salary: $");
        double currentSalary = input.nextDouble();
        System.out.print ("Enter the performance rating: ");
        double rating = input.nextDouble();
        // Compute the raise -- Use if ... else ...
        // Print the results
        if (rating == 1)
        {
            double raise = (int)((currentSalary * 1.06) * 100)/100.0;
            System.out.println("Amount of your raise: $" + (int)((currentSalary * .06) * 100)/100.0);
            System.out.println("Your new salary: $" + raise);
        }
        else if (rating == 2)
        {
            double raise = (int)((currentSalary * 1.04) * 100)/100.0;
            System.out.println("Amount of your raise: $" + (int)((currentSalary * .04) * 100)/100.0);
            System.out.println("Your new salary: $" + raise);
        }
        else if (rating == 3)
        {
            double raise = (int)((currentSalary * 1.015) * 100)/100.0;
            System.out.println("Amount of your raise: $" + (int)((currentSalary * .015) * 100)/100.0);
            System.out.println("Your new salary: $" + raise);
        }
        input.close();
    }
}