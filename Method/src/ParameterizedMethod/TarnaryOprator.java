package ParameterizedMethod;

import java.util.Scanner;

public class TarnaryOprator {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=s.nextInt();
		
		number(a);
	}
	public static void number(int a)
	{
		String out=(a%2==0)?"Number is even":"Number is odd";
		System.out.println(out);
	}
}
