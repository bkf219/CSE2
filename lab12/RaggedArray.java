///////////////////////////////////////////////////////////////
// Brian Falkenstein
// CSE 2
// Lab 12
// April 22 2016
import java.util.Scanner;
import java.util.Random;
//this program will create and manipulate a 2D ragged array
public class RaggedArray
{
    public static void main(String args[])
    {
        Scanner kbReader = new Scanner(System.in);
        System.out.println("Please enter the length of the array: ");
        int size = kbReader.nextInt();
        int[][] ragged = new int[size][]; //create the first column in the array
        Random rand = new Random(); 
        for(int i = 0; i < size; i++)
        {
            int length = rand.nextInt(size) + 1; //random number between 1 and size
            ragged[i] = new int[length]; 
        }
        for(int row = 0; row < ragged.length; row++) //this will fill the array with random ints
        {
            for(int col = 0; col < ragged[row].length; col++) //go through each individual member array
            {
                ragged[row][col] = rand.nextInt(20); //each member will recieve a random int from 0 to 20
            }
        }
        //print out the unsorted array
        System.out.println("The unsorted array: ");
        for(int row = 0; row < ragged.length; row++) //this will fill the array with random ints
        {
            for(int col = 0; col < ragged[row].length; col++) //go through each individual member array
            {
                System.out.print(ragged[row][col] + " ");
            }
            System.out.print("\n");
        }
        //this next part will implement selection sort to sort each member array
        for(int c = 0; c<ragged.length; c++) //will go through the first column
        {
            for(int i = 0; i < ragged[c].length - 1; i++) //will go through each individual member array
            {
                int index = i; //for use swapping array values later
                for(int j = i + 1; j < ragged[c].length; j++) //will search for the smallest number
                {
                    if(ragged[c][j] < ragged[c][index])
                    {
                        index = j; //make j the smallest value now, and continue searching for a smaller value
                    }
                }
                int smaller = ragged[c][index]; //if a smaller int is found, this is used to swap values 
                ragged[c][index] = ragged[c][i];
                ragged[c][i] = smaller; 
            }
        }
        System.out.println("The sorted array: ");
        //this part will print out the array
        for(int row = 0; row < ragged.length; row++) //this will fill the array with random ints
        {
            for(int col = 0; col < ragged[row].length; col++) //go through each individual member array
            {
                System.out.print(ragged[row][col] + " ");
            }
            System.out.print("\n");
        }
        System.out.println("The rearranged array: ");
        //this part will sort the array by length
        for(int i = 0; i < ragged.length - 1; i++)
        {
            int index = i;
            for(int j = i + 1; j < ragged.length; j++)
            {
                if(ragged[j].length < ragged[index].length)
                {
                    index = j;
                }
            }
            int[] shorter = ragged[index];
            ragged[index] = ragged[i];
            ragged[i] = shorter;
        }
        //this will print out the array again, this time sorted
        for(int row = 0; row < ragged.length; row++) //this will fill the array with random ints
        {
            for(int col = 0; col < ragged[row].length; col++) //go through each individual member array
            {
                System.out.print(ragged[row][col] + " ");
            }
            System.out.print("\n");
        }
        System.out.println("Please input an integer to be searched: ");
        int searched = kbReader.nextInt();
        boolean isFound = false;
        //I will implement 2D linear search
        for(int row = 0; row < ragged.length; row++) //this will search through both dimenstions of the array
        {
            for(int col = 0; col < ragged[row].length; col++) 
            {
                if(ragged[row][col] == searched)
                {
                    System.out.println("Row " + row + " col " + col + ".");
                    isFound = true;
                    break;
                }
            }
        }
        if(isFound == false)
        {
            System.out.println(searched + " was not found.");
        }
    }
}