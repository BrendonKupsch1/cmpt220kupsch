//Brendon Kupsch
//CMPT_220L_202
//Prof. Arias
//Project 3

import java.util.Vector;
import java.util.Scanner;
public class Project3 
{
    public static void main(String[] args)
    {
        for(int houses = 0; houses < 40; houses++)
        {
            Scanner input = new Scanner(System.in);

//input for width, length
            System.out.println("Enter your width and length of your room between and including 5 and 20: ");
            int width = input.nextInt();
            int length = input.nextInt();

//if to end program if width and length are 0
            if(width == 0 && length == 0)
            {
                houses = 1000;
                System.exit(0);
            }

            System.out.println("Enter the diagram of your room with the entrance marked: ");

//declaring and creating vector 
            Vector<String> diagram = new Vector<>();
            for(int i = 0; i < length; i++)
            {
                diagram.add(input.next());
            }
        
//variables for keeping track of mirror direction
            int x = 0;
            int y = 0;
            int direction = 0;

            for(int i = 0; i < length; i++)
            {
                String tempString = diagram.get(i);
                for(int j = 0; j < width; j++)
                {
                    if(tempString.charAt(j) == '*')
                    {
                        x = j;
                        y = i;
                    }
                }
            }

//main while loop
            boolean running = true;
            while(running)
            {
                char nexttile = '0';
//if tree to get next tile
                if(direction == 0)
                {
                    x++;
                    nexttile = diagram.get(y).charAt(x);
                }
                if(direction == 1)
                {
                    y++;
                    nexttile = diagram.get(y).charAt(x);
                }
                if(direction == 2)
                {
                    x--;
                    nexttile = diagram.get(y).charAt(x);
                }
                if(direction == 3)
                {
                    y--;
                    nexttile = diagram.get(y).charAt(x);
                }


//if the next tile is a wall the exit is found
                if(nexttile == 'x')
                {
                    String tempString = diagram.get(y);
                    String newString = tempString.substring(0, x) + '&' + tempString.substring(x + 1);
                    diagram.set(y, newString);
                    running = false;
                }


//if a mirror is hit change direction
                else if(nexttile == '\\')
                {
                    if(direction == 0)
                    {
                        direction = 1;
                    }
                    else if(direction == 1)
                    {
                        direction = 0;
                    }
                    else if(direction == 2)
                    {
                        direction = 3;
                    }
                    else if(direction == 3)
                    {
                        direction = 2;
                    }
                }


//if other mirror is hit change other direction
                else if(nexttile == '/')
                {
                    if(direction == 0)
                    {
                        direction = 3;
                    }
                    else if(direction == 1)
                    {
                        direction = 2;
                    }
                    else if(direction == 2)
                    {
                        direction = 1;
                    }
                    else if(direction == 3)
                    {
                        direction = 0;
                    }
                }

//if next tile is a period do nothing
                else if(nexttile == '.')
                    ;

//throw error if symbol unknown
                else
                {
                    throw new IllegalArgumentException("unknown symbol in house");
                }
            }


            System.out.println("House");
            for(int i = 0; i < length; i++)
            {
                System.out.println(diagram.get(i));
            }
        }
    }
}