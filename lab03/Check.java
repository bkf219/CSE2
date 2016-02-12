///////////////////////////////////////////////////////////////
// Brian Falkenstein
// CSE 2
// Lab 3
// Feb 12 2016

import java.util.Scanner; //import the scanner class

public class Check
{
    public static void main(String args[]) //main method
    {
        Scanner myScanner=new Scanner(System.in); //create the scanner
        System.out.print("Enter the original cost of the check in the form xx.xx: ");//prompt user to add check
        double checkCost=myScanner.nextDouble();
        System.out.print("Enter the percentage tip you'd wish to pay as a whole number in the form xx: ");
        double tipPercent=myScanner.nextDouble();
        tipPercent/=100; //convert to percent
        System.out.print("Enter the number of people who are splitting the check: ");
        int numPeople=myScanner.nextInt(); 
        
        double totalCost; //total cost
        double costPerPerson; //amount each person owes
        int dollars; //whole dollar amount
        int dimes, pennies; //for storing not whole dollar amounts
        totalCost=checkCost*(1+tipPercent); //add the tip to the bill
        costPerPerson=totalCost/numPeople; //determine cost per person
       
        dollars=(int)costPerPerson; //just get dollar amount;
        dimes=(int)(costPerPerson*10) % 10; //mult by 10, then get remainder with % to get dimes
        pennies=(int)(costPerPerson*100)%10; //same logic as before, but mult by 100 to get pennies
        System.out.println("Each person owes $"+dollars+"."+dimes+pennies+".");
        
        
    } // end of main method
}//end of class Check
