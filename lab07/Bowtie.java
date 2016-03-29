///////////////////////////////////////////////////////////////
// Brian Falkenstein
// CSE 2
// Lab 7
// March 11 2016
import java.util.Scanner; 
//this program will generate a bowtie 
public class Bowtie
{
    public static void main(String args[])
    {
        int i = 0; //first loop variable
		int j = 0; //second loop variable
		int width = 9; //set width of bowtie
		int height = width; //at start, heigh is same
		String output = ""; //null string to be added to later
		
		while(j < height / 2) //top part
		{
			while(i < j) 
			{
				output += " "; //print the blank spaces before the asterisks
				i++;
			}
			while(i < width - j)
			{
				output += "*"; //print the right amount of asterisks after spaces
				i++; //note: no spaces added after asterisks, just blank
			}
			output += "\n"; //create new line 
			i = 0; //reset i
			j++; //incriment j
		}
		
		while(j >= 0) //second half
		{
			while(i < j)
			{
				output += " "; //again, add blank spaces
				i++; //note: j is already 4 from previous loop
			}
			while(i < width - j)
			{
				output += "*"; //add asterisks 
				i++;
			}
			output += "\n"; //new line
			i = 0; //reset i
			j--; //incriment j down
		}
		System.out.print(output);
    }
}
