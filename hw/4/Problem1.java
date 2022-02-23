//Brendon Kupsch
//CMPT_220L_202
//Prof. Arias
//HW 4 Problem 1
import java.util.Scanner;
public class Problem1 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of sides of your polygon: ");
        double sides = input.nextDouble();
        System.out.println("Enter the length of your sides: ");
        double length = input.nextDouble();
        double area = (sides * Math.pow(length, 2)) / (4 * (Math.tan(Math.PI / sides)));
        System.out.println("The area of the polygon is: " + area + ".");
        input.close();
    }
    
}