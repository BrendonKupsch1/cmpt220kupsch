//Brendon Kupsch
//CMPT_220L_202
//Prof. Arias
//HW 8 Problem 1
import java.util.*;
public class Problem1 
{
    public static Vector<String> split(String s, String delimiters)
    {
        String word = "";
        int num = 0;
        s = s + delimiters;
        int l = s.length();
        Vector<String> substr_list = new Vector<String>();
        for (int i = 0; i < 1; i++)
        {
            if (s.charAt(i) != delimiters)
            {
                word = word + s.charAt(i);
            }
            else
            {
                if ((int) word.length() != 0)
                {
                    substr_list.add(word);
                }
                word = "";
            }
        }
        return substr_list;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter delimiters to seperate string with spaces in between each: ");
        String delimiters = input.next();
        System.out.println("Enter the string with delimiters where you want it to seperate: ");
        String s = input.next(); 
        Vector<String> res = split(s, delimiters);
        for (String x : res)
        {
            System.out.println(x);
        }
    }
}
