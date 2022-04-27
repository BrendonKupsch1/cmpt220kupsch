//Brendon Kupsch
//CMPT_220L_202
//Prof. Arias
//Project 4

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Project4
{
    public static void main(String[] args)
    {
        ArrayList<BabyName> maleBabyNames = new ArrayList<>();
        ArrayList<BabyName> femableBabyNames = new ArrayList<>();
        init(maleBabyNames, femableBabyNames);

        Scanner input = new Scanner(System.in);

        // to search continuously
        while (true)
        {
            System.out.println("Enter the year: ");
            int year = input.nextInt();
            input.nextLine();
            System.out.println("Enter the gender: ");
            char gender = input.nextLine().charAt(0);
            System.out.println("Enter the name: ");
            String name = input.nextLine();
            BabyName babyName = null;
            ArrayList<BabyName> tmpRef;
            if(gender == 'M')
                tmpRef = maleBabyNames;
            else if(gender == 'F')
                tmpRef = femableBabyNames;
            else 
                throw new GenderException(gender + " is not a proper gender");
            for(BabyName BN : tmpRef)
                if(BN.getName().equals(name) && BN.getYear() == year)
                    babyName = BN;

            // if the name isnt found
            if (babyName != null)
                System.out.println(babyName);
            else
                System.out.printf("The name %s is not ranked in year %d\n",name,year);
        }
    }


    // method to initialize the lists of names for males and females

    public static void init(ArrayList<BabyName> males, ArrayList<BabyName> females)
    {
        //Load names for the year
        ArrayList<BabyName> babyNames = null;
        for(int y = 0; y < 10; y++)
        {
            try
            {
                babyNames = loadNames("babynameranking" + (y + 2001) + ".txt");
            } catch (FileNotFoundException e)
            {
                System.out.println("A file for that year could not be found.");
            } catch (Exception e)
            {
                e.printStackTrace();
            }
            //split lists
            for(BabyName babyName : babyNames)
            {
                if(babyName.getGender() == 'M')
                    males.add(babyName);
                else
                    females.add(babyName);
            }
        }
    }



    // Method to find given name in given year

    private static BabyName findName(String name, int year, ArrayList<BabyName> names)
    {
        for(BabyName babyName : names)
            if (babyName.getName().equalsIgnoreCase(name) && babyName.getYear() == year)
                return babyName;
        return null; 
    }

    // Method to load all names from a file with the format <ranking male_name male_births female_name female_births>

    private static ArrayList<BabyName> loadNames(String fileName) throws IOException
    {
        ArrayList<BabyName> names = new ArrayList<>();
        File file = new File(fileName);
        Scanner input = new Scanner(file);
        int year = Integer.parseInt(fileName.substring(fileName.indexOf("20"), fileName.indexOf("20") + fileName.indexOf("20")));
        while(input.hasNext())
        {
            int ranking = input.nextInt();
            String name = input.next();
            names.add(new BabyName(name, ranking, 'M', year));
            input.nextInt();
            name = input.next();
            input.nextLine();
            names.add(new BabyName(name, ranking, 'F', year));
        }
        return names;
    }
}


// BabyName class

class BabyName 
{
    private String name;
    private int ranking;
    private char gender;
    private int year;

    public BabyName()
    {
    }

    public BabyName(String name, int ranking, char gender, int year)
    {
        this.name = name;
        this.ranking = ranking;
        this.gender = gender;
        this.year = year;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getRanking()
    {
        return ranking;
    }
    
    public void setRanking(int ranking)
    {
        this.ranking = ranking;
    }

    public char getGender()
    {
        return gender;
    }

    public void setGender(char gender)
    {
        this.gender = gender;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    @Override
    public String toString()
    {
        return name + " is ranked #" + ranking + " for year " + year;
    }
}
class GenderException extends IllegalArgumentException 
{
    GenderException(String s) 
    {
        super(s);
    }
}