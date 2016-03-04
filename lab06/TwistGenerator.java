///////////////////////////////////////////////////////////////
// Brian Falkenstein
// CSE 2
// Lab 6
// March 6 2016
import java.util.Scanner; 
//this program will generate a graphical "twist" or knot of length n
public class TwistGenerator
{
    public static void main(String args[])
    {
        Scanner kbReader = new Scanner(System.in); //create scanner
        int n=0; //create the variable to avoid scope errors, becomes user import
        while(true) //infinite while loop
        {
            System.out.println("How long would you like the twist to be? ");
            n = kbReader.nextInt();
            if(n>=0)
            {
                break; //check to see if its valid, and if so, continues with the program
            }
        }
        int cycles = n/3; //amount of 3 character cycles are present
        int leftover = n%3; //amount of characters left over
        int i = 0, j = 0, c = 0; //different variales for while loops 
        while(i<cycles)
        {
            System.out.print("\\ /"); //cycle through first line
            i++;
        }
        
        if(leftover==1)
            System.out.print("\\\n");
        else if(leftover==2)                   //add leftover characters
            System.out.print("\\ \n");
        else
            System.out.print("\n");        //if no leftover, still create new line
            
        while(j<cycles)
        {
            System.out.print(" X ");         //cycle through second line
            j++;
        }
        
        if(leftover==1)
            System.out.print(" \n");
        else if(leftover==2)              //add leftovers for second line
            System.out.print(" X\n");
        else
            System.out.print("\n");        //if no leftover, still create new line
            
        while(c<cycles)
        {
            System.out.print("/ \\");        //cycle through third line
            c++;
        }
        
        if(leftover==1)
            System.out.print("/\n");        //add leftovers for third line
        else if(leftover==2)
            System.out.print("/ \n");
        else
            System.out.print("\n");          //if no leftover, still create new line
    }
}