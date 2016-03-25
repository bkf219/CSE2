///////////////////////////////////////////////////////////////
// Brian Falkenstein
// CSE 2
// Lab 9
// March 25 2016
import java.util.Scanner; 
import java.util.Random;  //import random and scanner for later use
//this program will generate a random sentenec 
public class Sentences
{
    public static void main(String args[])
    {
        Scanner kbReader = new Scanner(System.in); //create the scanner
        boolean a = true; // for use on infinite loops
        while(a == true) //infinite loop, until user breaks it
        {
        System.out.println("Print new Sentence? (y/n): ");
        String c = kbReader.next(); //get users input
            if(c.equals("y") || c.equals("Y")) //see if input is either y or Y
            {
                System.out.println("The " + Adjective() + " " + nounSubject() + " " +Verb() + " the " + Adjective() + " " + nounObject() + ".");
            } //print out random statement
            else
                break; //exit the program if not a y or Y
        }
    }
    public static String Adjective()
    {
        Random randomGenerator=new Random();
        int n = randomGenerator.nextInt(10); //generate random number between 0 and 9
        String adj = "";
        switch(n)
        {
            case 1:
                adj = "fun";
            break;
            case 2:
                adj = "cool";
            break;
            case 3:
                adj = "lazy";
            break;
            case 4:
                adj = "tan";
            break;
            case 5:
                adj = "sassy";
            break;
            case 6:
                adj = "incredible";
            break;
            case 7:
                adj = "rambunctious";
            break;
            case 8:
                adj = "shaggy";
            break;
            default:
                adj = "electric";
            break;
        }
        return adj; //return final string
        
    }
    public static String nounSubject()
    {
        Random randomGenerator=new Random();
        int n = randomGenerator.nextInt(10);
        String nounSub = "";
        switch(n)
        {
            case 1:
                nounSub = "dog";
            break;
            case 2:
                nounSub = "cat";
            break;
            case 3:
                nounSub = "robot";
            break;
            case 4:
                nounSub = "alien";
            break;
            case 5:
                nounSub = "space ship";
            break;
            case 6:
                nounSub = "astronaut";
            break;
            case 7:
                nounSub = "spider";
            break;
            case 8:
                nounSub = "ancient psychic tandem war elephant";
            break;
            default:
                nounSub = "plumbus";
            break;
        }
        return nounSub;
    }
    public static String nounObject()
    {
        Random randomGenerator=new Random();
        int n = randomGenerator.nextInt(10);
        String nounObj = "";
        switch(n)
        {
            case 1:
                nounObj = "teleporter";
            break;
            case 2:
                nounObj = "ray gun";
            break;
            case 3:
                nounObj = "zombie";
            break;
            case 4:
                nounObj = "sword";
            break;
            case 5:
                nounObj = "computer";
            break;
            case 6:
                nounObj = "book";
            break;
            case 7:
                nounObj = "guitar";
            break;
            case 8:
                nounObj = "trap";
            break;
            default:
                nounObj = "rock";
            break;
        }
        return nounObj;
    }
    public static String Verb()
    {
        Random randomGenerator=new Random();
        int n = randomGenerator.nextInt(10);
        String verb = "";
        switch(n)
        {
            case 1:
                verb = "fooled";
            break;
            case 2:
                verb = "blasted";
            break;
            case 3:
                verb = "jumped";
            break;
            case 4:
                verb = "incinerated";
            break;
            case 5:
                verb = "fist bumped";
            break;
            case 6:
                verb = "played";
            break;
            case 7:
                verb = "melted";
            break;
            case 8:
                verb = "lifted";
            break;
            default:
                verb = "trolled";
            break;
        }
        return verb;
    }
}