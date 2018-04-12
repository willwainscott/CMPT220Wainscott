
public class ColorableTest {
	
	public static void main(String[] args) {
		
		Object[] shapes = new Object[5];
		
		shapes[0] = new Square(5);
		shapes[1] = new Square(25);
		shapes[2] = new Circle(3);
		shapes[3] = new Square(10);
		shapes[4] = new Circle(7);
		
		for (int i = 0; i < shapes.length; i++) {
			System.out.print("Area: " + ((GeometricObject) shapes[i]).getArea() + " ");
			if (shapes[i] instanceof Colorable)
				((Square) shapes[i]).howToColor();
			System.out.print("\n");
		}
	}
}
