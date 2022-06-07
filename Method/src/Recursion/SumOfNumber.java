package Recursion;

public class SumOfNumber {

	public static void main(String[] args) {

		System.out.println(sum(100));
	}

	public static int sum(int n) {
		int i = 1;
		if (n <= i) {
			return 1;
		} else {
			return n + sum(n - 1);
		}
	}
}
