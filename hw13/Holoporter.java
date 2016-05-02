///////////////////////////////////////////////////////////////
// Brian Falkenstein
// CSE 2
// Homework 13
// May 3 2016
import java.util.Random;
import java.util.Scanner;
//this code will mimic Microsofts Holoport technology using 3 dimensional ragged arrays
public class Holoporter
{
    public static void main(String args[])
    {
        String[][][] holoport1 = soRandom(); //use soRandom to generate a random 3D ragged String array
        for(int row = 0; row < holoport1.length; row++)//these following 3 nested for loops will traverse the 3D array and fill each element with a molecule using coder
        {
            for(int col = 0; col < holoport1[row].length; col++)
            {
                for(int idk = 0; idk < holoport1[row][col].length; idk++)
                {
                    holoport1[row][col][idk] = coder();
                }
            }
        }
        //print it
        //System.out.println(print(holoport));
        String[][][] holoportCopy = soRandom(); //use soRandom to generate another empty 3D random ragged array
        holoport(holoport1, holoportCopy);
        Scanner kbReader = new Scanner(System.in);
        System.out.println("Please input a code in the form of XXYYYY to be searched: ");
        String search;
        while(true){
            search = kbReader.next();
            if(search.length() == 6){ break;}
            else{System.out.println("Wrong format, please try again.");}
        }
        System.out.println(sampling(holoportCopy,search));
    }
    public static String[][][] soRandom() //this method will generate a random 3d ragged array
    {
        Random rand = new Random(); //create random object
        int firstSize = rand.nextInt(10) + 1; //first dimension size of 1 to 10
        String[][][] random3D = new String[firstSize][][]; //create the 3D array, and set first dimension 
        for(int i = 0; i<firstSize; i++) //this loop will go through the first dimension and assign each position with a 2nd dimensional array
        {
            int secondSize = rand.nextInt(10) + 1;
            random3D[i] = new String[secondSize][];
            for(int j = 0; j < secondSize; j++) //this loop will go through the second dimension and assign each position with a 3rd dimensional array
            {
                int thirdSize = rand.nextInt(10) + 1;
                random3D[i][j] = new String[thirdSize];
            }
        }
        return random3D; //returns the 3d array
    }
    public static String coder() //this method will produce a random string of the format XXYYY where X is a char from A to Z and Y is an int from 0 to 9
    {
        String code = ""; //create the empty string
        Random rand = new Random(); //generate random object
        char firstXChar = (char)(rand.nextInt(26) + 65); //generate a random number from 65 (represents A) and 90(Z) and assign it to a char
        char secondXChar = (char)(rand.nextInt(26) + 65);
        code = code + firstXChar + secondXChar;
        for(int i = 0; i < 4; i++) //this will just add 4 random ints from 0 to 9 to the string
        {
            code += rand.nextInt(10);
        }
        return code;
    }
    public static String print(String string3D[][][])
    {
        String printed = "";
        for(int row = 0; row < string3D.length; row++)//these following 3 nested for loops will traverse the 3D array and fill each element with a molecule using coder
        {
            for(int col = 0; col < string3D[row].length; col++)
            {
                printed+="[";
                for(int idk = 0; idk < string3D[row][col].length; idk++)
                {
                    printed+=string3D[row][col][idk];
                    printed+=", ";
                }
                printed+="]|";
            }
            printed+="---";
        }
        return printed;
    }
    public static void holoport(String holoport[][][], String holoportCopy[][][])
    {
        for(int row = 0; row < holoportCopy.length; row++)
        {
            if(holoportCopy[row].length<holoport[row].length){
                for(int col = 0; col < holoportCopy[row].length; col++)
                {
                    if(holoportCopy[row][col].length <= holoport[row][col].length){ 
                        for(int idk = 0; idk < holoportCopy.length; idk++){
                            holoportCopy[row][col][idk] = holoport[row][col][idk];
                        }
                    }    
                    
                    else if(holoportCopy[row][col].length > holoport[row][col].length){
                        for(int idk = 0; idk < holoport[row][col].length; idk++){
                            holoportCopy[row][col][idk] = holoport[row][col][idk];
                        }
                        for(int idk = holoport[row][col].length-1; idk < holoportCopy[row][col].length; idk++){
                            holoportCopy[row][col][idk] = "$$$$$$";
                        }
                    }
            }
            }
            else{
                for(int col = 0; col < holoport[row].length; col++){
                    if(holoportCopy[row][col].length <= holoport[row][col].length){
                        for(int idk = 0; idk < holoportCopy.length; idk++){
                            holoportCopy[row][col][idk] = holoport[row][col][idk];
                        }
                    }    
    
                    else if(holoportCopy[row][col].length > holoport[row][col].length){
                        for(int idk = 0; idk < holoport[row][col].length; idk++){
                            holoportCopy[row][col][idk] = holoport[row][col][idk];
                        }
                        for(int idk = holoport[row][col].length-1; idk < holoportCopy[row][col].length; idk++){
                            holoportCopy[row][col][idk] = "$$$$$$";
                        }
                    }
                }
                for(int col2 = (holoport[row].length - 1); col2 < holoportCopy[row].length; col2++){
                    for(int idk = 0; idk < holoportCopy[row][col2].length; idk++){
                        holoportCopy[row][col2][idk] = "$$$$$$";
                    }
                }
            }
        }
    }
    public static String sampling(String string3D[][][], String search){
        boolean isFound = false;
        String answer = "";
        for(int row = 0; row < string3D.length; row++){ //these loops will go through the array
            for(int col = 0; col < string3D[row].length; col++){
                for(int idk = 0; idk < string3D[row][col].length; idk++){
                    if(string3D[row][col][idk].equals(search)){
                        answer = "(" + row +  ", " + col + ", " + idk + ")"; //if its found, print out the location in the designated format
                        isFound = true; //this will check later to see if it should print out that it hasnt been foudn
                    }
                }
            }
        }
        if(isFound = false){
            answer = "Code not found.";
        }
        return answer; //return statement
    }
    public static double percentage(String first[][][], String second[][][]){ //will compare two 3D arrays to see how similar they are
        int amountFirst = 0; //amount of elements in first array
        int amountSecond = 0; //in second array 
        for(int row = 0; row < first.length; row++){//these loops will just count the first array
            for(int col = 0; col < first[row].length; col++){
                for(int idk = 0; idk < first[row][col].length; idk++){
                    amountFirst++;
                }
            }
        }
        for(int row = 0; row < second.length; row++){ //these will count the second
            for(int col = 0; col < second[row].length; col++){
                for(int idk = 0; idk < second[row][col].length; idk++){
                    amountSecond++;
                }
            }
        }
        int difference = amountFirst - amountSecond; //compare first and second and print out their percentage
        return((difference/amountFirst)*100);
    }
    public static String[][][] frankenstein(String string3D[][][]){ //this will reorder the third dimension alphebetically baesd on the XX and order the second dimension by size
        for(int row = 0; row < string3D.length; row++){ //this will go through the array
            for(int col = 0; col < string3D[row].length; col++){
                for(int idk = 0; idk < string3D[row][col].length-1; idk++){
                    int minIndex = idk; //for re-arranging array, this will be the index of the first alphebetical string
                    for(int j = idk + 1; j < string3D[row][col].length; j++){
                        int charValue = (int)(string3D[row][col][j].charAt(0));
                        if(charValue < ((int)(string3D[row][col][idk].charAt(0)))){
                            minIndex = j;
                        }
                    }
                    String temp = string3D[row][col][idk];
                    string3D[row][col][idk] = string3D[row][col][minIndex];
                    string3D[row][col][minIndex] = temp;
                }
            }
        }
        for(int row = 0; row < string3D.length-1; row++){ //this will go through to reoder the second dimension by lentgh
            int minIndex = row;
            for(int j = row + 1; j < string3D.length; j++){
                if(string3D[j].length < string3D[row].length){
                    minIndex = j;
                }
            }
            String[][] temp = string3D[row];
            string3D[row] = string3D[minIndex];
            string3D[minIndex] = temp;
        }
        return string3D;
    }
}