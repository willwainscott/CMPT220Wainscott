
public class MyInteger {

	public int value;
	
	public MyInteger() {}
	
	public MyInteger(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	public boolean isEven() {
		return this.value % 2 == 0;
	}
	
	public boolean isOdd() {
		return this.value % 2 != 0;
	}
	
	public boolean isPrime() {
		if (value == 2) return true;
		if (isEven()) return false;
		for (int i = 3; i * i <= value; i += 2) {
			if (value % i == 0) return false;
		}
		return true;
	}
	
	public static boolean isEven(int a){
		return a % 2 == 0;
	}
	
	public static boolean isOdd(int a) {
		return a % 2 != 0;
	}
	
	public static boolean isPrime(int a) {
		if (a == 2) return true;
		if (isEven(a)) return false;
		for (int i = 3; i * i <= a; i += 2) {
			if (a % i == 0) return false;
		}
		return true;
	}
	
	public static boolean isEven(MyInteger a){
		return isEven(a.getValue());
	}
	
	public static boolean isOdd(MyInteger a) {
		return isOdd(a.getValue());
	}
	
	public static boolean isPrime(MyInteger a) {
		return isPrime(a.getValue());
	}
	
	public boolean equals(int a) {
		return this.value == a;
	}
	
	public boolean equals(MyInteger a) {
		return equals(a.getValue());
	}
	
	public static int parseInt(char[] a) {
		String b = new String(a);
		return Integer.parseInt(b);
	}
	
	public static int parseInt(String a) {
		return Integer.parseInt(a);
	}
	
	
}
