package Recursion;

public class Power {

	public static void main(String[] args) {

		System.out.println(pow(9, 2));
	}

	public static int pow(int a, int b) {
		int power = 1;
		int i = 1;
		while (b >= i) {
			power = power * a;
			i++;
		}
		return power;

	}
}
