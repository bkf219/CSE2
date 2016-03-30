///////////////////////////////////////////////////////////////
// Brian Falkenstein
// CSE 2
// HW 9
// March 29 2016
import java.util.Scanner; //import the scanner class
import java.util.Random; //import random class

public class Games
{
    public static void main(String args[])
    {
        System.out.println("Welcome to Brian's game center!");
        Scanner kbReader = new Scanner(System.in); //create the scanner
        System.out.println("Please select a game by typing 1, 2, or 3: ");
        System.out.println("1. Guess The Box\n2. Spin the Wheel\n3. Scrambler");
        int choice = kbReader.nextInt(); //take user input
        if(choice == 1) //if they pick Guess the Box
        {
            guessTheBox();
        }
        else if(choice == 2) //if they pick Spin the Wheel
        {
            spinTheWheel();
        }
        else if(choice == 3) //if they pick Scrambler
        {
            Scrambler();
        }
        else //if they pick anything other than 1 2 or 3
        { 
            System.out.println("This arcade does not have that game, sorry!");
        }
    }
    public static void guessTheBox()
    {
        Random randomGenerator = new Random();
        Scanner kbReader = new Scanner(System.in);
        int n = randomGenerator.nextInt(3);
        System.out.println("Welcome to Guess the Box! There is a prize behind one of 3 boxes.");
        System.out.println("Please type 1, 2, or 3 to select a box: ");
        boolean a = true; //keep loop going until user gets it right
        while(a=true)
        {
            int guess = kbReader.nextInt(); //take user guess
            if(guess==(n+1)) //check if its right
            {
                System.out.println("Congrats! You win 1 million space bucks!");
                break; //break out of while loop
            }
            else
            {
                System.out.println("Please try again.");
            }
        }
        
    }
    public static void spinTheWheel()
    {
        Random randomGenerator = new Random(); //create random object
        Scanner kbReader = new Scanner(System.in); //create scanner 
        System.out.println("Welcome to Spin the Wheel!");
        System.out.println("Please choose a number between 1 and 5 and either black or red.");
        System.out.println("Number: ");
        int userGuess = kbReader.nextInt(); //take user guess for number
        System.out.println("Black or Red: ");
        String userColor = kbReader.next(); //take user guess for color
        System.out.println("Ok, lets spin the wheel!");
        int spinInt = randomGenerator.nextInt(4); //create int between 0 and 4
        int spinColorInt = randomGenerator.nextInt(2); //pick either 0 or 1, corresponding with a color
        String actualSpinColor = "";
        if(spinColorInt == 0) //if it randomly picks 0, make it red
            actualSpinColor = "red";
        else //if it randomly picks 1, make it black
            actualSpinColor = "black";
        if(userColor.equals("Black"))
            userColor = "black";           //this just accounts for capitolization
        if(userColor.equals("Red"));
            userColor = "red";
        
        System.out.println("The wheel has spun " + actualSpinColor + " " + spinInt + "!");     
        if((userGuess == spinInt) && (userColor.equals(actualSpinColor))) //check to see if user is right
        {
            System.out.println("Congrats! You win 1 billion space bucks!");
        }
        else
        {
            System.out.println("You lose!");
        }
    }
    public static void Scrambler()
    {
        Random randomGenerator = new Random(); //create random
        Scanner kbReader = new Scanner(System.in); //create scanner
        System.out.println("Welcome to Scrambler!");
        System.out.println("Please input a word to be scrambled: ");
        String scramble = kbReader.next(); //take input from user
        int length = scramble.length(); //the length of the inputted string
        String result = ""; //final result string 
        for(int i = 0; i <length; i++)  //this loop executes the same amount of times as chars in inputted string
        {
            int n = randomGenerator.nextInt(length)+1; // create random int to correspond to all chars in the string inputted
            result += scramble.charAt(n); //add that char
        }
        System.out.println("The scrambled word: " + result);
    }
}
