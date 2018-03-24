
public class Circle2D {
	
	private double x = 0;
	private double y = 0;
	private double radius = 1;
	
	public Circle2D() {}
	
	public Circle2D(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;		
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	public double getPerimeter() {
		return 2.0 * Math.PI * radius;
	}
	
	public boolean contains(double x, double y) {
		return Math.sqrt(Math.pow(x - this.x,2) + Math.pow(y - this.y, 2)) < radius;
	}
	
	public boolean contains(Circle2D circle) {
		return Math.sqrt(Math.pow(circle.getX() - this.x, 2) + 
			Math.pow(circle.getY() - this.y, 2)) + circle.getRadius() < this.radius;
	}
	
	public boolean overlaps(Circle2D circle) {
		 return ((Math.sqrt(Math.pow(circle.getX() - this.x, 2) +
			Math.pow(circle.getY() - this.y, 2)) < circle.getRadius() + this.radius) && 
				 !contains(circle)); 
	}
	
}
