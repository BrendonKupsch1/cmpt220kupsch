import java.util.Scanner;
public class ConsecutiveCharacters 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.next();
        char lastLetter = str.charAt(0);
        int repeat = 0;
        for(int i = 1; i < str.length(); i++)
        {
            if(lastLetter == (str.charAt(i)))
            {
                repeat++;
            }
            lastLetter = str.charAt(i);
        }
        System.out.println("the number of consecutive repeating characters is " + repeat);
        input.close();
    }
}
