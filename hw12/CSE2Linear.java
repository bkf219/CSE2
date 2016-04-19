///////////////////////////////////////////////////////////////
// Brian Falkenstein
// CSE 2
// Hw 12
// April 19 2016
import java.util.Scanner;
import java.util.Random;
//this program will take an array of 15 ints as grades for a CSE final
//it will then prompt the user to search for a grade and display if it was found or not
//it will then scramble the array, and again prompt for a grade to be searched
public class CSE2Linear
{
    public static void main(String args[])
    {
        Scanner kbReader = new Scanner(System.in);
        int[] grades = new int[15];
        boolean pass = true;
        System.out.println("Please input 15 grades: ");
        for(int i = 0; i < 15; i++)
        {
            grades[i] = kbReader.nextInt();
            if(i==0)
            {
                if(grades[i]>100 || grades[i]<0)
                {
                    System.out.println("Grades must be between 0 and 100.");
                    pass = false;
                    break;
                }
                else
                continue;
            }
            else if(grades[i]<grades[i-1])
            {
                System.out.println("Grades must be inputted in increasing order.");
                pass = false;
                break;
            }
            if(grades[i]>100 || grades[i]<0)
            {
                System.out.println("Grades must be between 0 and 100.");
                pass = false;
                break;
            }
        }
        if(pass == true)
        {
            System.out.println("The array: ");
            for(int i = 0; i < 15; i++)
            {
                System.out.print(grades[i] + " ");
            }
            System.out.println("\nPlease enter a value to be searched: ");
            int search1 = kbReader.nextInt();
            linearSearch(grades,search1);
            int[] gradesRandom = scramble(grades);
            System.out.println("Scrambled: ");
            for(int i = 0; i < 15; i++)
            {
                System.out.print(gradesRandom[i] + " ");
            }
            Systme.out.println("\nPlease enter an int to be searched: ");
            int search2 = kbReader.nextInt();
            linearSearch(gradesRandom,search2);
            
        }
    }
//this method takes an array and a value to be searched, and searches the array 
//for the value. it returns 1 if the value is found, and 0 if not
    public static void linearSearch(int[] array, int val)
    {
        boolean found = false;
        for(int i = 0; i < array.length-1; i++)
        {
            if(array[i] == val)
            {
                System.out.println(val + " was found with " + i + " iterations.");
                found = true;
            }
        }
        if(found == false)
        {
            System.out.println(val + " was not found.");
        }
    }
//this method takes in an array and scrambles the order of the values in the array    
    public static int[] scramble(int[] array)
    {
        Random rand = new Random();
        int index = rand.nextInt(array.length-2);
            for(int i = 0; i < (array.length-1); i++)
            {
                if(index>(array.length-1))
                {
                    break;
                }
                else
                {
                    int temp = array[i];
                    array[i] = array[index];
                    array[index] = temp;
                    index++;
                }
            }
        return array;
    }
}