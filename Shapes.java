package objects;

public class Shapes {

	public static void main(String[] args) {
		Circle cir1 = new Circle(4.5, "Red", true);
		
		String cir1Info = cir1.getInfo();
		System.out.println(cir1Info);
		System.out.println(cir1);
		
		//Rectangle rec1 = new Rectangle("Blue", false, 5.6, 7.8);
		//Rectangle rec2 = new Rectangle();
		
		//System.out.println(rec1.getColor() + " " + rec1.height);
		//System.out.println(rec2.getColor() + " " + rec2.isFilled());

	}

}

class GeometricObject {
	private boolean filled;
	private String color;
	
	GeometricObject() {
		filled = false;
		color = "White";
	}
	
	GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	
	void setColor(String color) {
		this.color = color;
	}
	
	void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	String getColor() {
		return color;
	}
	
	boolean isFilled() {
		return filled;
	}
	
	String getInfo() {
		String info = String.format("Color: %s\risFilled: %b\r", color, isFilled());
		return info;
	}
}

class Circle extends GeometricObject {
	double radius;
	
	Circle() {
		super();
		radius = 1;
	}
	
	Circle(double radius, String color, boolean filled) {
		super(color, filled);
		
		this.radius = radius;
	}
	
	void setRadius(double radius) {
		this.radius = radius;
	}
	
	double getRadius() {
		return radius;
	}
	
	@Override
	String getInfo() {
		String circleInfo = super.getInfo().concat(String.format("Radius: %.2f", radius));
		return circleInfo;
	}
	
	@Override
	public String toString() {
		return "Circle with a radius of " + radius;
	}
}

class Rectangle extends GeometricObject{
	double width;
	double height;
	
	Rectangle() {
		width = 1;
		height = 1;
	}
	
	Rectangle(String color, boolean filled, double width, double height) {
		super(color, filled);
		this.width = width;
		this.height = height;
	}
	
	void setWidth(double width) {
		this.width = width;
	}
	
	void setHeight(double height) {
		this.height = height;
	}
	
	double getWidth() {
		return width;
	}
	
	double getHeight() {
		return height;
	}
	
	void flip() {
		double temp = width;
		width = height;
		height = temp;
	}
	
	@Override
	String getInfo() {
		String circleInfo = super.getInfo().concat(String.format("Width: %.2f\rHeight: %.2f", width, height));
		return circleInfo;
	}
}