

public class RectangleTest {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle();
		r1.width = 4;
		r1.height = 40;
		
		Rectangle r2 = new Rectangle();
		r2.width = 3.5;
		r2.height = 35.9;
		
		System.out.print("r1's width is " + r1.width + ", height is " + r1.height + 
				", area is " + r1.getArea() + ", and perimeter is " + r1.getArea() + 
				". \n");
		System.out.print("r2's width is " + r2.width + ", height is " + r2.height + 
				", area is " + r2.getArea() + ", and perimeter is " + r2.getArea() + 
				".");	
	}
}
