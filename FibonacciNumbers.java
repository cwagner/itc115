
public class FibonacciNumbers {

	public static void main(String[] args) {
		computeFibonacci(12);
	}
	// prints the first n Fibonacci numbers
	public static void computeFibonacci(int n) {
		int lastNumber = 0;
		int currentNumber = 1;
		int tempNumber = 0; // temporary variable to store next number in the series
		for (int i = 0; i < n; i++) {
			System.out.println(currentNumber);
			tempNumber = currentNumber + lastNumber;
			lastNumber = currentNumber;
			currentNumber = tempNumber;
		}
	}
}
