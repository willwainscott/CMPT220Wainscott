import java.util.Scanner;

public class matrixDisplay {
	
	public static void main(String[] args) {
		System.out.print("Enter a number for the hight and width of a matrix: ");
		Scanner input = new Scanner(System.in);
		printMatrix(input.nextInt());
	}
	public static void printMatrix(int n) {
		for (int i = n; i > 0; i--) {
			for (int j = n; j > 0; j--) {
				System.out.print(randomNumber() + " ");
			}
			System.out.print("\n");
		}
	}
	
	public static int randomNumber() {
		int a = (int) (Math.random() * 2);
		return a;
	}
}
