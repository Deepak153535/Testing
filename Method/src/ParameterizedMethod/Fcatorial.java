package ParameterizedMethod;

import java.util.Scanner;

public class Fcatorial {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number :");
		int a=s.nextInt();
		
		factorial(a);
	}
	public static void factorial(int a)
	{
		int fact=1;
		int i=1;
		while(i<=a)
		{
			fact=fact*i;
			i++;
		}
		System.out.println("Fcatorial is : "+fact);
	}
}
