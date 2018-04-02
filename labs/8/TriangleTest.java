import java.util.Scanner;

public class TriangleTest {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the three side of the triangle, a color, and "
				+ " a boolean value of whether or not it is filled: ");
		
		Triangle testTriangle = new Triangle(input.nextDouble(), input.nextDouble(), 
				input.nextDouble());
		
		testTriangle.setColor(input.next());
		testTriangle.setFilled(input.nextBoolean());
		
		System.out.print("\nTriangle area: " + testTriangle.getArea() + 
				"\nTriangle perimeter: " + testTriangle.getPerimeter() + 
				"\nTriangle color: " + testTriangle.getColor() + 
				"\nTriangle filled: " + testTriangle.isFilled());
	}
}
