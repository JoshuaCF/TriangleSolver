package main;

public class Triangle {
	//Properties
	public Double a; //Base
	public Double b;
	public Double c;
	public Double h;
	public Double area;
	public Double angleAB;
	public Double angleBC;
	public Double angleAC;
	public RightTriangle triangleBH;
	public RightTriangle triangleCH;
	
	//Constructor
	public Triangle(Double a, Double b, Double c) { //There will be a triangle with sides a, b, c, and height h with a as the base
		this.a = a;
		this.b = b;
		this.c = c;
		setArea();
		setHeight();
		setAngles();
	}
	
	//Methods
	private void setArea() {
		Double s = (this.a + this.b + this.c)/2;
		this.area = Math.sqrt(s * (s - this.a) * (s - this.b) * (s - this.c));
	}
	private void setHeight() {
		this.h = 2 * (this.area / this.a);
	}
	public void setAngles() {
		triangleBH = new RightTriangle(this.b, this.h); //Left half
		triangleCH = new RightTriangle(this.c, this.h); //Right half
		this.angleAB = triangleBH.getAngleAC();
		this.angleAC = triangleCH.getAngleAC();
		this.angleBC = triangleCH.getAngleAB() + triangleBH.getAngleAB();
	}
	
	public Double getArea() {
		return this.area;
	}
	public Double getHeight() {
		return this.h;
	}
	
	public void print(int triangle) {
		System.out.println("Triangle: " + triangle);
		System.out.println("	Side a: " + this.a);
		System.out.println("	Side b: " + this.b);
		System.out.println("	Side c: " + this.c);
		System.out.println("		Angle ab: " + this.angleAB);
		System.out.println("		Angle bc: " + this.angleBC);
		System.out.println("		Angle ac: " + this.angleAC);
		System.out.println("	Height with a as base: " + this.h);
		System.out.println("	Area: " + this.area);
	}
}