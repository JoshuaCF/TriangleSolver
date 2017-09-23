package main;

public class RightTriangle {
	//Properties
	public Double a; //Hypotenuse
	public Double b; //Height
	public Double angleAB;
	public Double angleAC;
	
	//Constructor
	public RightTriangle(Double a, Double b) {
		this.a = a;
		this.b = b;
		findAngles();
	}
	
	//Methods
	public void findAngles() {
		this.angleAB = Math.toDegrees(Math.asin(this.b / this.a));
		this.angleAC = Math.toDegrees(Math.asin(this.b / this.a));
	}
	
	public Double getAngleAB() {
		return this.angleAB;
	}
	public Double getAngleAC() {
		return this.angleAC;
	}
}