import java.util.Scanner;
public class Problem3 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();
        System.out.println("Which digit would you like to see the occurunce of: ");
        int intDigit = input.nextInt();
        char charDigit = (char)(intDigit + 48);
        System.out.println("Digit " + charDigit + " occurs " + countChar(str, charDigit) + " times.");
    }
    public static int countChar(String str, char c)
    {
    int count = 0;
    for(int i=0; i < str.length(); i++)
    {    
        if(str.charAt(i) == c)
            count++;
    }
    return count;
    }
}
