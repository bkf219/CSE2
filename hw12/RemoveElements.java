import java.util.Scanner;
import java.util.Random;

public class RemoveElements
{
  public static void main(String [] arg)
  {
	Scanner scan=new Scanner(System.in);
    int num[]=new int[10];
    int newArray1[];
    int newArray2[];
    int index,target;
	String answer="";
	do{
  	    System.out.print("Random input 10 ints [0-9]");
  	    num = randomInput();
  	    String out = "The original array is:";
  	    out += listArray(num);
  	    System.out.println(out);
 
      	System.out.print("Enter the index ");
    	index = scan.nextInt();
    	newArray1 = delete(num,index);
  	    String out1="The output array is ";
     	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
  	    System.out.println(out1);
 
          System.out.print("Enter the target value ");
  	    target = scan.nextInt();
  	    newArray2 = remove(num,target);
  	    String out2="The output array is ";
  	    out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
  	    System.out.println(out2);
  	 
  	    System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
  	    answer=scan.next();
	}while(answer.equals("Y") || answer.equals("y"));
  }
 
  public static String listArray(int num[])
  {
	String out="{";
	for(int j=0;j<num.length;j++)
	{
  	    if(j>0)
  	    {
    	    out+=", ";
  	    }
  	    out+=num[j];
	}
	out+="} ";
	return out;
  }
  public static int[] randomInput()
  {
      Random rand = new Random();
      int[] array = new int[10];
      for(int i = 0; i < 10; i++)
      {
          array[i] = rand.nextInt(10);
      }
      return array;
  }
  
  public static int[] delete(int list[], int pos)
  {
      boolean passes = true;
      if(pos>=list.length || pos<0)
      {
          System.out.println("out of bounds");
          passes = false;
          return list; 
      }
    int[] newArray = new int[list.length];
     if(passes)
     {
        for(int i = 0; i<newArray.length; i++)
         {
            if(i==pos)
            {
                  continue;
            }
              newArray[i] = list[i];
        }
      }
      return newArray;
  }
  public static int[] remove(int list[], int target)
  {
      int[] newArray = new int[list.length];
      for(int i = 0; i<list.length; i++)
      {
          boolean found = false;
          if(list[i] == target)
          {
              found = true;
          }
          if(found == false)
          {
              newArray[i] = list[i];
          }
      }
      return newArray;
  }
}
