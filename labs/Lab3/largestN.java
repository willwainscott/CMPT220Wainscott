
public class largestN {
	
	public static void main(String[] args) {
		int n = 1;
		int largest = 1;
		while ((int) Math.pow(n,3) < 12000) {
			largest = n;
			n++;
		}
		System.out.print("The largest n in which n^3 is less than 12,000 is: " + largest);
	}
}
