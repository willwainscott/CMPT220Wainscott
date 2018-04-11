import java.util.Scanner;
public class OutOfBounds {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] test = new int[100];
		
		for (int i = 0; i < test.length; i++) {
			test[i] = (int) (Math.random() * 10.0);
		}
		
		System.out.print("Enter the index to see the assigned value: ");
		
		try {
			System.out.print(test[input.nextInt()]);
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.print("Out of Bounds");
		}
		
	}
}
