import java.util.Scanner;

public class AddingTwoMatrices {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter matrix1: ");
		double[][] matrix1 = new double[3][3];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				matrix1[i][j] = input.nextDouble();
			}
		}
	
		System.out.print("Enter matrix2: ");
		double[][] matrix2 = new double[3][3];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				matrix2[i][j] = input.nextDouble();
			}
		}
		double[][] matrix3 = addMatrix(matrix1,matrix2);
		
		System.out.printf("%4.1f %4.1f %4.1f     ",matrix1[0][0],matrix1[0][1],matrix1[0][2]);
		System.out.printf("%4.1f %4.1f %4.1f     ",matrix2[0][0],matrix2[0][1],matrix2[0][2]);
		System.out.printf("%4.1f %4.1f %4.1f   \n",matrix3[0][0],matrix3[0][1],matrix3[0][2]);
		System.out.printf("%4.1f %4.1f %4.1f  +  ",matrix1[1][0],matrix1[1][1],matrix1[1][2]);
		System.out.printf("%4.1f %4.1f %4.1f  =  ",matrix2[1][0],matrix2[1][1],matrix2[1][2]);
		System.out.printf("%4.1f %4.1f %4.1f   \n",matrix3[1][0],matrix3[1][1],matrix3[1][2]);
		System.out.printf("%4.1f %4.1f %4.1f     ",matrix1[2][0],matrix1[2][1],matrix1[2][2]);
		System.out.printf("%4.1f %4.1f %4.1f     ",matrix2[2][0],matrix2[2][1],matrix2[2][2]);
		System.out.printf("%4.1f %4.1f %4.1f   \n",matrix3[2][0],matrix3[2][1],matrix3[2][2]);
	}
	
	public static double[][] addMatrix(double[][] a, double[][] b){
		double[][] matrix3 = new double[3][3];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				matrix3[i][j] = a[i][j] + b[i][j];
			}
		}
		return matrix3;
	}
}