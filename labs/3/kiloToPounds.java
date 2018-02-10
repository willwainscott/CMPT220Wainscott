
public class kiloToPounds {
	
	public static void main(String[] args) {
		System.out.print("Kilogram\tPounds\t\tPounds\t\tKilograms\n");
		
		int kiloInitial = 1;
		double poundsConvert;
		int poundsInitial = 20;
		double kiloConvert;
		int i = 0;
		do {
			poundsConvert = kiloInitial * 2.2;
			System.out.printf(kiloInitial + "\t\t %.1f\t|\t", poundsConvert);
			kiloInitial += 2;
					
			kiloConvert = poundsInitial * .4545;
			System.out.printf(poundsInitial + "\t\t%.1f \n", kiloConvert);
			poundsInitial += 5;
			
			i++;
		} while (i<100);
		
	}
}
