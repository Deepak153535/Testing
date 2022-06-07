package Assignment;

public class Program60 {

	// 60.WAP TO PRINT SPECIAL NO B/W 10 AND 100.

	public static void main(String[] args) {

		int i = 10;
		while (i <= 100) {
			int n = i;
			int temp = n;
			int m = 1, sum = 0, c = 0;
			while (n > 0) {
				int rem = n % 10;
				m = m * rem;
				sum = sum + rem;
				n = n / 10;
			}
			c = m + sum;
			if (temp == c) {
				System.out.println(temp + " special");
			} else {
				System.out.println(temp + " not special");
			}

			i++;
		}
	}
}
