// Brian Falkensetin 
// lab 2
// February 5, 2016
// CSE 2
// given time and rotation, calculate distance

public class Cyclometer
{
    //main method required for every class
    public static void main (String args[])
    {
        //input data
       	int secsTrip1=480;  //time for trip 1
       	int secsTrip2=3220;  //time for trip 2
		int countsTrip1=1561;  //rotation count for trip 1
		int countsTrip2=9037; //rotation count for trip 2
		
		//useful constants
		
		double wheelDiameter=27.0,  //diameter of bike wheel
  	    PI=3.14159, //constant pi
    	feetPerMile=5280,  //conversion of feet to mile
  	    inchesPerFoot=12,   //conversion of inches to feet
  	    secondsPerMinute=60;  //conversion of seconds to minutes
	    double distanceTrip1, distanceTrip2, totalDistance;  //instantiating distance variables
	    
	    //print out information
	    
	    System.out.println("Trip 1 took "+
       	     (secsTrip1/secondsPerMinute)+" minutes and had "+
       	      countsTrip1+" counts.");
	    System.out.println("Trip 2 took "+
       	     (secsTrip2/secondsPerMinute)+" minutes and had "+
       	      countsTrip2+" counts.");
       	      
     	//now convert distance to miles
     	//for each count, a rotation of the wheel travels 
     	//the radius times Pi
    	//distanceTrip1=inchesPerFoot*feetPerMile; // Gives distance in miles
    	distanceTrip1=countsTrip1*wheelDiameter*PI/inchesPerFoot/feetPerMile;
    	distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
    	totalDistance=distanceTrip1+distanceTrip2;
    	
    	//print out the desired output
    	System.out.println("Trip 1 was "+distanceTrip1+" miles");
    	System.out.println("Trip 2 was "+distanceTrip2+" miles");
    	System.out.println("The total distance was "+totalDistance+" miles");
  
    }//end of main method
}//end of class