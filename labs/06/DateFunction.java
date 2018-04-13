import java.util.Date;

public class DateFunction {
	
	public static void main(String[] args) {
		
		Date d1 = new Date(10000);
		Date d2 = new Date(100000);
		Date d3 = new Date(1000000);
		Date d4 = new Date(10000000);
		Date d5 = new Date(100000000);
		Date d6 = new Date(1000000000);
		Date d7 = new Date(100000000 * 100);
		Date d8 = new Date(100000000 * 1000);
		
		System.out.println(d1.toString());
		System.out.println(d2.toString());
		System.out.println(d3.toString());
		System.out.println(d4.toString());
		System.out.println(d5.toString());
		System.out.println(d6.toString());
		System.out.println(d7.toString());
		System.out.println(d8.toString());
		
		
		
		
	}
}
