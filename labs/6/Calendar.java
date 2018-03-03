import java.util.GregorianCalendar;

public class Calendar {

	public static void main(String[] args) {
		
		GregorianCalendar cal = new GregorianCalendar();
		
		System.out.print(cal.get(GregorianCalendar.MONTH) + "/");
		System.out.print(cal.get(GregorianCalendar.DAY_OF_MONTH) + "/");
		System.out.print(cal.get(GregorianCalendar.YEAR));
		
		cal.setTimeInMillis(1234567898765L);
		System.out.print("\n" + cal.get(GregorianCalendar.MONTH) + "/");
		System.out.print(cal.get(GregorianCalendar.DAY_OF_MONTH) + "/");
		System.out.print(cal.get(GregorianCalendar.YEAR));
	}
}
