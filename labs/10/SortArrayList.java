import java.util.ArrayList;

public class SortArrayList {

	public static void sort(ArrayList<Number> list) {
		
		int n = list.size();
		Number temp;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (list.get(j).doubleValue() > list.get(j + 1).doubleValue()) {
					temp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, temp);
				}	
			}
		}
	}

	/*Testing the sort */
	public static void main(String[] args) {
	
	ArrayList<Number> n1 = new ArrayList<Number>();
	
	n1.add(5);
	n1.add(6);
	n1.add(1);
	n1.add(2);
	n1.add(7);
	n1.add(8);
	n1.add(3);
	n1.add(4);
	
	sort(n1);
	
	System.out.print(n1);
	}
}
