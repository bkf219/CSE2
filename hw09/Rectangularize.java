///////////////////////////////////////////////////////////////
// Brian Falkenstein
// CSE 2
// HW 9
// March 29 2016
import java.util.Scanner; //import the scanner class
import java.util.Random; //import random class

public class Rectangularize
{
    public static void main(String args[])
    {
        Homework(3);
    }
    public static void Homework(String input)
    {
        int length = input.length();
        for(int i = 0; i<length; i++)
        {
            System.out.println(input);
        }
    }
    public static void Homework(int input)
    {
        String result = "";
        for(int i = 0; i < input; i++)
        {
            for(int j = 0; j < input; j++)
            {
            result += "%";
            }
        result += "\n";
        }
        System.out.println(result);
    }
}