import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListSort {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Double> list = new ArrayList<Double>();
		
		System.out.print("Enter five numbers to see them in order: ");
		for (int i = 0; i < 5; i++) {
			list.add(input.nextDouble());
		}
		
		sort(list);
		System.out.print(list);
	}
	
	public static void sort(ArrayList<Double> list) {
		Collections.sort(list);
	}
}
