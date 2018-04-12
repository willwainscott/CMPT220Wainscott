
public class OctagonTest {
	
	public static void main(String[] args) {
		
		Octagon oct1 = new Octagon(5);
		
		System.out.println("Area: " + oct1.getArea());
		System.out.println("Perimeter: " + oct1.getPerimeter());
		
		Octagon oct2 = (Octagon) oct1.clone();
		
		if (oct1.compareTo(oct2) == 0)
			System.out.print("The coloned octagon is the same as the orignial");
	}
}
