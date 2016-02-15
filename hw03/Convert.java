///////////////////////////////////////////////////////////////
// Brian Falkenstein
// CSE 2
// Lab 3
// Feb 12 2016

import java.util.Scanner; //import the scanner class

public class Convert
{
    public static void main(String args[])
    {
        Scanner myScanner = new Scanner(System.in); //construct the scanner
        System.out.print("Enter the distance in meters: ");
        double distMeters=myScanner.nextDouble(); //take input of meters
        double distInches=distMeters*39.37; //convert meters to inches
        System.out.println("The distance is " + distInches + "inches.");
        
    }
}