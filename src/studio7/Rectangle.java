package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	
	//instance variables
	private double length;
	private double width;
	
	
	public Rectangle(double initLength, double initWidth) {
		this.length = initLength;
		this.width = initWidth;
	}
	
	public boolean compareSize(Rectangle r)
	  {
		System.out.print("This rectangle is smaller than the other: ");
	    return this.Area() < r.Area();
	     
	  }
	
	public double Perimeter() {
		return 2*this.length + 2*this.width;
	}
	public double Area() {
		return length * width;
	}
	
	//can only print instance variables
	public void print() {
		System.out.println("The rectangle length: " + this.length);
		System.out.println("The rectangle width: " + this.width);
	}
	
	public boolean Square(Rectangle r) {
	
	
	System.out.print("Rectangle is also a square: ");
	return this.length == this.width;
	}
	
	public double rDraw(double x, double y) {
		
	 StdDraw.filledRectangle(x, y, (this.width)/2.0, (this.length)/2.0);
	return rDraw(x,y);
	}
	
	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle (0.1, 0.2);
		Rectangle r2 = new Rectangle (0.5,0.5);	
		System.out.println(r1.compareSize(r2));
		r1.print();
		System.out.println(r1.Square(r1));
		System.out.println(r2.compareSize(r1));
		r2.print();
		System.out.println(r2.Square(r2));
		
		r2.rDraw(0.1, 0.1);
		r1.rDraw(0.5, 0.5);
	}

	

}
