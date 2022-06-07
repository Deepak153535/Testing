package march21;

public class Program16 {

	public static void main(String[] args) {

		int i = 35;
		int sum = 0;
		while (i >= 11) {
			if (i % 2 == 1) {
				// System.out.println("odd " + i);
				sum = sum + i;
			}
			i--;
		}
		System.out.println("sum is : " + sum);
	}
}
