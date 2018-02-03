import java.util.Scanner;

public class financialPayRoll {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter employee's name: ");
		String name = input.next();
		
		System.out.print("Enter number of hours worked in a week: ");
		double hours = input.nextDouble();
		
		System.out.print("Enter hourly pay rate: ");
		double rate = input.nextDouble();
		
		System.out.print("Enter federal tax withholding rate: ");
		double federalRate = input.nextDouble();
		
		System.out.print("Enter state tax withholding rate: ");
		double stateRate = input.nextDouble();
		
		double grossPay = hours * rate;
		double federalAmount = grossPay * federalRate;
		double stateAmount = grossPay * stateRate;
		double totalDeductions = federalAmount + stateAmount;
		double netPay = grossPay - totalDeductions;
		double statePercent = stateRate * 100;
		double federalPercent = federalRate * 100;
		
		System.out.println("\nEmployee Name: " + name);
		System.out.printf("Hours worked: %.1f \n", hours);
		System.out.printf("Pay Rate: $%.2f \n", rate);
		System.out.printf("Gross Pay: $%.2f \n", grossPay);
		System.out.print("Deductions: \n");
		System.out.printf("  Federal Withholding (%.1f%%): $%.2f \n", federalPercent, federalAmount);
		System.out.printf("  State Withholding (%.1f%%): $%.2f \n", statePercent, stateAmount);
		System.out.printf("  Total Withholding: $%.2f \n", totalDeductions);
		System.out.printf("Net Pay: $%.2f", netPay);
		
	}
}
