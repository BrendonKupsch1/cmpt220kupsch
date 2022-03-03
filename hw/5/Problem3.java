//Brendon Kupsch
//CMPT_220L_202
//Prof. Arias
//HW 5 Problem 3
import java.util.Scanner;
public class Problem3 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a phrase to capitalize each word of it: ");
        String phrase = input.next();
        System.out.println(title(phrase));
    }
    public static String title(String s)
    {
        String words[]=s.split("\\s");  
        String capitalizeWord="";  
        for(String w:words){  
            String first=w.substring(0,1);  
            String afterfirst=w.substring(1);  
            capitalizeWord+=first.toUpperCase()+afterfirst+" ";  
        }  
        return capitalizeWord.trim();  
    }
}