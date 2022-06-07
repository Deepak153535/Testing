package march21;

public class Program15 {

	public static void main(String[] args) {

		int i = 20;
		int sum = 0;

		while (i >= 10) {
			if (i % 2 == 0) {
				// System.out.println(i);
				sum = sum + i;
			}
			i--;
		}
		System.out.println(sum);
	}
}
