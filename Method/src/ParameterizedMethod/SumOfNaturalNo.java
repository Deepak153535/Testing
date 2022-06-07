package ParameterizedMethod;

import java.util.Scanner;

public class SumOfNaturalNo {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number");
		int a=s.nextInt();
		
		sum(a);
	}
	public static void sum(int a)
	{
		int i=1;
		int sum=0;
		while(i<=a)
		{
			sum=sum+i;
			i++;
		}
		System.out.println("Sum of "+a+" is  : "+sum);
	}
}
