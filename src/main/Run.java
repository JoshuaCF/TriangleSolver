package main;

import java.util.*;

class Run {
	public static void main(String[] args) {
		//Initialize variables
		int counter = 0;
		Scanner input = new Scanner(System.in);
		Double stringAsDouble;
		Double[] triangleSides = new Double[3];
		Double totalArea = (double) 0;
		ArrayList<Triangle> triangleArray = new ArrayList<Triangle>();
		ArrayList<Double> areaArray = new ArrayList<Double>();
		//Start solver
		while(true) {
			String x = input.next(); //Assign user input to x
			
			if(x.equals("Done")) { //Is the user finished
				if(counter == 0) { //Have they filled all triangles
					System.out.println("Printing results...");
					System.out.println("Measures of each triangle: ");
					for(int iteration = 0;iteration < triangleArray.size(); iteration += 1) {
						totalArea = totalArea + triangleArray.get(iteration).getArea();
						triangleArray.get(iteration).print(iteration + 1);
						System.out.println();
					}
					System.out.println("Area of all triangles combined: "  + totalArea);
					System.out.println("Finished, type anything and press enter to exit");
					x = input.next();
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
				triangleArray.add(new Triangle(triangleSides[0], triangleSides[1], triangleSides[2]));
				areaArray.add(new Triangle(triangleSides[0], triangleSides[1], triangleSides[2]).getArea());
			}
		}
		input.close();
	}
}