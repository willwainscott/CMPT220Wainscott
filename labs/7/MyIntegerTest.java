

public class MyIntegerTest {
	
	public static void main(String[] args) {
		
		MyInteger test = new MyInteger(10);
		MyInteger testTwo = new MyInteger(9);
		char[] charArray = {'1', '2', '3', '4'};
		String testString = "1234";
		
		System.out.println(test.getValue());
		System.out.println(test.isEven());
		System.out.println(test.isOdd());
		System.out.println(test.isPrime());
		System.out.println(MyInteger.isEven(10));
		System.out.println(MyInteger.isOdd(10));
		System.out.println(MyInteger.isPrime(10));
		System.out.println(MyInteger.isEven(test));
		System.out.println(MyInteger.isOdd(test));
		System.out.println(MyInteger.isPrime(test));
		System.out.println(test.equals(10));
		System.out.println(test.equals(9));
		System.out.println(test.equals(test));
		System.out.println(testTwo.equals(test));
		System.out.println(MyInteger.parseInt(charArray));
		System.out.println(MyInteger.parseInt(testString));
	}
}
