package ParameterizedMethod;

import java.util.Scanner;

public class NumberisPositive {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = s.nextInt();

		positive(number);
	}

	public static void positive(int a) {
		if (a > 0) {
			System.out.println("number is posittive");
		} else {
			System.out.println("number is negetive");
		}
	}
}
