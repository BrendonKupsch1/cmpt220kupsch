//Brendon Kupsch
//CMPT_220L_202
//Prof. Arias
//HW 10 Problem 1
import java.util.Scanner;
public class Problem1 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter time1 (hour min sec): ");
        int hours = input.nextInt();
        int minutes = input.nextInt();
        int seconds = input.nextInt();
        Time time1 = new Time(hours, minutes, seconds);
        System.out.println(time1);
        System.out.println("Elapse seconds in time1: " + time1.getTime());
        System.out.println("Enter time2 in time1: ");
        long time = input.nextLong();
        Time time2 = new Time(time);
        System.out.println(time2);
        System.out.println("Elapse seconds in time1: " + time2.getTime());
        System.out.println("time1.compareTo(time2)? " + time1.compareTo(time2));
        Time time3 = (Time)time1.clone();
        System.out.println("time3 is created as a clone of time1");
        System.out.println("time1.compareTo(time3)? " + time1.compareTo(time3));
    }
}

class Time implements Comparable<Time>, Cloneable
{
    private long time;

    public Time()
    {
        time = System.currentTimeMillis() / 1000;
    }

    public Time(long time)
    {
        this.time = time;
    }

    public Time(int hours, int minutes, int seconds)
    {
        time = hours * 60 * 60;
        time += minutes * 60;
        time += seconds;
    }

    public int getHour()
    {
        return (int)(time / (60 * 60) % 24);
    }

    public int getMinute() 
    {
        return (int)(time / 60 % 60);
    }

    public int getSecond()
    {
        return (int)(time % 60);
    }

    public long getTime()
    {
        return time;
    }

    @Override
    public String toString()
    {
        return getHour() + " hour" + (getHour() == 1?" ":"s ") + getMinute() + " minute" + (getMinute() == 1?" ":"s ") + getSecond() + " second" + (getSecond() == 1?" ":"s ");
    }

    @Override
    public int compareTo(Time x) 
    {
        return (int)(time - x.time);
    }

    @Override
    public Object clone()
    {
        try
        {
            Object clone = super.clone();
            return clone;
        } catch (CloneNotSupportedException ex)
        {
            ex.printStackTrace();
        }
        return null;
    }
}