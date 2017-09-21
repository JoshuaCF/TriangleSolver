package trianglecalc;

import java.util.*;

public class Triangle {
	//Properties
	public Double a; //Base
	public Double b;
	public Double c;
	public Double h;
	public Double area;
	//Constructor
	public Triangle(Double a, Double b, Double c) {
		this.a = a;
		this.b = b;
		this.c = c;
		setArea();
		setHeight();
	}
	//Methods
	private void setArea() {
		Double s = (this.a + this.b + this.c)/2;
		this.area = Math.sqrt(s * (s - this.a) * (s - this.b) * (s - this.c));
	}
	private void setHeight() {
		this.h = 2 * (this.area / this.a);
	}
}
