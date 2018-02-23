import java.util.Scanner;

public class A1Paper {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int smallestSize = input.nextInt();
		double tapeLength = 0;
		boolean possible = false;
		
		int neededPieces = 2;
		int amountOfPieces = 0;
		for(int i = 2; i <= smallestSize; i++) {
			amountOfPieces = input.nextInt();
			tapeLength += (neededPieces/2) * calculateTapePiece(i);
			
			if (amountOfPieces >= neededPieces) {
				possible = true;
				break;
			}
			neededPieces = (neededPieces - amountOfPieces) * 2;
		}
		if (possible) {
			System.out.print(tapeLength);
		} else {
			System.out.print("impossible");
		}
	}
	
	public static double calculateTapePiece(int size) {
		return (Math.pow(2.0, .25)) * Math.pow(Math.sqrt(2) / 2, size);
	}
}
