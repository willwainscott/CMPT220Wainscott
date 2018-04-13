import  java.util.Scanner;

public class computeDeviation {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter 10 numbers: ");
		double[] numbers = new double[10];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextDouble();
		}
		
		System.out.printf("The mean is %.2f \n",mean(numbers));
		System.out.printf("The standard deviation is %.5f",deviation(numbers));
	}
	
	public static double deviation(double[] x) {
		double numerator = 0;
		double mean = mean(x);
		for (int i = 0; i < x.length; i++) {
			numerator += Math.pow(x[i] - mean,2);
		}
		return Math.sqrt(numerator/(x.length -1));
	}
	
	public static double mean(double[] x) {
		double numerator = 0; 
		for (int i = 0; i < x.length; i++) {
			numerator += x[i];
		}
		return numerator/x.length;
	}
}
