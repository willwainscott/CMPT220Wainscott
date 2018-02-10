import java.util.Scanner;

public class celsiusToFarenhiet {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter tmperature in Celsius degrees: ");
		double celsius = input.nextDouble();
		
		double farenheit = (9.0 / 5) * celsius + 32;
		System.out.println("The temperature in Farnheit is: " + farenheit);
			
	}
	
}
