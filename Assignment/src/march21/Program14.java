package march21;

public class Program14 {

	public static void main(String[] args) {

		int i = 1;
		int sum = 0;

		while (i <= 10) {
			if (i % 2 == 1) {
				sum = sum + i;
			}
			i++;
		}
		System.out.println(sum);
	}
}
