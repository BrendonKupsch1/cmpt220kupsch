//Brendon Kupsch
//CMPT_220L_202
//Prof. Arias
//HW 3 Problem 3
import java.util.Scanner;
public class Problem3 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the coordinates for two points (x1, y1) and (x2, y2): ");
        System.out.println("x1");
        double x1 = input.nextDouble();
        System.out.println("y1");
        double y1 = input.nextDouble();
        System.out.println("x2");
        double x2 = input.nextDouble();
        System.out.println("y2");
        double y2 = input.nextDouble();
        double m = ((y2 - y1) / (x2 - x1));
        m = Math.round(m*Math.pow(10,5))/Math.pow(10,5);
        double b = (y1 - (m * x1));
        b = Math.round(b*Math.pow(10,5))/Math.pow(10,5);
           
        if (m == 1)
        {
            if (b == 0)
            {
                System.out.println("The line equation for the two points (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is y = x.");
            }
            else
            {
                System.out.println("The line equation for the two points (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is y = x + " + b + ".");
            }
        }
        else if (b == 0)
        {
            if (m == 1)
            {
                System.out.println("The line equation for the two points (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is y = x.");
            }
            else
            {
                System.out.println("The line equation for the two points (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is y = " + m + "x.");
            }
        }
        else 
        {
            System.out.println("The line equation for the two points (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is y = " + m + "x + " + b + ".");
        }
    }
}
