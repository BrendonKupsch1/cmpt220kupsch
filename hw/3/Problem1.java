//Brendon Kupsch
//CMPT_220L_202
//Prof. Arias
//HW 3 Problem 1
import java.util.Scanner;
public class Problem1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("In your quadratic equation (ax^2 + bx + c) enter the values for a, b, and c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double disc = (Math.pow(b, 2) - (4 * a * c));
        if  (disc > 0.0)
        {
            double root1 = ((-b + Math.pow(disc, .5)) / (2 *a));
            root1 = Math.round(root1*Math.pow(10,5))/Math.pow(10,5);
            double root2 = ((-b - Math.pow(disc, .5)) / (2 *a));
            root2 = Math.round(root2*Math.pow(10,5))/Math.pow(10,5);
            System.out.println("The equation has two roots, " + root1 + " and " + root2 + ".");
        }
        if (disc == 0)
        {
            double root1 = ((-b + Math.pow(disc, .5)) / (2 *a));
            System.out.println("The equation has one root, " + root1 + ".");
        }
        if (disc < 0)
        {
            System.out.println("The equation has no real roots.");
        }
        input.close();
    }
}