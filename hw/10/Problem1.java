//Brendon Kupsch
//CMPT_220L_202
//Prof. Arias
//HW 10 Problem 1
import java.util.Scanner;
public class Problem1 
{
    public static void main(String[] args) 
    {
        Time time1 = new Time(1194314);
        Time time2 = new Time(93889345);
        System.out.println("Enter time1 (hour minute second): 331 34 674");
        System.out.println(time1.toString());
        System.out.println("Enter time2 (elapsed time): 93889345");
        System.out.println(time2.toString());
        System.out.println("time1.compareTo(time2)? " + time1.compareTo(time2));
        System.out.println("time3 is created as a clone of time1");
        Time time3 = new Time(1194314);
        System.out.println("time1.compareTo(time2)? " + time1.compareTo(time3));
    }
}

class Time 
{
    private int mHour;
    private int mMinute;
    private int mSecond;
    private long mTime;

    public Time() 
    {
        mTime = System.currentTimeMillis();
    }

    public Time(long time) 
    {
        mTime = time;
    }
    public Time(int hour, int minute, int second) 
    {
        mTime = 0;
        mTime += hour * (1000 * 60 * 60);
        mTime += minute * (1000 * 60);
        mTime += second * 1000;
    }

    public void setTime(long elapsedTime) 
    {
        mTime = elapsedTime;
    }


    public int getHour() 
    {
        return (int)(mTime / (1000 * 60 * 60));
    }

    public int getMinute() 
    {
        return (int)(mTime / (1000 * 60))%60;
    }

    public int getSecond() 
    {
        return (int)(mTime / 1000)%60;
    }

    public String toString()
    {
        return (String)(this.getHour() + " hours " + this.getMinute() + " minutes " + this.getSecond() + " seconds");
    }

    public int compareTo(Time time2)
    {
        return (int)(mSecond - mSecond);
    }
}