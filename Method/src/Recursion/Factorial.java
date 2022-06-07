package Recursion;

public class Factorial {

	public static void main(String[] args) {

		System.out.println("Factorial is : " + test(5));

	}

	public static int test(int n) {
		int i = 1;
		if (n <= i) {
			return 1;
		} else {
			return n * test(n - 1);
		}
	}

}