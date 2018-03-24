
public class StackOfIntegers {
	
	private int[] elements;
	private int size;
	public static final int DEFAULT_CAPACITY = 16;
	
	public StackOfIntegers() {
		this(DEFAULT_CAPACITY);
	}
	
	public StackOfIntegers(int capacity) {
		elements = new int[capacity];
	}
	
	/* Pushes a new integer to the top of the stack */
	public void push(int value) {
		if (size >= elements.length) {
			int[] temp = new int[elements.length * 2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
		}
		
		elements[size++] = value;
	}
	
	/* returns and removes the top element form the stack */
	public int pop() {
		return elements[--size];
	}
	
	/* return the top element of the stack */
	public int peek() {
		return elements[size - 1];
	}
	
	
	public boolean empty() {
		return size == 0;
	}
	
	
	public int getSize() {
		return size;
	}
}
