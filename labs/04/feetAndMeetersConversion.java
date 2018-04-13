
public class feetAndMeetersConversion {

	public static double footToMeter(double foot) {
		double meter = .305 * foot;
		return meter;
	}
	
	public static double meterToFoot(double meter) {
		double foot = 3.279 * meter;
		return foot;
	}
	
	public static void main(String[] args) {
		System.out.printf("%-8s%8s \t | \t %-8s%8s\n","Feet","Meters","Meters","Feet");
		System.out.print("--------------------------------------------------\n");
		for (double i = 1, j = 20; i <= 10; i++, j+= 5) {
			System.out.printf("%-8.1f%8.3f \t | \t %-8.1f%8.3f\n",i,footToMeter(i),j,meterToFoot(j));
		}
	}
}
