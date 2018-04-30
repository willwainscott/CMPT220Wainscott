// JA: No test class?
public class Circle extends GeometricObject implements Comparable<Circle> {

	private double radius;
	
	public Circle() {}
	
	public Circle(double radius) {
		this.radius = radius;		
	}
	
	public Circle(double radius, String color, boolean filled) {
		this.radius = radius;
		setColor(color);
		setFilled(filled);
	}

	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	public double getDiameter() {
		return radius * 2;
	}
	
	@Override
	public double getPerimeter() {
		return 2.0 * Math.PI * radius;
	}
	
	public void printCircle() {
		System.out.print("The circle is created " + getCreatedDate() + 
				" and the radius is " + radius);
	}

	@Override
	public boolean equals(Object o) {
		return this.radius == ((Circle) o).getRadius();
	}

	@Override
	public int compareTo(Circle o) {
		if (getRadius() > o.getRadius())
			return 1;
		else if (getRadius() < o.getRadius())
			return -1;
		else
			return 0;
	}
}
