
public class PowersOfN {

	public static void main(String[] args) {
		printPowersOfN(2, 7);
		printPowersOfN(5, 3);
	}
	
	public static void printPowersOfN(int base, int count) {
		//Loop starts at 0 and goes to count (inclusive), total number of loops will be count + 1
		for (int i = 0; i <= count; i++) {
			double power = Math.pow(base, i);
			System.out.print((int) power + " ");
		}
		System.out.println();
	}
}
