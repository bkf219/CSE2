///////////////////////////////////////////////////////////////
// Brian Falkenstein
// CSE 2
// Lab 10
// April 8 2016
import java.util.Scanner; //import the scanner class

//This class will generate a random number between 5 and 10 corresponding to students
//it will then prompt the user for the students' names, and it will assign them
// a random grade from 1 to 100.

public class Arrays
{
    public static void main(String args[])
    {
        int studentAmount = (int)(Math.random()*6) + 5; //generate random number between 0 and 5, and then add 5 to get number between 5 and 10
        System.out.println("Enter " + studentAmount + " student names: ");
        Scanner kbReader = new Scanner(System.in); //create the scanner object to take in the names
        String[] names = new String[studentAmount]; //create the array to store the names
        for(int i = 0; i<studentAmount; i++) //parse through the array
        {
            names[i] = kbReader.next(); //add names inputted by user to the array
        }
        int[] grades = new int[studentAmount]; //array for grades of same length as amount of students
        for(int i = 0; i<studentAmount; i++) //parse through grade array
        {
            grades[i] = (int)(Math.random()*101); //randomly create a number from 0 to 100 and store in grades array
        }
        System.out.println("Here are the midterm grades of the " + studentAmount + " students above:");
        for(int i =0; i<studentAmount; i++) //final loop to print both arrays out
        {
            System.out.println(names[i] + ": " + grades[i]);
        }
    }
}