//Brendon Kupsch
//CMPT_220L_202
//Prof. Arias
//Project 1 
import java.util.Scanner;
public class Project1 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int repeat = 0;
        for(int i =1; repeat < 1;)
        {
            System.out.println("Please enter the first integer and the mean of the two integers (numbers must be between -1000 and 1000) to find the second integer: ");
            int s1 = input.nextInt();
            int t = input.nextInt();
            if (s1 >= -1000 && s1 <= 1000 && t >= -1000 && t <= 1000)
            {
                int s2 = (t * 2) - s1;
                System.out.println("The missing integer to get an average of " + t + " is " + s2 + ".");
                repeat++;
            }
            else
            {
                System.out.println("Improper entry of integers, please make sure your numbers are between -1000 and 1000.");
            }
        }  
        input.close();  
    }
}
