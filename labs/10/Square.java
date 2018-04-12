
public class Square extends GeometricObject implements Colorable {
	
	private double side;
	
	public Square() {}
	
	public Square(double side) {
		this.side = side;
	}

	public double getSide() {
		return side;
	}
	
	public void setSide(double a) {
		side = a;
	}
	
	@Override
	public double getArea() {
		return side * side;
	}
	
	@Override
	public double getPerimeter() {
		return side * 4;
	}
	
	@Override
	public void howToColor() {
		System.out.print("Color all four sides");
	}

}
