//Brendon Kupsch
//CMPT_220L_202
//Prof. Arias
//HW 10 Problem 2
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Problem2 
{
    public static void main(String[] args) {
        Animal[] list = new Animal[5];
        list[0] = new Chicken();
        list[0].setWeight(4.5);
        list[1] = new Tiger();
        list[1].setWeight(46.6);
        list[2] = new Chicken();
        list[2].setWeight(1.5);
        list[3] = (Animal)(list[0].clone());
        list[3].setWeight(7.5);
        list[4] = (Animal)(list[1].clone());
        java.util.Arrays.sort(list);
        for (int i = 0; i < list.length; i++) 
        {
            System.out.println("weight: " + list[i].getWeight());
        }
    }            
}

abstract class Animal implements Comparable<Animal>
{
    private double weight;

    public double getWeight()
    {
        return weight;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }

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

    @Override
    public int compareTo(Animal o)
    {
        if (weight - o.weight < 0)
            return -1;
        if (weight - o.weight > 0)
            return 1;
        return 0;
    }

    public abstract String sound();

    public double compareTo()
    {
        return weight - weight;
    }
}
class Chicken extends Animal
{
    public String howToEat()
    {
        return "Chicken: Fry it";
    }

    @Override
    public String sound()
    {
        return "Chicken: cock-a-doodle-doo";
    }
}

class Tiger extends Animal
{
    @Override
    public String sound()
    {
        return "Tiger: RROOAARR";
    }
}
