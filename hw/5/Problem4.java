//Brendon Kupsch
//CMPT_220L_202
//Prof. Arias
//HW 5 Problem 4
import java.util.Scanner;
public class Problem4 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter total seconds: ");
        long seconds = input.nextLong();
        System.out.println(format(seconds));
    }
    public static String format(long seconds)
    {
        long min = (seconds / 60);
        long hours = (min / 60);
        long sec = (seconds % 60);
        min = (min % 60);
        String sHour = hours + "";
        if (sHour.length() < 2)
        {
            sHour = "0" + sHour;
        }
        String sMin = min + "";
        if (sMin.length() < 2)
        {
            sMin = "0" + sMin;
        }
        String sSec = sec + "";
        if (sSec.length() < 2)
        {
            sSec = "0" + sSec;
        }
        String s = sHour + ":" + sMin + ":" + sSec;
        return s;
    }
}
