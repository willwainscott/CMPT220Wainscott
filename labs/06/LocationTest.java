import java.util.Scanner;

public class LocationTest {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of rows and colunms in the array: ");
		double[][] matrix = new double[input.nextInt()][input.nextInt()];
		
		System.out.print("Enter the array: \n");
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = input.nextDouble();
			}
		}
		
		System.out.print("The location of the largest element is " + 
				locateLocation(matrix).maxValue + " at (" + locateLocation(matrix).row +
				", " + locateLocation(matrix).column + ")");
	}
	
	public static Location locateLocation(double[][] a) {
		Location highestLocation = new Location(0, 0, a[0][0]);
		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j < a[0].length; j++) {
				if((double) a[i][j] > highestLocation.maxValue) {
					highestLocation.setLocation(i,j);
					highestLocation.setmaxValue(a[i][j]);
				}
			}
		}
		return highestLocation;
	}
}
