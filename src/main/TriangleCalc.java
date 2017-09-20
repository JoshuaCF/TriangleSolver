package myprojects.trianglecalc;

import java.util.*;
import java.io.*;

class TriangleCalc {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in); //Initialize variables
		int counter = 0;
		Double[] doubleArray = new Double[3];
		ArrayList<Double> areaArray = new ArrayList<Double>();
		Double stringAsDouble;
		while(true) {
			String x = input.next(); //Look for input
			
			if(x.equals("Done")) { //See if the user is done
				if(counter == 0) { //Check to see if triangle is currently being entered
					System.out.println("Printing results..."); //Println the results
					System.out.println(areaArray);
					break;
				}
				if(counter != 0) { //Warn user that they aren't finished with a triangle and go back to the start
					System.out.println("You still have " + counter + " more entries to input for another triangle. Don't stop in the middle of a triangle.");
					continue;
				}
			} //Things past here will only run if the user has not ended the script by typing done
			
			stringAsDouble = Double.valueOf(x); //Convert the input string to a double
			if(counter == 0) { //See if the counter is zero. If it is, reset back to 3
				counter = 3;
			}
			
			doubleArray[counter - 1] = stringAsDouble; //Set the user input as a value in the array
			
			counter -= 1; //Subtract one from the counter
			if(counter == 0) {
				Double a = doubleArray[0];
				Double b = doubleArray[1];
				Double c = doubleArray[2];
				Double s = (a+b+c)/2;
				Double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
				areaArray.add(area);
			}
		}
	}
}
