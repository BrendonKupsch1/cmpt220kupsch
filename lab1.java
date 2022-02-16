import java.util.Scanner;
public class lab1 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        //Problem 1
        System.out.println("Input two numbers to multiply them: ");
        int mult1 = input.nextInt();
        int mult2 = input.nextInt();
        System.out.println("The product of your two numbers is " + (mult1 * mult2) + ".");

        //Problem 2 
        System.out.println("Input a number to see its multiplication table up to 10: ");
        int  tablenum = input.nextInt();
        System.out.println(tablenum + " times 2 = " + (tablenum * 2));
        System.out.println(tablenum + " times 3 = " + (tablenum * 3));
        System.out.println(tablenum + " times 4 = " + (tablenum * 4));
        System.out.println(tablenum + " times 5 = " + (tablenum * 5));
        System.out.println(tablenum + " times 6 = " + (tablenum * 6));
        System.out.println(tablenum + " times 7 = " + (tablenum * 7));
        System.out.println(tablenum + " times 8 = " + (tablenum * 8));
        System.out.println(tablenum + " times 9 = " + (tablenum * 9));
        System.out.println(tablenum + " times 10 = " + (tablenum * 10));

        //Problem 3 
        System.out.println("Input three numbers you want to take the average of: ");
        double avg1 = input.nextDouble();
        double avg2 = input.nextDouble();
        double avg3 = input.nextDouble();
        System.out.println("The average of your three numbers is " + ((avg1 + avg2 + avg3) / 3) + ".");
        
        //Problem 4
        System.out.println("Enter the width and height of a rectangle for the perimeter, area, and the length of the diagonal: ");
        double rec1 = input.nextDouble();
        double rec2 = input.nextDouble();
        System.out.println("The perimeter is " + ((rec1 * 2 ) + (rec2 * 2)) + ".");
        System.out.println("The area is " + (rec1 * rec2) + ".");
        System.out.println("The length of the diagonal is " + (Math.pow((Math.pow(rec1, 2)) + (Math.pow(rec2, 2)), .5) + "."));

        //Problem 5 
        System.out.println("Enter the coordinates for two points (x1,y1) (x2, y2): ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        System.out.println("The slope for the two points (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is " + ((y2 - y1) / (x2 - x1)));
        
        //Problem 6
        System.out.println("Enter a 4 digit number: ");
        int rev = input.nextInt();
        int flip = rev/1000;
        int rem = rev % 1000;
        flip += rem/100 *10;
        rem %= 100;
        flip += rem/10 *1000;
        System.out.print(flip);
        
    }
    
}
