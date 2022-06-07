package Recursion;

public class FibonacciSeries {

	public static void main(String[] args) {

		System.out.println(series(100));
	}

	public static int series(int a) {

		if (a < 0) {
			return 0;
		} else if (a == 0) {
			return 0;
		} else if (a == 1) {
			return 1;
		} else {
			return series(a - 1) + series(a - 2);
		}
	}
}
