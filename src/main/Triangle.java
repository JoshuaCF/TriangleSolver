package main;

public class Triangle {
	private Double a;
	private Double b;
	private Double c;
	private Double s;
	private Double area;
	private Double h;
	
	public Triangle(Double a, Double b, Double c) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.s = (this.a + this.b + this.c)/2;
		this.area = Math.sqrt(this.s * (this.s - this.a) * (this.s - this.b)* (this.s - this.c));
		this.h = (double) 0;
	}
	
	
}