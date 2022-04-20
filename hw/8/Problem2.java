//Brendon Kupsch
//CMPT_220L_202
//Prof. Arias
//HW 8 Problem 2
import java.util.ArrayList;
public class Problem2 
{
    public static void main(String[] args) 
    {
    final java.util.Scanner input = new java.util.Scanner(System.in);
    System.out.print("Enter the number of objects: ");
    double[] items = new double[input.nextInt()];
    System.out.print("Enter the weight of the objects: ");
    for (int i = 0; i < items.length; i++) 
    {
        items[i] = input.nextDouble();
    }

    ArrayList<Bin> containers = firstFit(items);
    for (int i = 0; i < containers.size(); i++) 
    {
        System.out.println("Container " + (i + 1) + " contains objects with weight " + containers.get(i));
    }
    input.close();
}

public static ArrayList<Bin> firstFit(double[] items) 
{
    ArrayList<Bin> list = new ArrayList<>();
    for (int i = 0; i < items.length; i++) 
    {
        boolean added=false;    
        for(Bin bin: list){ 
            if(bin.addItem(items[i]))
            {
                added=true;         
                break;
            }
        }
        if(!added)
        {
            Bin bin=new Bin();
            bin.addItem(items[i]);
            list.add(bin);
        }
    }
    return list;
    }
}

class Bin 
{
    private ArrayList<Double> objects = new ArrayList<>();
    private double maxWeight = 10;
    private double totalWeight = 0;
    public Bin() 
    {
    }
    public Bin(double maxWeight) 
    {
        this.maxWeight = maxWeight;
    }
    public boolean addItem(double weight) 
    {
        if ((totalWeight+weight) <= maxWeight) 
        {
            objects.add(weight);
            totalWeight += weight;
            return true;
        }
        else 
        {
            return false;
        }
    }

    public int getNumberOfObjects() 
    {
        return objects.size();
    }

    @Override
    public String toString() 
    {
        return objects.toString();
    }
}
