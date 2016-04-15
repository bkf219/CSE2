///////////////////////////////////////////////////////////////
// Brian Falkenstein
// CSE 2
// Lab 10
// April 8 2016
import java.util.Scanner;
import java.util.Random;
//This program will create 2 arrays of size 50 and fill them with random ints
//The program will print out the max and min values of the first array using linear search
//Then, the user will input an integer value >=0 and the program will implement
//a binary search to find the inputted value
public class Search
{
    public static void main(String args[])
    {
        int[] array1 = new int[50]; //create 2 arrays of length 50
        int[] array2 = new int[50];
        Random rand = new Random(); //create random obj
        for(int i = 0; i<50; i++)
        {
            array1[i] = rand.nextInt(100); //fills array 1 with random ints from 0 to 100
        }
        int min = array1[0];
        int max = array1[0];
        for(int i = 0; i<50; i++) //will search through the array for the min and max linearly
        {
            if(array1[i]>max){
                max=array1[i]; //set max if value at i is > previous max
            }
            if(array1[i]<min){
                min=array1[i]; //set min if value at i is < previous min
            }
        }
        System.out.println("The max of array 1 is " + max + ".");
        System.out.println("The min of array 1 is " + min + ".");
        for(int i = 0; i < 50; i++) //fills array 2 with incresing random ints
        {
            if(i==0){
                array2[i] = rand.nextInt(100); //first value is just between 0 and 100
            }
            else{
                array2[i] = array2[i-1] + rand.nextInt(100); //subsequent values add a random value from 0 to 100 to previous
            }
        }
        System.out.println("Please enter an int to be searched: ");
        Scanner kbReader = new Scanner(System.in); //create scanner
        int searchedInt = kbReader.nextInt(); //take input from user for what int is to be searched
        boolean foundInt = false; //used to determine if the int was found
        int start = 0; //position 0 is the start of the array 
        int end = 49; //position 49 is the last spot in the array 
        //note: start and end will be modified in the while loop
        if(searchedInt<0)
        {
            System.out.println("Input must be an int >= 0."); //make sure user inputted a valid int
        }
        else
        {
            while(start<end) 
            {
                int mid = (start+end)/2; //check the middle value between start and end
                if(array2[mid] == searchedInt)
                {
                    System.out.println(searchedInt + "is in the array."); //check if the value at array2[i] is the searched int
                    foundInt = true; //again, used to determine if the int was actually found (defaults to false)
                }
                else if(array2[mid] < searchedInt) //if the middle value is less than the valye we want, we will cut the part of the array that we are searching in half
                {
                    start = mid + 1; //new start is 1 past the midpoint of the last search
                }
                else if(array2[mid] > searchedInt) //if the middle value is greater than the searched value, again cut the array in half, but search the first half this time
                {
                    end = mid - 1; //new end is 1 before the midpoint of the last search
                }
            }
        }
        if(foundInt == false) //if we didn't find the int
        {
            System.out.println(searchedInt + " was not found in the array.");
            System.out.println("The value above is " + array2[end]); //value above our searched value
            System.out.println("The value below is " + array2[start-1]); //value below our searched value
        }
    }
}