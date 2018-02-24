import java.util.Scanner;

public class SumOfElements {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a 3-by-4 matrix row by row: \n");
		double[][] matrix = new double[3][4];
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				matrix[i][j] = input.nextDouble();
			}
		}
		
		for(int i = 0; i < 4; i++) {
			System.out.print("The sum of the elemnets at column " + i + " is " + 
					sumColumn(matrix,i) + "\n");
		}
	}
	
	public static double sumColumn(double[][] m, int columnIndex) {
		double sum = 0;
		for(int i = 0; i < 3; i++) {
			sum += m[i][columnIndex];
		}
		return sum;
		
	}
}
