package main;
import java.util.*;

public class Run {

	public static void main(String[] args) {
		//Initialize variables
		int counter = 0;
		Scanner input = new Scanner(System.in);
		Double stringAsDouble;
		Double[] triangleSides = new Double[3];
		Double totalArea = (double) 0;
		ArrayList<Double> areaArray = new ArrayList<Double>();
		//Start solver
		while(true) {
			String x = input.next(); //Assign user input to x
			
			if(x.equals("Done")) { //Is the user finished
				if(counter == 0) { //Have they filled all triangles
					System.out.println("Printing results...");
					System.out.println("Area of each triangle in an array: " + areaArray);
					for(int arrLength = areaArray.size();arrLength > 0; arrLength -= 1) {
						totalArea = totalArea + areaArray.get(arrLength - 1);
					}
					System.out.println("Area of all triangles combined: "  + totalArea);
					break;
				}
				if(counter != 0) { //If not, go back and warn them
					System.out.println("You still have " + counter + " sides more left of a triangle you started. Did you make a mistake?");
					continue;
				}
			}
			stringAsDouble = Double.valueOf(x);
			if(counter == 0) {
				counter = 3;
			}
			triangleSides[counter - 1] = stringAsDouble;
			
			counter -= 1;
			if(counter == 0) {
				Double a = triangleSides[0];
				Double b = triangleSides[1];
				Double c = triangleSides[2];
				Double s = (a + b + c)/2;
				Double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
				areaArray.add(area);
			}
		}
		input.close();
	}

}
