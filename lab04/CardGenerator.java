///////////////////////////////////////////////////////////////
// Brian Falkenstein
// CSE 2
// Lab 3
// Feb 12 2016


public class CardGenerator
{
    public static void main(String args[])
    {
        int card = (int)(Math.random()*52 + 1); //generate a random number from 1 to 52
        String suit; //for use in if statemetns 
        if(card>=1 && card<=13) //check for diamonds
        {
            suit = "Diamonds";
        }
        else if(card>=14 && card<=26) //check for clubs
        {
            suit = "Clubs";
        }
        else if(card>=27 && card<=39) //check for hearts
        {
            suit = "Hearts";
        }
        else //default to spades
        {
            suit = "Spades";
        }
        
        int number = card%13; //determine the number on the card
        String face = ""; //what we will be storing the number/face in to print out
        switch(number)//set up cases for numbers
        {
        case 1:
            face="One";
        break;
        case 2:
            face="Two";
        break;
        case 3:
            face="Three";
        break;
        case 4:
            face="Four";
        break;
        case 5:
            face="Five";
        break;
        case 6:
            face="Six";
        break;
        case 7:
            face="Seven";
        break;
        case 8:
            face="Eight";
        break;
        case 9:
            face="Nine";
        break;
        case 10:
            face="10";
        break;
        case 11:
            face="Jack";
        break;
        case 12:
            face="Queen";
        break;
        case 13:
            face="King";
        break;
        case 0:
            face="Ace";
        break;
        }
        
        System.out.println("You picked a " + face + " of " + suit + ".");
        System.out.println(card);
    }
}