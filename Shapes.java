package shapes;
import java.util.Scanner;

public class Shapes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter side1: ");
		double side1 = input.nextDouble();
		
		System.out.print("Enter side2: ");
		double side2 = input.nextDouble();
		
		System.out.print("Enter side3: ");
		double side3 = input.nextDouble();
		
		Triangle tri = new Triangle(side1, side2, side3);
		
		System.out.print("Enter color: ");
		tri.setColor(input.next());
		
		System.out.print("Enter 'true' or 'false' for filled");
		tri.setFilled(input.nextBoolean());
		
		printTriangle(tri);

	}
	
	public static void printTriangle(Triangle t) {
		System.out.printf("Area: %f Perimeter: %f Color: %s Date created: %s Filled: %b\r",
				t.getArea(), t.getPerimeter(), t.getColor(), t.getDateCreated(), t.isFilled());
	}

}

class GeometricObject {
	protected String color;
	protected Boolean filled;
	protected String dateCreated;
	protected java.util.Date date = new java.util.Date();
	
	protected GeometricObject() {
		color = "White";
		filled = false;
		dateCreated = date.toString();
	}
	
	public void setColor(String str) {
		color = str;
	}
	
	public void setFilled(boolean b) {
		filled = b;
	}
	
	public String getColor() {
		return color;
	}
	
	public String getDateCreated() {
		return dateCreated;
	}
	
	public boolean isFilled() {
		return filled;
	}
}

class Circle extends GeometricObject implements Comparable<Circle> {
	private double radius;
	
	public Circle() {
		radius = 1;
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public void setRadius(double rad) {
		radius = rad;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		return (Math.PI * Math.pow(radius, 2));
	}
	
	@Override
	public int compareTo(Circle o) {
		if (getArea() > o.getArea())
			return 1;
		if (getArea() < o.getArea())
			return -1;
		else
			return 0;
	}
	
	@Override
	public String toString() {
		return "Circle with a radius of " + radius;
	}
}

class Octagon extends GeometricObject implements Cloneable, Comparable<Octagon> {
	private double sideLength;
	
	public Octagon() {
		sideLength = 1;
	}
	
	public Octagon(double sideLength) {
		this.sideLength = sideLength;
	}
	
	public void setSideLength(double sideLength) {
		this.sideLength = sideLength;
	}
	
	public double getSideLength() {
		return sideLength;
	}
	
	public double getArea() {
		return 2 * (1 + Math.sqrt(2) * Math.pow(sideLength, 2));
	}
	
	@Override
	public Object clone() {
		try {
			return super.clone();
		}
		catch (CloneNotSupportedException e) {
			return null;
		}
	}
	
	@Override
	public int compareTo(Octagon o) {
		if (getArea() > o.getArea())
			return 1;
		if (getArea() < o.getArea())
			return -1;
		else
			return 0;
	}
	
	@Override
	public String toString() {
		return "Octagon with a side length of " + sideLength;
	}
}

class Rectangle extends GeometricObject {
	private double width, height;
	
	public Rectangle() {
		width = 0.0;
		height = 0.0;
	}
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
}

class Triangle extends GeometricObject implements Comparable<Triangle> {
	private double side1, side2, side3;
	
	public Triangle() {
		side1 = 0;
		side2 = 0;
		side3 = 0;
	}
	
	public Triangle(double s1, double s2, double s3) {
		side1 = s1;
		side2 = s2;
		side3 = s3;
	}
	
	public double getSide1() {
		return side1;
	}
	
	public double getSide2() {
		return side2;
	}
	
	public double getSide3() {
		return side3;
	}
	
	public double getArea() {
		return (side1 + side2 + side3) / 2;
	}
	
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
	
	@Override
	public int compareTo(Triangle o) {
		if (getArea() > o.getArea())
			return 1;
		if (getArea() < o.getArea())
			return -1;
		else
			return 0;
	}
	
	@Override
	public String toString() {
		return "Triangle: side1 = " + side1 + "side2  = " + side2 + "side3 = " + side3;
	}
}