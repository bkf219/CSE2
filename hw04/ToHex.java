///////////////////////////////////////////////////////////////
// Brian Falkenstein
// CSE 2
// Lab 3
// Feb 12 2016
import java.util.Scanner; //import the scanner class

public class ToHex
{
    public static void main(String args[])
    {
        System.out.println("Please enter three numbers representing RGB values:\n");
        Scanner myScanner = new Scanner(System.in);
        int r = myScanner.nextInt();
        int g = myScanner.nextInt();           //take input from user for 3 values
        int b = myScanner.nextInt();
        
        int modr = r%16;
        int modg = g%16;             //for use in converting to hexi, second value
        int modb = b%16;
        
        int leftoverr = (r-modr)/16;
        int leftoverg = (g-modg)/16;    //first value in hexi
        int leftoverb = (b-modb)/16;
        
        String hexir = "";
        String hexig = "";       //will be added to later
        String hexib = "";
        
        if(r>255 || r<0 || g>255 || g<0 || b>255 || b<0)      //make sure user entered valid values
        {
            System.out.println("Please enter a number between 0-255");
        }
        else
        {
            //switch statements for first value of R
            switch(leftoverr)
            {
            case 1:
                hexir += "1";
            break;
            case 2:
                hexir += "2";
            break;
            case 3:
                hexir += "3";
            break;
            case 4:
                hexir += "4";
            break;
            case 5:
                hexir += "5";
            break;
            case 6:
                hexir += "6";
            break;
            case 7:
                hexir += "7";
            break;
            case 8:
                hexir += "8";
            break;
            case 9:
                hexir += "9";
            break;
            case 10:
                hexir += "A";
            break;
            case 11:
                hexir += "B";
            break;
            case 12:
                hexir += "C";
            break;
            case 13:
                hexir += "D";
            break;
            case 14:
                hexir += "E";
            break;
            case 15:
                hexir += "F";
            break;
            case 0:
                hexir +="0";
            break;
            }
            
            //switch statements for second value of r
            switch(modr)
            {
            case 1:
                hexir += "1";
            break;
            case 2:
                hexir += "2";
            break;
            case 3:
                hexir += "3";
            break;
            case 4:
                hexir += "4";
            break;
            case 5:
                hexir += "5";
            break;
            case 6:
                hexir += "6";
            break;
            case 7:
                hexir += "7";
            break;
            case 8:
                hexir += "8";
            break;
            case 9:
                hexir += "9";
            break;
            case 10:
                hexir += "A";
            break;
            case 11:
                hexir += "B";
            break;
            case 12:
                hexir += "C";
            break;
            case 13:
                hexir += "D";
            break;
            case 14:
                hexir += "E";
            break;
            case 15:
                hexir += "F";
            break;
            case 0:
                hexir +="0";
            break;
            }
            
            //switch sateemtns for leftover g
            switch(leftoverg)
            {
            case 1:
                hexig += "1";
            break;
            case 2:
                hexig += "2";
            break;
            case 3:
                hexig += "3";
            break;
            case 4:
                hexig += "4";
            break;
            case 5:
                hexig += "5";
            break;
            case 6:
                hexig += "6";
            break;
            case 7:
                hexig += "7";
            break;
            case 8:
                hexig += "8";
            break;
            case 9:
                hexig += "9";
            break;
            case 10:
                hexig += "A";
            break;
            case 11:
                hexig += "B";
            break;
            case 12:
                hexig += "C";
            break;
            case 13:
                hexig += "D";
            break;
            case 14:
                hexig += "E";
            break;
            case 15:
                hexig += "F";
            break;
            case 0:
                hexig +="0";
            break;
            }
            
            //switch statement for the second value of g
            switch(modg)
            {
            case 1:
                hexig += "1";
            break;
            case 2:
                hexig += "2";
            break;
            case 3:
                hexig += "3";
            break;
            case 4:
                hexig += "4";
            break;
            case 5:
                hexig += "5";
            break;
            case 6:
                hexig += "6";
            break;
            case 7:
                hexig += "7";
            break;
            case 8:
                hexig += "8";
            break;
            case 9:
                hexig += "9";
            break;
            case 10:
                hexig += "A";
            break;
            case 11:
                hexig += "B";
            break;
            case 12:
                hexig += "C";
            break;
            case 13:
                hexig += "D";
            break;
            case 14:
                hexig += "E";
            break;
            case 15:
                hexig += "F";
            break;
            case 0:
                hexig +="0";
            break;
            }
            
            //switch statements for first value of b
            switch(leftoverb)
            {
            case 1:
                hexib += "1";
            break;
            case 2:
                hexib += "2";
            break;
            case 3:
                hexib += "3";
            break;
            case 4:
                hexib += "4";
            break;
            case 5:
                hexib += "5";
            break;
            case 6:
                hexib += "6";
            break;
            case 7:
                hexib += "7";
            break;
            case 8:
                hexib += "8";
            break;
            case 9:
                hexib += "9";
            break;
            case 10:
                hexib += "A";
            break;
            case 11:
                hexib += "B";
            break;
            case 12:
                hexib += "C";
            break;
            case 13:
                hexib += "D";
            break;
            case 14:
                hexib += "E";
            break;
            case 15:
                hexib += "F";
            break;
            case 0:
                hexib +="0";
            break;
            }
            
            //switch statements for second value of b
            switch(modb)
            {
            case 1:
                hexib += "1";
            break;
            case 2:
                hexib += "2";
            break;
            case 3:
                hexib += "3";
            break;
            case 4:
                hexib += "4";
            break;
            case 5:
                hexib += "5";
            break;
            case 6:
                hexib += "6";
            break;
            case 7:
                hexib += "7";
            break;
            case 8:
                hexib += "8";
            break;
            case 9:
                hexib += "9";
            break;
            case 10:
                hexib += "A";
            break;
            case 11:
                hexib += "B";
            break;
            case 12:
                hexib += "C";
            break;
            case 13:
                hexib += "D";
            break;
            case 14:
                hexib += "E";
            break;
            case 15:
                hexib += "F";
            break;
            case 0:
                hexib +="0";
            break;
            }
        }
        String hexi = hexir+hexig+hexib; //combine the strings
        System.out.println("R:" + r + " G:" + g + " B:" + b + " in hexidecimal is: " + hexi); //final print statement
    }
}
