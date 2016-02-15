///////////////////////////////////////////////////////////////
// Brian Falkenstein
// CSE 2
// Lab 3
// Feb 12 2016

import java.util.Scanner; //import the scanner class

public class Pyramid
{
    public static void main(String args[])
    {
        Scanner myScanner = new Scanner(System.in); //construct the scanner
        System.out.print("Enter the square side of the pyramid: ");
        double side = myScanner.nextDouble(); //take input of side length
        System.out.print("Enter the height of the pyramid: ");
        double height = myScanner.nextDouble(); //take input for height
        double volume = (side*side*height)/3; //calculate volume of the pyramid
        System.out.println("The volume of the pryamid is " + volume);
        
    }
}