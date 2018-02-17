
public class sumSeries {
	
	public static void main(String[] args) {
		System.out.printf("%-8s \t %8s\n","i","n(i)");
		System.out.print("---------------------------\n");
		for (double i = 1; i <= 20; i++) {
			System.out.printf("%-8.1f \t %8.4f\n",i,summation(i));
		}
	}
	
	public static double summation(double startingNumber) {
		double summation = 0;
		for (double i = startingNumber ; i > 0; i--) {
			summation += (i / (i + 1.0));
		}
		return summation;
	}
}
